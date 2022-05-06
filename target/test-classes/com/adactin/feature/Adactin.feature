Feature: To Test Hotel Booking Functionality

@SanityTest	
Scenario Outline: Check Login Is Successful With Valid Credentials
Given user Is On Login Page
When user Enters "<username>"
And user Enter "<password>"
Then user Clicks On Login Button And Navigates To Search Hotel Page
      
         Examples:
          | username          |  password           |
          | incorrectusername |  12345              |
          | abc               |  incorrectpassword  |
          | Banilbrett        |  benbrett1          |
          
@SmokeTest
Scenario:  Verify Search hotel is successfully completed with valid credentials.
When user Selects Location
And user Select Hotel
And user Selects Room Type
And user Selects Number Of Rooms
And user Enters Check In Date
And user Enters Check Out Date
And Selects Adult Per Room
And user Selects Children Per Room
Then Clicks On Search Button And Navigates To Select Hotel Page

@UnityTest
Scenario: Verify Select Hotel Has Passed With Valid Credentials
When user Selects Radio Button
Then Clicks On Continue Button And Navigates To Hotel Booking Page

@RegressionTest
Scenario: Check hotel booking is successful with valid credentials
When user Enters First Name
And user Enters Last Name
And user Enters Billing Address
And user Enters Credit Card No.
And user Selects Credit Card Type
And user Enters Expiry month
And user Enters Expiry Year
And user Enters CVV Number
Then user Clicks On Book Now Button And Navigates To Booking Confirmation Page

@AcceptanceTest
Scenario: Check Booking Confirmation Is Successful
Then user Clicks On Logout Button










