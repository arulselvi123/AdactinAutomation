@demo
Feature: Automation Practise application end to end testing
        test scenarios includes Login,search,order selecting
        
Scenario Outline: Verify the Login functionality of the application
Given User Launch the automation practise application
When User click on the sigin button in the header
And User enter the "<Username>" in the email address field
And User enter the "<Password>" in the password field
And User click on the sigin button
And User click on the signout button
Examples:
|Username        |Password|
|arjun@gmail.com |123456|
|arjunn@gmail.com|123456|