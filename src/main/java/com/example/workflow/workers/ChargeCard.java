package com.example.workflow.workers;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
@ExternalTaskSubscription("charge-card")
public class ChargeCard implements ExternalTaskHandler {
    private final static Logger logger = LoggerFactory.getLogger(ChargeCard.class);
    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        logger.info("Debut-");

        String item = externalTask.getVariable("item");
        Integer amount = externalTask.getVariable("amount");

        logger.info("Charging credit card with an amount of '" + amount + "'€ for the item '" + item + "'...");

        /*try {
            Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // Complete the task
        externalTaskService.complete(externalTask);
    }
}
