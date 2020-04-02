Feature: Test registration Functionality

Scenario: Test Registration with Valid Inputs
Given user launches chrome browser 
When user navigates to registration page
And user enters with username
And user enters with password
And user enters with confirm password
And user clicks on Submit button
Then verfiy registration success

