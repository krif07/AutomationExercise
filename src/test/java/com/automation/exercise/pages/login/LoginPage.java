package com.automation.exercise.pages.login;

import com.automation.exercise.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = ".login-form h2")
    private WebElement FORM_TITLE_H2;

    @FindBy(css = ".login-form input[type=email]")
    private WebElement FORM_EMAIL_INPUT;

    @FindBy(css = ".login-form input[type=password]")
    private WebElement FORM_PASSWORD_INPUT;

    @FindBy(css = ".login-form button")
    private WebElement FORM_LOGIN_BUTTON;

    @FindBy(css = ".login-form p")
    private WebElement FORM_ERROR_MESSAGE_P;

    public LoginPage() {
        super();
    }
    public void enterEmailAndPassword(String email, String password) {
        enterText(FORM_EMAIL_INPUT, email);
        enterText(FORM_PASSWORD_INPUT, password);
    }
    public void clickLogin() {
        click(FORM_LOGIN_BUTTON);
    }
    public String getLoginFormTitle() {
        return getText(FORM_TITLE_H2);
    }
    public String getErrorMessage() {
        return getText(FORM_ERROR_MESSAGE_P);
    }
}
