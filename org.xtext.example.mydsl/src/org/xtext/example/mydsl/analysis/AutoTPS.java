package org.xtext.example.mydsl.analysis;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.AndCondition;
import org.xtext.example.mydsl.myDsl.ShiftCondition;
import org.xtext.example.mydsl.myDsl.PrimaryCondition;
import org.xtext.example.mydsl.myDsl.Comparison;
import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.DifficultyCondition;
import org.xtext.example.mydsl.myDsl.OrCondition;

import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.Worker;
import org.xtext.example.mydsl.myDsl.Rule;
import org.xtext.example.mydsl.myDsl.SeniorityLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoTPS {

    private Model model;
    private Map< Worker, List<Task> > assignments = new HashMap<>();

    public AutoTPS(Model model) {
        this.model = model;
    }

    public void assignTasks() {
        List<Task> tasks = model.getTasks();
        List<Worker> workers = model.getWorkers();
        List<Rule> rules = model.getRules();

        // Task assignment logic
        for (Task task : tasks) {
            Worker assignedWorker = findWorkerForTask(task, workers, rules);
            
            if (assignedWorker != null) {
                // When a worker is assigned
                System.out.println(String.format("Task assignment to %s for task %s",
                	assignedWorker.getSeniority(),
                    assignedWorker.getName(),
                    task.getName(),
                    task.getStart().getHours(),
                    task.getStart().getMinutes(),
                    calculateEndTime(task)));
            } else {
                // Print the tasks and the time range
                System.out.println(String.format("%s not possible from %02d:%02d to %s", 
                    String.join(", ", task.getName()),
                    task.getStart().getHours(),
                    task.getStart().getMinutes(),
                    calculateEndTime(task)));
            }
        }
    }


    private Worker findWorkerForTask(Task task, List<Worker> workers, List<Rule> rules) {
        // rule-based worker assignment logic
        for (Rule rule : rules) {
            if (ruleMatchesTask(rule, task)) {
                Worker worker = findAvailableWorker(workers, rule.getAssign(), task);
                if (worker != null) {
                    return worker;
                }
            }
        }
        return null;
    }

    private boolean ruleMatchesTask(Rule rule, Task task) {
        // Get the condition from the rule
        Condition condition = rule.getCondition();

        // Evaluate the condition recursively
        return evaluateCondition(condition, task);
    }

    private boolean evaluateCondition(Condition condition, Task task) {
        if (condition instanceof OrCondition) {
            // Handle OR conditions
            OrCondition orCondition = (OrCondition) condition;
            return evaluateCondition(orCondition.getLeft(), task) || 
                   evaluateCondition(orCondition.getRight(), task);
        } else if (condition instanceof AndCondition) {
            // Handle AND conditions
            AndCondition andCondition = (AndCondition) condition;
            return evaluateCondition(andCondition.getLeft(), task) && 
                   evaluateCondition(andCondition.getRight(), task);
        } else if (condition instanceof Comparison) {
            // Handle comparison conditions
            return evaluateComparison((Comparison) condition, task);
        } else if (condition instanceof ShiftCondition) {
            // Handle shift conditions 
            return evaluateShiftCondition((ShiftCondition) condition, task);
        } else if (condition instanceof DifficultyCondition) {
            // Handle difficulty conditions
            return evaluateDifficultyCondition((DifficultyCondition) condition, task);
        } else if (condition instanceof PrimaryCondition) {
            // Handle other conditions
        	PrimaryCondition primary = (PrimaryCondition) condition;
            return evaluateCondition( primary.getInner(), task);  //?? Primary Condition
        } else {
        	throw new IllegalArgumentException("Unknown condition type: " + condition.getClass().getSimpleName());
        }
    }

    private boolean evaluateComparison(Comparison comparison, Task task) {
        int duration = comparison.getDuration();
        String operator = comparison.getOperator();
        
        int taskDuration = task.getDuration();
        switch (operator) {
            case ">":
                return taskDuration > duration;
            case "<":
                return taskDuration < duration;
            case ">=":
                return taskDuration >= duration;
            case "<=":
                return taskDuration <= duration;
            case "=":
                return taskDuration == duration;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private boolean evaluateShiftCondition(ShiftCondition shiftCondition, Task task) {
        String shift = shiftCondition.getShift().toString();
        
        //System.out.println(task.getStart().toString());
        
        String taskShift = getTaskShift(task.getStart().getHours(), task.getStart().getMinutes());

        return shift.equals(taskShift);
    }

    private boolean evaluateDifficultyCondition(DifficultyCondition difficultyCondition, Task task) {
        String difficulty = difficultyCondition.getDifficulty().toString();
        return difficulty.equals(task.getDifficulty().toString().toLowerCase());
    }

    private String getTaskShift(int h, int m) {
        // Parse the start time (HH:MM) and determine the shift
        //String[] parts = startTime.split(":");
        
        //System.out.print(parts);
        
        int hours = h;

        if (hours >= 6 && hours < 14) {
            return "dayshift";
        } else if (hours >= 14 && hours < 22) {
            return "eveningshift";
        } else {
            return "nightshift";
        }
    }

    private Worker findAvailableWorker(List<Worker> workers, SeniorityLevel seniorityLevel, Task task) {
        //  worker availability logic
        for (Worker worker : workers) {
            if (worker.getSeniority().equals(seniorityLevel) && worker.getIsActive().equals("True")) {
                // the worker is available during the time slot
            	if (isWorkerAvailable(worker, task)) {
                	return worker;
                }
            }
        }
        return null;
    }
    
    private boolean isWorkerAvailable(Worker worker, Task task) {
		//
    	List<Task> assignedTasks = assignments.getOrDefault(worker, new ArrayList<>());
    	for (Task assignedTask : assignedTasks) {
    		if (isOverlapping(assignedTask, task)) {
    			return false;
    		}
    	}
		return true;
	}

	private boolean isOverlapping(Task t1, Task t2) {
		String t1Start = t1.getStart().toString();
		String t2Start = t2.getStart().toString();
		String t1End = calculateEndTime(t1);
		String t2End = calculateEndTime(t2);
		
		return t1End.compareTo(t2Start) > 0 || t2End.compareTo(t1Start)> 0;		
	}

	private String calculateEndTime(Task task) {
        // Calculate the end time of the task based on its start time and duration
        //String[] parts = task.getStart().toString().split(":");
        int hours = task.getStart().getHours();
        int minutes = task.getStart().getMinutes();

        int durationHours = task.getDuration() / 60;
        int durationMinutes = task.getDuration() % 60;

        hours += durationHours;
        minutes += durationMinutes;

        if (minutes >= 60) {
            hours += 1;
            minutes -= 60;
        }

        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        // Load the TPS model 
        Model model = loadModel("src/data/tasks.mydsl");

        // Create and run the AutoTPS tool
        AutoTPS autoTPS = new AutoTPS(model);
        autoTPS.assignTasks();
    }

    private static Model loadModel(String filePath) {
    	MyDslStandaloneSetup.doSetup();
    	ResourceSet resourceSet = new ResourceSetImpl();
    	Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
    	if (resource.getContents().isEmpty()) {
            throw new IllegalStateException("Resource is empty: " + filePath);
        }
    	Model model = (Model) resource.getContents().get(0);
        return model; 
    }
}
