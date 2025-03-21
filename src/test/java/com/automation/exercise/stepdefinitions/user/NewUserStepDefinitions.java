package com.automation.exercise.stepdefinitions.user;

import com.automation.exercise.pages.login.NewUserPage;
import com.automation.exercise.tasks.TaskNavigateToNewUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewUserStepDefinitions {

    private NewUserPage newUserPage;
    private TaskNavigateToNewUser navigateToNewUser;

    public NewUserStepDefinitions(NewUserPage newUserPage, TaskNavigateToNewUser navigateToNewUser) {
        this.newUserPage = newUserPage;
        this.navigateToNewUser = navigateToNewUser;
    }
    @When("I access the automation exercise new user page")
    public void accessAutomationExerciseSignupPage() {
        navigateToNewUser.navigate();
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
