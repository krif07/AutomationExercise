package com.automation.exercise.stepdefinitions.home;

import com.automation.exercise.pages.home.HomePage;
import com.automation.exercise.tasks.TaskNavigateToHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeStepDefinitions {

    private HomePage homePage;
    private TaskNavigateToHome homeNavigate;

    public HomeStepDefinitions(HomePage homePage, TaskNavigateToHome homeNavigate) {
        this.homePage = homePage;
        this.homeNavigate = homeNavigate;
    }

    @Given("I access the automation exercise home page")
    public void accessAutomationExerciseHomePage() {
        homeNavigate.navigate();
    }
    @When("I Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        homePage.clickSignupLogin();
    }
    @Then("I should see that home page is visible successfully")
    public void shouldSeeHomePageVisible() {
        Assert.assertEquals(homePage.getTitle(), "Automation");
    }
    @Then("I should see the logged in user name {string}")
    public void shouldSeeLoggedInUser(String name) {
        Assert.assertEquals(homePage.getLoggedInUserName(), name);
    }
}
