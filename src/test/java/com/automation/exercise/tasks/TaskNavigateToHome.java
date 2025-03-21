package com.automation.exercise.tasks;

import com.automation.exercise.utils.ReadProperties;
import com.automation.exercise.pages.BasePage;

public class TaskNavigateToHome extends BasePage {
    public void navigate() {
        navigateToUrl(ReadProperties.getURL());
    }

}
