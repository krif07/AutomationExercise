package com.automation.exercise.stepdefinitions.user;

import com.automation.exercise.pages.login.NewUserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewUserStepDefinitions {

    NewUserPage loginPage;

    public NewUserStepDefinitions() {
        loginPage = new NewUserPage();
    }

    @When("I enter a name {word} and email address {word}")
    public void enterNameAndEmail(String name, String email) {
        loginPage.enterNameAndEmail(name, email);
    }
    @When("I Click on Signup button")
    public void clickSignupButton() {
        loginPage.clickSignup();
    }
    @Then("I should see new user form title {string} is visible")
    public void shouldSeeTextVisible(String text) {
        Assert.assertEquals(loginPage.getSignupFormTitle(), text);
    }
}
