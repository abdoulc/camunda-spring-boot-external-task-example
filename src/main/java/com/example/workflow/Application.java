package com.example.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.net.URI;

import org.camunda.bpm.client.ExternalTaskClient;

@SpringBootApplication
public class Application {
  private final static Logger LOGGER = Logger.getLogger(Application.class.getName());

  public static void main(String... args) {

    SpringApplication.run(Application.class, args);
  }

}