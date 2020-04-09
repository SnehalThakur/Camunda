package org.camunda.servlet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class WeatherDeligate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Random random = new Random();
        delegateExecution.setVariable("name","Snehal");
        delegateExecution.setVariable("weatherOk", random.nextBoolean());
    }
}
