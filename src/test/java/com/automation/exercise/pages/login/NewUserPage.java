package com.automation.exercise.pages.login;

import com.automation.exercise.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserPage extends BasePage {

    @FindBy(css = ".signup-form h2")
    private WebElement SIGNUP_FORM_TITLE_H2;

    @FindBy(css = ".signup-form input[name=name]")
    private WebElement SIGNUP_FORM_NAME_INPUT;

    @FindBy(css = ".signup-form input[name=email]")
    private WebElement SIGNUP_FORM_EMAIL_INPUT;

    @FindBy(css = "button[data-qa=signup-button]")
    private WebElement SIGNUP_FORM_SIGNUP_BUTTON;

    public String getSignupFormTitle() {
        return getText(SIGNUP_FORM_TITLE_H2);
    }
    public void enterNameAndEmail(String name, String email) {
        enterText(SIGNUP_FORM_NAME_INPUT, name);
        enterText(SIGNUP_FORM_EMAIL_INPUT, email);
    }
    public void clickSignup() {
        click(SIGNUP_FORM_SIGNUP_BUTTON);
    }
}
