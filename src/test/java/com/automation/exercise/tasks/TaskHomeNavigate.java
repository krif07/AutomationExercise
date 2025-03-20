package com.automation.exercise.tasks;

import com.automation.exercise.config.ReadProperties;
import com.automation.exercise.pages.BasePage;

public class TaskHomeNavigate extends BasePage {
    public void goToHomePage() {
        navigateToUrl(ReadProperties.getURL());
    }

}
