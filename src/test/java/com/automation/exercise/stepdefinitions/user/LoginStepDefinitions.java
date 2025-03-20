package com.automation.exercise.stepdefinitions.user;

import com.automation.exercise.pages.login.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefinitions {

    private LoginPage loginPage;

    public LoginStepDefinitions(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @When("I enter a email {word} and password {word}")
    public void enterEmailAndPassword(String email, String password) {
        loginPage.enterEmailAndPassword(email, password);
    }
    @When("I Click on Login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }
    @Then("I should see login form title {string} is visible")
    public void shouldSeeLoginFormTitleVisible(String text) {
        Assert.assertEquals(loginPage.getLoginFormTitle(), text);
    }
    @Then("I should see that the error login message {string} is visible")
    public void shouldSeeErrorLoginMessageVisible(String message) {
        Assert.assertEquals(loginPage.getErrorMessage(), message);
    }
}
