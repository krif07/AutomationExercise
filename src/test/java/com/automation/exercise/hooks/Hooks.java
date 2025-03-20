package com.automation.exercise.hooks;

import com.automation.exercise.config.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static com.automation.exercise.driver.DriverFactory.cleanupDriver;
import static com.automation.exercise.driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        ReadProperties.setupProperties();
        getDriver();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed() || ReadProperties.getTakePictures().equals("EVERY_STEP")) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", timeMilliseconds);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        cleanupDriver();
    }
}
