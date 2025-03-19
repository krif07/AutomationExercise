@login @all
Feature: Login User with correct and incorrect information

  Background:
    Given I access the automation exercise home page
    And I should see that home page is visible successfully
    When I Click on Signup Login button
    Then I should see login form title 'Login to your account' is visible

  @correct_login
  Scenario: Login User with correct email and password
    Given I enter a email krif07@gmail.com and password pass123
    When I Click on Login button
    Then I should see the logged in user name 'Cristian Fernando'

  @incorrect_login
  Scenario Outline: Login User with incorrect email and password
    Given I enter a email <email> and password <password>
    When I Click on Login button
    Then I should see that the error login message '<message>' is visible

    Examples:
    | email            | password  | message |
    | krif07@gmail.com | mipass123 | Your email or password is incorrect! |
    | krif@gmail.com   | pass123   | Your email or password is incorrect! |
    | krif@hotmail.com | mipass123 | Your email or password is incorrect! |

