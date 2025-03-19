@register @all
Feature: Register a user with correct and incorrect data

  Scenario: Register User
    Given I access the automation exercise home page
    And I should see that home page is visible successfully
    When I Click on Signup Login button
    And I should see new user form title 'New User Signup!' is visible
    And I enter a name Cristian and email address krif07@hotmail.com
    And I Click on Signup button
    Then I should see that 'ENTER ACCOUNT INFORMATION' is visible

#  9. Fill details: Title, Name, Email, Password, Date of birth
#  10. Select checkbox 'Sign up for our newsletter!'
#  11. Select checkbox 'Receive special offers from our partners!'
#  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#  13. Click 'Create Account button'
#  14. Verify that 'ACCOUNT CREATED!' is visible
#  15. Click 'Continue' button
#  16. Verify that 'Logged in as username' is visible
#  17. Click 'Delete Account' button
#  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  Scenario: Register User with existing email
    Given I access the automation exercise home page