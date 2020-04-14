package com.camunda.task_poc_demo.customDelegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("approveTask")
public class ApproveDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Message is Approved");
    }
}
