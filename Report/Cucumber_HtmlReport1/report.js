$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "To Test Hotel Booking Functionality",
  "description": "",
  "id": "to-test-hotel-booking-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check Login Is Successful With Valid Credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Is On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks On Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;1"
    },
    {
      "cells": [
        "incorrectusername",
        "12345"
      ],
      "line": 12,
      "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;2"
    },
    {
      "cells": [
        "abc",
        "incorrectpassword"
      ],
      "line": 13,
      "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;3"
    },
    {
      "cells": [
        "Banilbrett",
        "benbrett1"
      ],
      "line": 14,
      "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check Login Is Successful With Valid Credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Is On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"incorrectusername\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"12345\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks On Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Is_On_Login_Page()"
});
formatter.result({
  "duration": 5451951000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "incorrectusername",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters(String)"
});
formatter.result({
  "duration": 284260700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter(String)"
});
formatter.result({
  "duration": 220106400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 621541200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check Login Is Successful With Valid Credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Is On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"abc\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"incorrectpassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks On Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Is_On_Login_Page()"
});
formatter.result({
  "duration": 529872600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters(String)"
});
formatter.result({
  "duration": 202734000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "incorrectpassword",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter(String)"
});
formatter.result({
  "duration": 215177100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 580300600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check Login Is Successful With Valid Credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-login-is-successful-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Is On Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters \"Banilbrett\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"benbrett1\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks On Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Is_On_Login_Page()"
});
formatter.result({
  "duration": 517690800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Banilbrett",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Enters(String)"
});
formatter.result({
  "duration": 208058400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "benbrett1",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter(String)"
});
formatter.result({
  "duration": 216042900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 23188381000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Search hotel is successfully completed with valid credentials.",
  "description": "",
  "id": "to-test-hotel-booking-functionality;verify-search-hotel-is-successfully-completed-with-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Selects Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Selects Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Selects Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enters Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enters Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Selects Adult Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Selects Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Clicks On Search Button And Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Selects_Location()"
});
formatter.result({
  "duration": 186345900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Hotel()"
});
formatter.result({
  "duration": 276579700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_Room_Type()"
});
formatter.result({
  "duration": 158385800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_Number_Of_Rooms()"
});
formatter.result({
  "duration": 308167600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Check_In_Date()"
});
formatter.result({
  "duration": 268521500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Check_Out_Date()"
});
formatter.result({
  "duration": 263584300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.selects_Adult_Per_Room()"
});
formatter.result({
  "duration": 227577500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_Children_Per_Room()"
});
formatter.result({
  "duration": 204486600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.clicks_On_Search_Button_And_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1265983400,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify Select Hotel Has Passed With Valid Credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;verify-select-hotel-has-passed-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@UnityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Selects Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Clicks On Continue Button And Navigates To Hotel Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Selects_Radio_Button()"
});
formatter.result({
  "duration": 103588200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.clicks_On_Continue_Button_And_Navigates_To_Hotel_Booking_Page()"
});
formatter.result({
  "duration": 1115525900,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Check hotel booking is successful with valid credentials",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-hotel-booking-is-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enters First Name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enters Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enters Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enters Credit Card No.",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Selects Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enters Expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enters Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enters CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Clicks On Book Now Button And Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enters_First_Name()"
});
formatter.result({
  "duration": 255810100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Last_Name()"
});
formatter.result({
  "duration": 236731400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Billing_Address()"
});
formatter.result({
  "duration": 287782300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Credit_Card_No()"
});
formatter.result({
  "duration": 259521700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Selects_Credit_Card_Type()"
});
formatter.result({
  "duration": 152046800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Expiry_month()"
});
formatter.result({
  "duration": 201283000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_Expiry_Year()"
});
formatter.result({
  "duration": 263540500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_CVV_Number()"
});
formatter.result({
  "duration": 232703500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 80961100,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Check Booking Confirmation Is Successful",
  "description": "",
  "id": "to-test-hotel-booking-functionality;check-booking-confirmation-is-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@AcceptanceTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Clicks On Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_Logout_Button()"
});
formatter.result({
  "duration": 7729286600,
  "status": "passed"
});
});