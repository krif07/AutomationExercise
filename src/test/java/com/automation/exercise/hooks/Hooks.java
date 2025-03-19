package com.automation.exercise.hooks;

import com.automation.exercise.config.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.automation.exercise.driver.DriverFactory.cleanupDriver;
import static com.automation.exercise.driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        ReadProperties.setupProperties();
        getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {

        }
        cleanupDriver();
    }
}
