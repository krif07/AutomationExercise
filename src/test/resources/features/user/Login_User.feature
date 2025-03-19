@login @all
Feature: Login User with correct and incorrect information

  Scenario: Login User with incorrect email and password
    Given I access the automation exercise home page
    And I should see that home page is visible successfully
    When I Click on Signup Login button
    And I should see login form title 'Login to your account' is visible
    And I enter a email krif@mail.com and password mipassword123
    And I Click on Login button
    Then I should see that the error login message 'Your email or password is incorrect!' is visible
