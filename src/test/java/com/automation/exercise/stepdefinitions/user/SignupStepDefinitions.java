package com.automation.exercise.stepdefinitions.user;

import com.automation.exercise.pages.login.SignupPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SignupStepDefinitions {

    private SignupPage signupPage;

    public SignupStepDefinitions(SignupPage signupPage) {
        this.signupPage = signupPage;
    }

    @Then("I should see that {string} is visible")
    public void shouldSeeTitleVisible(String title) {
        Assert.assertEquals(signupPage.getTitle(), title);
    }
}