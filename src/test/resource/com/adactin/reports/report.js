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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_Login_button()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.scenario({
  "line": 35,
  "name": "To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-locations-in-select-hotel-page-are-displayed-according-to-the-location-selected-in-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TC_104"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Select No-of-children \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Verify that hotel displayed is the same as selected in search Hotel form",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.select_No_of_children(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 48,
  "name": "To verify whether Check-indate and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-check-indate-and-check-out-date-are-being-displayed-in-select-hotel-page-according-to-the-dates-selected-in-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@TC_105"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Verify Check-in-date and check-outdate should be displayed according to the data entered in search hotel form",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.verify_Check_in_date_and_check_outdate_should_be_displayed_according_to_the_data_entered_in_search_hotel_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 60,
  "name": "To verify whether no.of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-no.of-rooms-entry-in-select-hotel-page-is-same-as-the-number-of-rooms-selected-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@TC_106"
    }
  ]
});
formatter.step({
  "line": 61,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Verify the No-of-rooms should be displayed and match with number of rooms in search hotel page",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.verify_the_No_of_rooms_should_be_displayed_and_match_with_number_of_rooms_in_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 72,
  "name": "To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-room-type-in-select-hotel-page-is-same-as-room-type-selected-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 71,
      "name": "@TC_107"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Verify the Room type displayed should be the same as selected in search hotel page",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.verify_the_Room_type_displayed_should_be_the_same_as_selected_in_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 84,
  "name": "To verify whether the total price(excl.GST) is calculated as “price per night * no. of nights* no of rooms”",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-whether-the-total-price(excl.gst)-is-calculated-as-“price-per-night-*-no.-of-nights*-no-of-rooms”",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 83,
      "name": "@TC_108"
    }
  ]
});
formatter.step({
  "line": 85,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "User select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "User click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Verify that totalprice(excl.GST) is being calculated as (price-per-night*noof-rooms*no-of-days)",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 98,
  "name": "To verify when pressed, logout button logs out from the application.",
  "description": "",
  "id": "adactin-application-end-to-end-testing;to-verify-when-pressed,-logout-button-logs-out-from-the-application.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 97,
      "name": "@TC_109"
    }
  ]
});
formatter.step({
  "line": 99,
  "name": "User Select location as \"Sydney\"",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "User Select hotel as \"Hotel Creek\"",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "User Select room type as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "User Select no-of-rooms as \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "Enter check-in-date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Enter check-out-date as \"30/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Select No-of-adults \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "User select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "Enter the details and click on book now",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "Check the details, click on logout and verify we have been logged out of the application",
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 24
    }
  ],
  "location": "Stepdefinition.enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/07/2019",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.enter_check_out_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 21
    }
  ],
  "location": "Stepdefinition.select_No_of_adults(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.enter_the_details_and_click_on_book_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.check_the_details_click_on_logout_and_verify_we_have_been_logged_out_of_the_application()"
});
formatter.result({
  "status": "skipped"
});
});