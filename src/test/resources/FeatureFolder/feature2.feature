Feature: Test registration Functionality

Scenario: Test Registration with Valid Inputs
Given user launches chrome browser 
When user navigates to registration page
And user enters with username as "saranyashanmugam"
And user enters with password as "password@1" 
And user enters with confirm password as "password@1"
And user clicks on Submit button
Then verfiy registration success

