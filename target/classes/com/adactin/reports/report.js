$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin application end to end testing",
  "description": "Test scenarios includes Login, Search,... etc",
  "id": "adactin-application-end-to-end-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "To verify valid login details",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_101"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch the adactin application using \"http://adactin.com/HotelApp/index.php\" url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter the UserID \"Teja1210\" in the home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter the password \"tejaadactin\" in the home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User verify the text \"Welcome to AdactIn Group of Hotels\" in the header",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactin.com/HotelApp/index.php",
      "offset": 43
    }
  ],
  "location": "Stepdefinition.user_launch_the_adactin_application_using_url(String)"
});
formatter.result({
  "duration": 3003640337,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teja1210",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enter_the_UserID_in_the_home_page(String)"
});
formatter.result({
  "duration": 7511821586,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tejaadactin",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.user_enter_the_password_in_the_home_page(String)"
});
formatter.result({
  "duration": 360545136,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_Login_button()"
});
formatter.result({
  "duration": 2343047694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to AdactIn Group of Hotels",
      "offset": 22
    }
  ],
  "location": "Stepdefinition.user_verify_the_text_in_the_header(String)"
});
formatter.result({
  "duration": 127833908,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To verify whether the check-out date field accepts a later date than checkin date",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_102"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter check-in-date as \"14/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter check-out-date as \"12/06/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Verify that system gives an error saying \"Check-In Date shall be before than Check-Out Date\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.user_Select_location_as(String)"
});
formatter.result({
  "duration": 300710993,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 22
    }
  ],
  "location": "Stepdefinition.user_Select_hotel_as(String)"
});
formatter.result({
  "duration": 199353091,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 26
    }
  ],
  "location": "Stepdefinition.user_Select_room_type_as(String)"
});
formatter.result({
  "duration": 210991483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Select_no_of_rooms_as(String)"
});
formatter.result({
  "duration": 164789358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "duration": 320593812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/06/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "duration": 277211840,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 170854474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check-In Date shall be before than Check-Out Date",
      "offset": 42
    }
  ],
  "location": "Stepdefinition.verify_that_system_gives_an_error_saying(String)"
});
formatter.result({
  "duration": 74866499,
  "status": "passed"
});
});