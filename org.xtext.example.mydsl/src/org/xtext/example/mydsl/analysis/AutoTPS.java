package org.xtext.example.mydsl.analysis;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.xtext.example.mydsl.MyDslStandaloneSetup;

import org.xtext.example.mydsl.myDsl.Model;

public class AutoTPS {
    public static void main(String[] args) {
        // Load the TPS model 
        Model model = loadModel("src/data/tasks.mydsl");

        model.evaluate();
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