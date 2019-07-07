Feature: Adactin application end to end testing
Test scenarios includes Login, Search,... etc

@TC_101
Scenario: To verify valid login details
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header

@TC_102
Scenario: To verify whether the check-out date field accepts a later date than checkin date
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "14/07/2019"
And Enter check-out-date as "12/06/2019"
And User click the search button
Then Verify that system gives an error saying "Check-In Date shall be before than Check-Out Date"

@TC_103 @Ignore
Scenario: To check if error is reported if check-out date field is in the past 
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "21/06/2019"
And Enter check-out-date as "23/06/2019"
And User click the search button
Then Verify that system gives an error saying "Enter valid details"

@TC_104
Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And Select No-of-children "1 - One"
And User click the search button
Then Verify that hotel displayed is the same as selected in search Hotel form

@TC_105
Scenario: To verify whether Check-indate and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
Then Verify Check-in-date and check-outdate should be displayed according to the data entered in search hotel form

@TC_106
Scenario: To verify whether no.of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
Then Verify the No-of-rooms should be displayed and match with number of rooms in search hotel page

@TC_107
Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
Then Verify the Room type displayed should be the same as selected in search hotel page

@TC_108
Scenario: To verify whether the total price(excl.GST) is calculated as “price per night * no. of nights* no of rooms”
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
Then Verify that totalprice(excl.GST) is being calculated as (price-per-night*noof-rooms*no-of-days)

@TC_109
Scenario: To verify when pressed, logout button logs out from the application.
And User Select location as "Sydney"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "1 - One"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Enter the details and click on book now
Then Check the details, click on logout and verify we have been logged out of the application

@TC_110
Scenario: To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
And User clicks Sign-in again
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
Then Verify that total-price is being calculated as (price-pernight* no-ofrooms* no-of-days + 10% GST”)

@TC_111
Scenario: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
Then Data should be same as selected in previous screen

@TC_112
Scenario: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
Then Verify that total-price is being calculated as (price-pernight* no-ofrooms* no-of-days)

@TC_113
Scenario: To verify whether the data displayed is same as the selected data in Book hotel page
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Verify that total-price is being calculated as (price-pernight* no-ofrooms* no-of-days)
Then verify whether the data displayed is same as the selected data in Book hotel page

@TC_114
Scenario: Verify Order number is generated in booking confirmation page
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Verify that total-price is being calculated as (price-pernight* no-ofrooms* no-of-days)
Then ORDER no should be generated

@TC_115
Scenario: To verify whether the booked itinerary details are not editable.
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Fill the form and click on Book now button
And Click on My itinerary button
Then Verify that the details are not editable

@TC_116
Scenario: To check whether the booked itinerary reflects the correct information in line with the booking.
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Fill the form and click on Book now button
And Click on My itinerary button
Then Verify that the details are reflected correctly as per the booking

@TC_117
Scenario: To check whether “search order id” query is working and displaying the relevant details.
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
And Click on booked itinerary button
And Enter the order id
Then Verify that the relevant details are displayed

@TC_118
Scenario: Verify that all the details of newly generated order number in booked itinerary page are correct and match with data during booking.
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Fill the form and click on Book now button
And Click on booked itinerary button
And Search for Order number
Then Verify all the details of order number are correct as entered during saving order

@TC_119
Scenario: To verify that the order gets cancelled after click on Cancel order number link
Given User launch the adactin application using "http://adactin.com/HotelApp/index.php" url 
And User enter the UserID "Teja1210" in the home page
And User enter the password "tejaadactin" in the home page
And User click on the Login button
Then User verify the text "Welcome to AdactIn Group of Hotels" in the header
And User Select location as "Melbourne"
And User Select hotel as "Hotel Creek"
And User Select room type as "Standard"
And User Select no-of-rooms as "2 - Two"
And Enter check-in-date as "02/07/2019"
And Enter check-out-date as "30/07/2019"
And Select No-of-adults "1 - One"
And User click the search button
And User select the hotel
And User click on the continue button
And Fill the form and click on Book now button
And Click on booked itinerary button
And Search for Order number
And Click on Cancel "12345"
And Click Yes on pop-up which asks where to cancel order or not
Then Verify that order number is cancelled and now longer exists in Booked Itinerary page

@TC_120 @Ignore
Scenario: To Verify Title of every Page reflects what the page objectives