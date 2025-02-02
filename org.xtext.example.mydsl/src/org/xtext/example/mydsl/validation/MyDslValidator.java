/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;

import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.Worker;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * This class validates the TPS model:
 * - Ensures unique task IDs.
 * - Validates task difficulty, duration, and start time.
 * - Validates worker seniority level and ensures unique employee numbers.
 */
public class MyDslValidator extends AbstractMyDslValidator {

    // Rule to check unique Task ID
    @Check
    public void checkUniqueTaskID(Model model) {
        Set<String> taskIds = new HashSet<>();
        for (Task task : model.getTasks()) {
            if (!taskIds.add(task.getName())) {
                warning("Task ID already exists: " + task.getName(), 
                        MyDslPackage.Literals.TASK__NAME);
            }
        }
    }

    // Rule to validate Task Difficulty
    @Check
    public void checkValidDifficulty(Task task) {
        if (task.getDifficulty() == null) {
            error("Difficulty level cannot be null.", 
                  MyDslPackage.Literals.TASK__DIFFICULTY);
        } else {
            String difficulty = task.getDifficulty().toString().toLowerCase();
            if (!difficulty.equals("easy") && !difficulty.equals("moderate") && !difficulty.equals("hard")) {
                error("Invalid difficulty level. Valid values are: easy, moderate, hard.", 
                      MyDslPackage.Literals.TASK__DIFFICULTY);
            }
        }
    }

    // Rule to validate duration (15-240 min)
    @Check
    public void checkValidDuration(Task task) {
        int duration = task.getDuration();
        if (duration < 15 || duration > 240) {
            error("Duration must be between 15 and 240 minutes.", 
                  MyDslPackage.Literals.TASK__DURATION);
        }
    }

 // Rule to validate start time format (HH:MM)
    @Check
    public void checkValidStartTime(Task task) {
        int hours = task.getStart().getHours();
        int minutes = task.getStart().getMinutes();
        
        // Validate hours (0-23) and minutes (0-59)
        boolean invalidHours = hours < 0 || hours >= 24;
        boolean invalidMinutes = minutes < 0 || minutes >= 60;
        
        if (invalidHours || invalidMinutes) {
            StringBuilder message = new StringBuilder();
            if (invalidHours) {
                message.append("Invalid hour (" + hours + "). Must be 0-23. ");
            }
            if (invalidMinutes) {
                message.append("Invalid minute (" + minutes + "). Must be 0-59.");
            }
            error(message.toString().trim(), 
                 MyDslPackage.Literals.TASK__START, 
                 "INVALID_TIME_FORMAT");
        }
    }

    // Rule to validate seniority level
    @Check
    public void checkValidSeniorityLevel(Worker worker) {
        if (worker.getSeniority() == null) {
            error("Seniority level cannot be null.", 
                  MyDslPackage.Literals.WORKER__SENIORITY);
        } else {
            String seniority = worker.getSeniority().toString().toLowerCase();
            if (!seniority.equals("trainee") && !seniority.equals("junior") && !seniority.equals("senior")) {
                error("Invalid seniority level. Valid values are: trainee, junior, senior.", 
                      MyDslPackage.Literals.WORKER__SENIORITY);
            }
        }
    }

    // Rule to check unique employee ID
    @Check 
    public void checkUniqueEmployeeID(Worker worker) { //can't access the top model directly
        // get curr model
        Model model = (Model)worker.eContainer();
        // duplicated employee number
        long count = model.getWorkers().stream().filter(w -> w.getEmployeeNumber() == worker.getEmployeeNumber()).count();

        if (count > 1) {
            error("Employee number " + worker.getEmployeeNumber() + " has exists.",
                  MyDslPackage.Literals.WORKER__EMPLOYEE_NUMBER,
                  "DUPLICATE_EMPLOYEE_ID");
        }
    }
}