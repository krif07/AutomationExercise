package com.automation.exercise.stepdefinitions.user;

import com.automation.exercise.pages.login.NewUserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewUserStepDefinitions {

    private NewUserPage newUserPage;

    public NewUserStepDefinitions(NewUserPage newUserPage) {
        this.newUserPage = newUserPage;
    }

    @When("I enter a name {word} and email address {word}")
    public void enterNameAndEmail(String name, String email) {
        newUserPage.enterNameAndEmail(name, email);
    }
    @When("I Click on Signup button")
    public void clickSignupButton() {
        newUserPage.clickSignup();
    }
    @Then("I should see new user form title {string} is visible")
    public void shouldSeeTextVisible(String text) {
        Assert.assertEquals(newUserPage.getSignupFormTitle(), text);
    }
}
