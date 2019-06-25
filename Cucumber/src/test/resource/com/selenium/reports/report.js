$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinAutomationEndtoEnd.feature");
formatter.feature({
  "line": 1,
  "name": "AdactIn Automation End to End testing",
  "description": "Test scenarios includes Login, Check-In \u0026 Check-Out date",
  "id": "adactin-automation-end-to-end-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 340,
  "name": "To check whether “search order id” query is working and displaying the relevant details.",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-whether-“search-order-id”-query-is-working-and-displaying-the-relevant-details.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 339,
      "name": "@TC-17"
    }
  ]
});
formatter.step({
  "line": 341,
  "name": "User launch the AdactIn Hotel Reservation application using URL as in the test data",
  "keyword": "Given "
});
formatter.step({
  "line": 342,
  "name": "User enter the User-name in the welcome page",
  "keyword": "When "
});
formatter.step({
  "line": 343,
  "name": "User enter the Password in the welcome page",
  "keyword": "And "
});
formatter.step({
  "line": 344,
  "name": "User click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 345,
  "name": "User select the Location  \u0027\u003cLocation\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 346,
  "name": "User select the hotel  \u0027\u003cHotel Name\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 347,
  "name": "User select Room type  \u0027\u003cRoom Type\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 348,
  "name": "User select the Number of Rooms as \"2 - Two\"",
  "keyword": "And "
});
formatter.step({
  "line": 349,
  "name": "User select the Check-in-Date as \"25/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 350,
  "name": "User select the Check-out-Date as \"26/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 351,
  "name": "User select the Adult per Room as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 352,
  "name": "User click on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 353,
  "name": "User click on the Radio Button to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 354,
  "name": "User click on the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 355,
  "name": "User enters first name",
  "keyword": "When "
});
formatter.step({
  "line": 356,
  "name": "User enters last name",
  "keyword": "And "
});
formatter.step({
  "line": 357,
  "name": "User enters billing address",
  "keyword": "And "
});
formatter.step({
  "line": 358,
  "name": "User enters 16 digit credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 359,
  "name": "User selects the card type",
  "keyword": "And "
});
formatter.step({
  "line": 360,
  "name": "User selects the expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 361,
  "name": "User selects the expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 362,
  "name": "User enters the cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 363,
  "name": "User clicks the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 364,
  "name": "User clicks the My Itinerary button",
  "keyword": "And "
});
formatter.step({
  "line": 365,
  "name": "User verify that the relevant details are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 368,
  "name": "",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-whether-“search-order-id”-query-is-working-and-displaying-the-relevant-details.;",
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "Location",
        "Room Type"
      ],
      "line": 369,
      "id": "adactin-automation-end-to-end-testing;to-check-whether-“search-order-id”-query-is-working-and-displaying-the-relevant-details.;;1"
    },
    {
      "cells": [
        "\"Hotel Creek\"",
        "\"Sydney\"",
        "\"Standard\""
      ],
      "line": 370,
      "id": "adactin-automation-end-to-end-testing;to-check-whether-“search-order-id”-query-is-working-and-displaying-the-relevant-details.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 370,
  "name": "To check whether “search order id” query is working and displaying the relevant details.",
  "description": "",
  "id": "adactin-automation-end-to-end-testing;to-check-whether-“search-order-id”-query-is-working-and-displaying-the-relevant-details.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 339,
      "name": "@TC-17"
    }
  ]
});
formatter.step({
  "line": 341,
  "name": "User launch the AdactIn Hotel Reservation application using URL as in the test data",
  "keyword": "Given "
});
formatter.step({
  "line": 342,
  "name": "User enter the User-name in the welcome page",
  "keyword": "When "
});
formatter.step({
  "line": 343,
  "name": "User enter the Password in the welcome page",
  "keyword": "And "
});
formatter.step({
  "line": 344,
  "name": "User click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 345,
  "name": "User select the Location  \u0027\"Sydney\"\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 346,
  "name": "User select the hotel  \u0027\"Hotel Creek\"\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 347,
  "name": "User select Room type  \u0027\"Standard\"\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 348,
  "name": "User select the Number of Rooms as \"2 - Two\"",
  "keyword": "And "
});
formatter.step({
  "line": 349,
  "name": "User select the Check-in-Date as \"25/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 350,
  "name": "User select the Check-out-Date as \"26/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 351,
  "name": "User select the Adult per Room as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 352,
  "name": "User click on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 353,
  "name": "User click on the Radio Button to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 354,
  "name": "User click on the Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 355,
  "name": "User enters first name",
  "keyword": "When "
});
formatter.step({
  "line": 356,
  "name": "User enters last name",
  "keyword": "And "
});
formatter.step({
  "line": 357,
  "name": "User enters billing address",
  "keyword": "And "
});
formatter.step({
  "line": 358,
  "name": "User enters 16 digit credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 359,
  "name": "User selects the card type",
  "keyword": "And "
});
formatter.step({
  "line": 360,
  "name": "User selects the expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 361,
  "name": "User selects the expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 362,
  "name": "User enters the cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 363,
  "name": "User clicks the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 364,
  "name": "User clicks the My Itinerary button",
  "keyword": "And "
});
formatter.step({
  "line": 365,
  "name": "User verify that the relevant details are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_launch_the_AdactIn_Hotel_Reservation_application_using_URL_as_in_the_test_data()"
});
formatter.result({
  "duration": 2078969623,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enter_the_User_name_in_the_welcome_page()"
});
formatter.result({
  "duration": 851015104,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enter_the_Password_in_the_welcome_page()"
});
formatter.result({
  "duration": 529228395,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Login_button()"
});
formatter.result({
  "duration": 1719191064,
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
  "duration": 801384719,
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
  "duration": 692165165,
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
  "duration": 820889017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 36
    }
  ],
  "location": "StepDefinitionAdactIn.user_select_the_Number_of_Rooms_as(String)"
});
formatter.result({
  "duration": 702433214,
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
  "duration": 987673826,
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
  "duration": 677702863,
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
  "duration": 477895676,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Search_button()"
});
formatter.result({
  "duration": 1668694459,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Radio_Button_to_select_the_hotel()"
});
formatter.result({
  "duration": 490159586,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_click_on_the_Continue_Button()"
});
formatter.result({
  "duration": 1630424817,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enters_first_name()"
});
formatter.result({
  "duration": 922355022,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enters_last_name()"
});
formatter.result({
  "duration": 977347618,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enters_billing_address()"
});
formatter.result({
  "duration": 807238882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 12
    }
  ],
  "location": "StepDefinitionAdactIn.user_enters_digit_credit_card_number(int)"
});
formatter.result({
  "duration": 1520148831,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_selects_the_card_type()"
});
formatter.result({
  "duration": 785456824,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_selects_the_expiry_month()"
});
formatter.result({
  "duration": 790342821,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_selects_the_expiry_year()"
});
formatter.result({
  "duration": 713278741,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_enters_the_cvv_number()"
});
formatter.result({
  "duration": 761114426,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_clicks_the_book_now_button()"
});
formatter.result({
  "duration": 520609309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionAdactIn.user_clicks_the_My_Itinerary_button()"
});
formatter.result({
  "duration": 130686,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});