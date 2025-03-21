package com.automation.exercise.questions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.automation.exercise.utils.ReadProperties.getWaitTimeOut;
import static com.automation.exercise.driver.DriverFactory.getDriver;

public class QuestionBase {
    private static WebDriverWait wait;

    public static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(getWaitTimeOut()));
    }
}
