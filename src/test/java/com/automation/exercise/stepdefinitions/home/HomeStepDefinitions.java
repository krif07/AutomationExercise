package com.automation.exercise.stepdefinitions.home;

import com.automation.exercise.pages.home.HomePage;
import com.automation.exercise.questions.HomeQuestionTitle;
import com.automation.exercise.tasks.TaskHomeNavigate;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeStepDefinitions {

    private HomePage homePage;

    public HomeStepDefinitions() {
        homePage = new HomePage();
    }

    @Given("I access the automation exercise home page")
    public void accessAutomationExerciseHomePage() {
        TaskHomeNavigate homeNavigate = new TaskHomeNavigate();
        homeNavigate.goToHomePage();
    }
    @When("I Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        homePage.clickSignupLogin();
    }
    @Then("I should see that home page is visible successfully")
    public void shouldSeeHomePageVisible() {
        Assert.assertEquals(homePage.getTitle(), "Automation");
    }
}
