Feature: Test registration Functionality

Scenario Outline: Test Registration with Valid Inputs
Given user launches chrome browser 
When user navigates to registration page
And user enters with username as "<username>"
And user enters with password as "<password>"
And user enters with confirm password as "<confirmpassword>"
And user clicks on Submit button
Then verfiy registration success

Examples:
#data table - provide different set of test data
|username|password|confirmpassword|
|saranya|password@1|password@1|
|shanmugam|password@2|password@2|
|john|hp|hp|

