package com.automation.exercise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.automation.exercise")
@PropertySource("classpath:/config.properties")
public class CucumberSpringConfiguration {
}
