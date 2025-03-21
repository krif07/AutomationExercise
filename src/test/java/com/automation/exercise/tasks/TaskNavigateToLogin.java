package com.automation.exercise.tasks;

import com.automation.exercise.config.ReadProperties;
import com.automation.exercise.pages.BasePage;

public class TaskNavigateToLogin extends BasePage {
    public void navigate() {
        navigateToUrl(ReadProperties.getURL() + "/login");
    }
}
