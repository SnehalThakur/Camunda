package com.camunda.task_poc_demo.customDelegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("rejectTask")
public class RejectionDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Message is rejected");
    }
}
