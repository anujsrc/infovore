package com.ontology2.haruhi.flows;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;
import com.ontology2.haruhi.MavenManagedJar;

/**
 * A SpringFlow processes creates a series of SpringSteps,  for each SpringStep
 * the system will parse the arguments with SPeL
 * 
 * I'd like to substitute the arguments of flowArgs into variables like
 * 
 * $0, $1, $2
 * 
 * and (in the future) pass in named arguments.
 *
 */

public class SpringFlow extends Flow {

    private final List<FlowStep> springSteps;
    
    public SpringFlow(List<FlowStep> springSteps) {
        this.springSteps = springSteps;
    }
    
    public SpringFlow(FlowStep... springSteps) {
        this(Arrays.asList(springSteps));
    }

    @Override
    public List<FlowStep> generateSteps(List<String> flowArgs) {
        List <FlowStep> result=Lists.newArrayList();
        result.addAll(springSteps);
        return result;
    }
}
