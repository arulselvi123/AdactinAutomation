Feature: Automation Practise application end to end testing
Test scenarios includes Login, Search, order selection,... etc

Scenario:  Verify the login functionality of the application
Given User launch the automation practice application
When User click on the Signin button in the header
And User enter the email address in the authentication page
And User enter the password in the authentication page
And User click on the signIn button
Then User verify the username in the header 

Scenario: Verify the order selection from the application Menu button
When User mouse hover on the Women Menu
And  User click on the Blouses option
Then User Verify the Blouse result in the header

Scenario: Verify the Size of the Blouse in the Blouse page
When User click the M Size of the blouse

Scenario: Verify the color of the Blouse in the Blouse page
When User click the White color of the blouse

Scenario: Verify the Compositions of the Blouse in the Blouse page
When User click the cotton composition of the blouse

Scenario: Verify the Style of the Blouse in the Blouse page
When User click the Casual style of the blouse

Scenario: Verify the Properties of the Blouse in the Blouse page
When User click the Short Sleeve of the blouse


Scenario: Verify the Availability of the Blouse in the Blouse page
When User click the In-Stock check-box of the blouse

Scenario: Verify the Manufacturer of the Blouse in the Blouse page
When User click the Fashion Manufacturer of the blouse

Scenario: Verify the Condition of the Blouse in the Blouse page
When User click the New Condition of the blouse

Scenario:Verify the Delivery information of the application
When User click on the Delivery option
Then User verify the Delivery result in the next page header 

Scenario:Verify the Legal Notice of the application
When User click on the Legal Notice option
Then User verify the Legal Noticeresult in the next page header 

Scenario:Verify the Terms and Conditions of the application
When User click on the Terms and Conditions option
Then User verify the Terms and Conditions result in the next page header 

Scenario:Verify the About us of the application
When User click on the About us option
Then User verify the About us result in the next page header 

Scenario:Verify the Secure Payment of the application
When User click on the Secure Payment option
Then User verify the Secure Payment result in the next page header 

Scenario:Verify the Our stores of the application
When User click on the Our stores option
Then User verify the Our stores result in the next page header 



