Feature: Create account of Facebook1
As a user u need to open facebook home page and do the validations


Background: common login steps11
Given User need to be on Facebook login page

Scenario: Validate First Name field
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser



Scenario: Validate create user multiple fields12
When User enters user "Ryan" first name 
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present 
Then User Mobile field should be blank
Then close browser



