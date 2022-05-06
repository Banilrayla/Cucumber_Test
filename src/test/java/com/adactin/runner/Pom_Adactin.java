package com.adactin.runner;


import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.pom.Adactin_Book_Hotel;
import com.adactin.pom.Adactin_Confirmation_Page;
import com.adactin.pom.Adactin_Login_Page;
import com.adactin.pom.Adactin_Search_Hotel_Page;
import com.adactin.pom.Adactin_Select_Hotel;
import com.baseclass.Base_Class_Cucumber;

public class Pom_Adactin extends Base_Class_Cucumber {
	
	public static WebDriver driver=Base_Class_Cucumber.getBrowser("chrome");
	public static Adactin_Login_Page lp= new Adactin_Login_Page(driver);
	public static Adactin_Search_Hotel_Page hp= new Adactin_Search_Hotel_Page(driver);
	public static Adactin_Select_Hotel sp=new Adactin_Select_Hotel(driver);
	public static Adactin_Book_Hotel bp=new Adactin_Book_Hotel(driver);
	public static Adactin_Confirmation_Page cp=new Adactin_Confirmation_Page(driver);
	
	public static void main(String[] args) throws IOException {
	get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	implicitWait(driver,20);
	inputValueElement(lp.getEmail(),"Banilbrett");
	inputValueElement(lp.getPassword(),"benbrett1");
	clickOnElement(lp.getLogin());
	dropDowm(hp.getLocation(),"byVisibleText","Sydney"); 
	dropDowm(hp.getHotels(),"byIndex","4");
	dropDowm(hp.getRooms(),"byVisibleText","Standard");
	dropDowm(hp.getRnumber(),"byIndex","8");
	inputValueElement(hp.getCheckIn(),"29/03/2022");
	inputValueElement(hp.getCheckOut(),"31/03/2022");
	dropDowm(hp.getAdult(),"byIndex","2");
	dropDowm(hp.getChild(),"byIndex","1");
	clickOnElement(hp.getSearch());
	clickOnElement(sp.getRadio());
	clickOnElement(sp.getCont());
	inputValueElement(bp.getFname(),"Banil");
	inputValueElement(bp.getLname(),"Rayla");
	inputValueElement(bp.getAddress(),"Building2, apartment 12, fourth floor,street 223,Maadi");
	inputValueElement(bp.getCardNo(),"1111111123888965");
	dropDowm(bp.getCard_Type(),"byVisibleText","American Express");					
	dropDowm(bp.getMonth(),"byIndex","1");
	dropDowm(bp.getYear(),"byIndex","5");
	inputValueElement(bp.getCvv(),"101");
	clickOnElement(bp.getPress());
	clickOnElement(cp.getSign());
	captureScreenShot(driver,"C:\\Users\\welcome\\eclipse-workspace\\Cucumber_Test\\Screenshot\\Adactin.png");
	




	


}
	
	
	
	
	
	
}