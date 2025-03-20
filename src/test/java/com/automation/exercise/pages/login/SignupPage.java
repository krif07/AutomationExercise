package com.automation.exercise.pages.login;

import com.automation.exercise.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    @FindBy(css = ".login-form > h2")
    private WebElement SIGNUP_FORM_TITLE;

    public SignupPage() {
        super();
    }

    public String getTitle() {
        return getText(SIGNUP_FORM_TITLE);
    }
}
