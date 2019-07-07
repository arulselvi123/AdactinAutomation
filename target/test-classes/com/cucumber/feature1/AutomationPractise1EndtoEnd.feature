 Feature: Automation Practise application end to end testing
        test scenarios includes Login,search,order selecting
        
Scenario: Verify the Login functionality of the application
Given User Launch the automation practise application
When User click on the sigin button in the header
And User enter the "arjun@gmail.com" in the email address field
And User enter the "123456" in the password field
And User click on the sigin button


  
Scenario: User ordered the Summer dresses
Given User mouse overed to the Dresses field
When User click on the summer dresses field
And User click on the Medium size check button
And User click on the black color field
And User click on the Polyester check in field
And User click on the casual under the style field
And User click on the Maxi dress field
And User click on the Instock field
And User click on the Fashion Manufacturer
And User click on the new Condition field

