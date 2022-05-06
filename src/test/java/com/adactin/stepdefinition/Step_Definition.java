package com.adactin.stepdefinition;

import com.adactin.pom.Adactin_Book_Hotel;
import com.adactin.pom.Adactin_Confirmation_Page;
import com.adactin.pom.Adactin_Login_Page;
import com.adactin.pom.Adactin_Search_Hotel_Page;
import com.adactin.pom.Adactin_Select_Hotel;
import com.adactin.properties.File_Reader_Manager;
import com.baseclass.Base_Class_Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class_Cucumber {
	public static Adactin_Login_Page lp = new Adactin_Login_Page(driver);
	public static Adactin_Search_Hotel_Page hp = new Adactin_Search_Hotel_Page(driver);
	public static Adactin_Select_Hotel sp = new Adactin_Select_Hotel(driver);
	public static Adactin_Book_Hotel bp = new Adactin_Book_Hotel(driver);
	public static Adactin_Confirmation_Page cp = new Adactin_Confirmation_Page(driver);

	@Given("^user Is On Login Page$")
	public void user_Is_On_Login_Page() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		Base_Class_Cucumber.get( url);
		
	}
	
	
	
//	@When("^user Enters Username$")
//	public void user_Enters_Username() throws Throwable {
//
//		inputValueElement(lp.getEmail(), "Banilbrett");
//	}
//
//	@When("^user Enters Password$")
//	public void user_Enters_Password() throws Throwable {
//		inputValueElement(lp.getPassword(), "benbrett1");
//	}
	
	//single data
//	@When("^user Enters \"([^\"]*)\"$")
//	public void user_Enters(String username) throws Throwable {
//		inputValueElement(lp.getEmail(), username);
//	}
//	@When("^user Enter \"([^\"]*)\"$")
//	public void user_Enter(String password) throws Throwable {
//		inputValueElement(lp.getPassword(), password);
//	}
	
	@When("^user Enters \"([^\"]*)\"$")
	public void user_Enters(String username) throws Throwable {
		inputValueElement(lp.getEmail(),username);
	}

	@When("^user Enter \"([^\"]*)\"$")
	public void user_Enter(String password) throws Throwable {
		inputValueElement(lp.getPassword(), password);
	}


	@Then("^user Clicks On Login Button And Navigates To Search Hotel Page$")
	public void user_Clicks_On_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
		implicitWait(driver,6);	
		clickOnElement(lp.getLogin());
		
		
	}
	@When("^user Selects Location$")
	public void user_Selects_Location() throws Throwable {
		dropDowm(hp.getLocation(),"byVisibleText","Sydney"); 
		}
		

	@When("^user Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		dropDowm(hp.getHotels(), "byIndex", "4");
	}

	@When("^user Selects Room Type$")
	public void user_Selects_Room_Type() throws Throwable {
		dropDowm(hp.getRooms(), "byVisibleText", "Standard");
	}

	@When("^user Selects Number Of Rooms$")
	public void user_Selects_Number_Of_Rooms() throws Throwable {
		dropDowm(hp.getRnumber(), "byIndex", "8");
	}

	@When("^user Enters Check In Date$")
	public void user_Enters_Check_In_Date() throws Throwable {
		inputValueElement(hp.getCheckIn(), "29/03/2022");
	}

	@When("^user Enters Check Out Date$")
	public void user_Enters_Check_Out_Date() throws Throwable {
		inputValueElement(hp.getCheckOut(), "31/03/2022");
	}

	@When("^Selects Adult Per Room$")
	public void selects_Adult_Per_Room() throws Throwable {
		dropDowm(hp.getAdult(), "byIndex", "2");
	}

	@When("^user Selects Children Per Room$")
	public void user_Selects_Children_Per_Room() throws Throwable {
		dropDowm(hp.getChild(), "byIndex", "1");
	}

	@Then("^Clicks On Search Button And Navigates To Select Hotel Page$")
	public void clicks_On_Search_Button_And_Navigates_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(hp.getSearch());
	}

	@When("^user Selects Radio Button$")
	public void user_Selects_Radio_Button() throws Throwable {
		clickOnElement(sp.getRadio());
	}

	@Then("^Clicks On Continue Button And Navigates To Hotel Booking Page$")
	public void clicks_On_Continue_Button_And_Navigates_To_Hotel_Booking_Page() throws Throwable {
		clickOnElement(sp.getCont());
	}

	@When("^user Enters First Name$")
	public void user_Enters_First_Name() throws Throwable {
		inputValueElement(bp.getFname(), "Banil");
	}

	@When("^user Enters Last Name$")
	public void user_Enters_Last_Name() throws Throwable {
		inputValueElement(bp.getLname(), "Rayla");
	}

	@When("^user Enters Billing Address$")
	public void user_Enters_Billing_Address() throws Throwable {
		inputValueElement(bp.getAddress(), "Building2, apartment 12, fourth floor,street 223,Maadi");
	}

	@When("^user Enters Credit Card No\\.$")
	public void user_Enters_Credit_Card_No() throws Throwable {
		inputValueElement(bp.getCardNo(), "1111111123888965");
	}

	@When("^user Selects Credit Card Type$")
	public void user_Selects_Credit_Card_Type() throws Throwable {
		dropDowm(bp.getCard_Type(), "byVisibleText", "American Express");
	}

	@When("^user Enters Expiry month$")
	public void user_Enters_Expiry_month() throws Throwable {
		dropDowm(bp.getMonth(), "byIndex", "1");
	}

	@When("^user Enters Expiry Year$")
	public void user_Enters_Expiry_Year() throws Throwable {
		dropDowm(bp.getYear(), "byIndex", "5");
	}

	@When("^user Enters CVV Number$")
	public void user_Enters_CVV_Number() throws Throwable {
		inputValueElement(bp.getCvv(), "101");
	}

	@Then("^user Clicks On Book Now Button And Navigates To Booking Confirmation Page$")
	public void user_Clicks_On_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(bp.getPress());
	}

	@Then("^user Clicks On Logout Button$")
	public void user_Clicks_On_Logout_Button() throws Throwable {
		implicitWait(driver,6);
		clickOnElement(cp.getSign());

	}

}
