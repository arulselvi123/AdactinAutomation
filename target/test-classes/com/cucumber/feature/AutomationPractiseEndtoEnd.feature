Feature: Automation Practise application end to end testing
        test scenarios includes Login,search,order selecting
        
Scenario: Verify the Login functionality of the application
Given User Launch the automation practise application
When User click on the sigin button in the header
And User enter the email address in the Authentication Page
And User enter the password in the Authentication Page
And User click on the sigin button
Then User verify the username in the header

  
Scenario:  Verfiy the search functionality of the application
Given User enters the product name on the search field
And User clicked the search button
Then User verify the search result on the search header field


Scenario: User places the order of the searched item 
Given User mouseover to printed summer dress
When User click on the More button on the Quickview page
And User add two quantites of the item
And User select the dress size to Medium
And User click on the Add to Cart button
And User click on the Proceed to checkout on the popup page
And User click on the Proceed to checkout on the Summary page
And User click on the Proceed to checkout on the Address page
And User click on the checkin box on the shipping page
And User click on the Proceed to checkout on the Shipping page
And User click on the pay by bank wire
And User click on the I confirm my order on the payment page
Then User verify the Confirmation result on the payment page 

