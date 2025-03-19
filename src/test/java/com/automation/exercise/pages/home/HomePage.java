package com.automation.exercise.pages.home;

import com.automation.exercise.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//div[@class='carousel-inner']//span)[1]")
    private WebElement TITLE_SPAN;

    @FindBy(xpath = "//i[@class='fa fa-lock']/..")
    private WebElement SIGNUP_LOGIN_BUTTON;

    public String getTitle() {
        return getText(TITLE_SPAN);
    }
    public void clickSignupLogin() {
        click(SIGNUP_LOGIN_BUTTON);
    }
}
