$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinAutomationEndtoEnd.feature");
formatter.feature({
  "line": 1,
  "name": "AdactIn Automation End to End testing",
  "description": "Test scenarios includes Login, Check-In \u0026 Check-Out date",
  "id": "adactin-automation-end-to-end-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 172,
  "name": "To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-hotel-name,-location,-room-type,-total-day,-price-per-night-are-same-in-booking-confirmation-page-as-they-were-selected-in-previous-screen",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 171,
      "name": "@TC-11"
    }
  ]
});
formatter.step({
  "line": 173,
  "name": "User launch the AdactIn Hotel Reservation application using URL as in the test data",
  "keyword": "Given "
});
formatter.step({
  "line": 174,
  "name": "User enter the User-name in the welcome page",
  "keyword": "When "
});
formatter.step({
  "line": 175,
  "name": "User enter the Password in the welcome page",
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "User click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "User select the Location  \u0027\u003cLocation\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 178,
  "name": "User select the hotel  \u0027\u003cHotel Name\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 179,
  "name": "User select Room type  \u0027\u003cRoom Type\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "User select the Number of Rooms  \u0027\u003cNo Of Rooms\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 181,
  "name": "User select the Check-in-Date as \"25/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 182,
  "name": "User select the Check-out-Date as \"26/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 183,
  "name": "User select the Adult per Room as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 184,
  "name": "User click on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 185,
  "name": "User click on the Radio Button to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 186,
  "name": "User click on the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "Verify the total data are same in booking confirmation page \u0027\u003cLocation\u003e\u0027 \u0027\u003cHotel Name\u003e\u0027 \u0027\u003cRoom Type\u003e\u0027 \u0027\u003cPrice Per Night\u003e\u0027 \u0027\u003cNo Of Days\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "line": 189,
  "name": "",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-hotel-name,-location,-room-type,-total-day,-price-per-night-are-same-in-booking-confirmation-page-as-they-were-selected-in-previous-screen;",
  "rows": [
    {
      "cells": [
        "No Of Rooms",
        "Location",
        "Hotel Name",
        "Room Type",
        "Price Per Night",
        "No Of Days"
      ],
      "line": 190,
      "id": "adactin-automation-end-to-end-testing;to-check-hotel-name,-location,-room-type,-total-day,-price-per-night-are-same-in-booking-confirmation-page-as-they-were-selected-in-previous-screen;;1"
    },
    {
      "cells": [
        "2",
        "\"Sydney\"",
        "\"Hotel Creek\"",
        "\"Standard\"",
        "\"AUD $ 125\"",
        "1"
      ],
      "line": 191,
      "id": "adactin-automation-end-to-end-testing;to-check-hotel-name,-location,-room-type,-total-day,-price-per-night-are-same-in-booking-confirmation-page-as-they-were-selected-in-previous-screen;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 191,
  "name": "To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-hotel-name,-location,-room-type,-total-day,-price-per-night-are-same-in-booking-confirmation-page-as-they-were-selected-in-previous-screen;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 171,
      "name": "@TC-11"
    }
  ]
});
formatter.step({
  "line": 173,
  "name": "User launch the AdactIn Hotel Reservation application using URL as in the test data",
  "keyword": "Given "
});
formatter.step({
  "line": 174,
  "name": "User enter the User-name in the welcome page",
  "keyword": "When "
});
formatter.step({
  "line": 175,
  "name": "User enter the Password in the welcome page",
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "User click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "User select the Location  \u0027\"Sydney\"\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 178,
  "name": "User select the hotel  \u0027\"Hotel Creek\"\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 179,
  "name": "User select Room type  \u0027\"Standard\"\u0027",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "User select the Number of Rooms  \u00272\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 181,
  "name": "User select the Check-in-Date as \"25/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 182,
  "name": "User select the Check-out-Date as \"26/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 183,
  "name": "User select the Adult per Room as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 184,
  "name": "User click on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 185,
  "name": "User click on the Radio Button to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 186,
  "name": "User click on the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "Verify the total data are same in booking confirmation page \u0027\"Sydney\"\u0027 \u0027\"Hotel Creek\"\u0027 \u0027\"Standard\"\u0027 \u0027\"AUD $ 125\"\u0027 \u00271\u0027",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_launch_the_AdactIn_Hotel_Reservation_application_using_URL_as_in_the_test_data()"
});
formatter.result({
  "duration": 2600682575,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enter_the_User_name_in_the_welcome_page()"
});
formatter.result({
  "duration": 1113316648,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enter_the_Password_in_the_welcome_page()"
});
formatter.result({
  "duration": 782938221,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Login_button()"
});
formatter.result({
  "duration": 1556060660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 28
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Location(String)"
});
formatter.result({
  "duration": 625952089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 25
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_hotel(String)"
});
formatter.result({
  "duration": 523184019,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 25
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_Room_type(String)"
});
formatter.result({
  "duration": 536784206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 34
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Number_of_Rooms(int)"
});
formatter.result({
  "duration": 2107389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25/06/2019",
      "offset": 34
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Check_in_Date_as(String)"
});
formatter.result({
  "duration": 942999225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26/06/2019",
      "offset": 35
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Check_out_Date_as(String)"
});
formatter.result({
  "duration": 849115033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 35
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Adult_per_Room_as(String)"
});
formatter.result({
  "duration": 518531341,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Search_button()"
});
formatter.result({
  "duration": 1826566652,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Radio_Button_to_select_the_hotel()"
});
formatter.result({
  "duration": 749462206,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Continue_Button()"
});
formatter.result({
  "duration": 1871411622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 62
    },
    {
      "val": "Hotel Creek",
      "offset": 73
    },
    {
      "val": "Standard",
      "offset": 89
    },
    {
      "val": "AUD $ 125",
      "offset": 102
    },
    {
      "val": "1",
      "offset": 115
    }
  ],
  "location": "StepDefinitionAdactIn.verify_the_total_data_are_same_in_booking_confirmation_page(String,String,String,String,int)"
});
formatter.result({
  "duration": 591504484,
  "status": "passed"
});
});