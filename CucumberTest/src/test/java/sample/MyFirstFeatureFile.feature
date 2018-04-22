Feature: Testing facebook login pagee
As a new user I want to validate facebook login page.


Scenario: Validate Facebook new user creation
Given Open Facebook home Page
When User enters First Name
And User enters Last Name
Then User Checks that User Name is properly Entered
But Surname field should remain blank
