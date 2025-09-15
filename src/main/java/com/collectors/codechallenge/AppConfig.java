package com.collectors.codechallenge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author NaveenWodeyar
 *
 */

@Component
public class AppConfig {

 @Value("${app.name:DefaultAppName}")
 private String appName;

 @Value("${app.version:0.0.1}")
 private String version;

 @Value("${app.description:No description provided.}")
 private String description;

 public void printValues() {
     System.out.println("Application Name: " + appName);
     System.out.println("Version: " + version);
     System.out.println("Description: " + description);
 }
}
