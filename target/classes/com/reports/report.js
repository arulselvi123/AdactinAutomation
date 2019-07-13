$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPractiseSmoke.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practise application end to end testing",
  "description": "      test scenarios includes Login,search,order selecting",
  "id": "automation-practise-application-end-to-end-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify the Login functionality of the application",
  "description": "",
  "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User Launch the automation practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on the sigin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter the \"\u003cUsername\u003e\" in the email address field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"\u003cPassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on the sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on the signout button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;;1"
    },
    {
      "cells": [
        "arjun@gmail.com",
        "123456"
      ],
      "line": 14,
      "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;;2"
    },
    {
      "cells": [
        "arjunn@gmail.com",
        "123456"
      ],
      "line": 15,
      "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the Login functionality of the application",
  "description": "",
  "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch the automation practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on the sigin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter the \"arjun@gmail.com\" in the email address field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on the sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on the signout button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_Launch_the_automation_practise_application()"
});
formatter.result({
  "duration": 40997235158,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_sigin_button_in_the_header()"
});
formatter.result({
  "duration": 21679141530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arjun@gmail.com",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.user_enter_the_in_the_email_address_field(String)"
});
formatter.result({
  "duration": 660093961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 182037821,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_sigin_button()"
});
formatter.result({
  "duration": 2860706326,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_signout_button()"
});
formatter.result({
  "duration": 2849481657,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify the Login functionality of the application",
  "description": "",
  "id": "automation-practise-application-end-to-end-testing;verify-the-login-functionality-of-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch the automation practise application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on the sigin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter the \"arjunn@gmail.com\" in the email address field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"123456\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on the sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on the signout button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_Launch_the_automation_practise_application()"
});
formatter.result({
  "duration": 3797388133,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_sigin_button_in_the_header()"
});
formatter.result({
  "duration": 2323323059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arjunn@gmail.com",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.user_enter_the_in_the_email_address_field(String)"
});
formatter.result({
  "duration": 666365169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 112455424,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_sigin_button()"
});
formatter.result({
  "duration": 3045505719,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_click_on_the_signout_button()"
});
formatter.result({
  "duration": 3132643765,
  "status": "passed"
});
});