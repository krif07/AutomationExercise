package com.automation.exercise.tasks;

import com.automation.exercise.config.ReadProperties;

import static com.automation.exercise.driver.DriverFactory.getDriver;

public class TaskHomeNavigate {
    public void goToHomePage() {
        getDriver().get(ReadProperties.getURL());
    }

}
