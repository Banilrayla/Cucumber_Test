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
import com.adactin_page_object.Adactin_Page_Manager;
import com.baseclass.Base_Class_Cucumber;

public class Runner_POManager_Adactin extends Base_Class_Cucumber {
	public static WebDriver driver=Base_Class_Cucumber.getBrowser("chrome");
	public static Adactin_Page_Manager pom=new Adactin_Page_Manager(driver);
	public static void main(String[] args) throws IOException {
	get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	implicitWait(driver,20);
	inputValueElement(pom.getInstanceLp().getEmail(),"Banilbrett");
	inputValueElement(pom.getInstanceLp().getPassword(),"benbrett1");
	clickOnElement(pom.getInstanceLp().getLogin());
	dropDowm(pom.getInstanceHp().getLocation(),"byVisibleText","Sydney");
	dropDowm(pom.getInstanceHp().getHotels(),"byIndex","4");
	dropDowm(pom.getInstanceHp().getRooms(),"byVisibleText","Standard");
	dropDowm(pom.getInstanceHp().getRnumber(),"byIndex","8");
	inputValueElement(pom.getInstanceHp().getCheckIn(),"29/03/2022");
	inputValueElement(pom.getInstanceHp().getCheckOut(),"31/03/2022");
	dropDowm(pom.getInstanceHp().getAdult(),"byIndex","2");
	dropDowm(pom.getInstanceHp().getChild(),"byIndex","1");
	clickOnElement(pom.getInstanceHp().getSearch());
	clickOnElement(pom.getInstanceSp().getRadio());
	clickOnElement(pom.getInstanceSp().getCont());
	inputValueElement(pom.getInstanceBp().getFname(),"Banil");
	inputValueElement(pom.getInstanceBp().getLname(),"Rayla");
	inputValueElement(pom.getInstanceBp().getAddress(),"Building2, apartment 12, fourth floor,street 223,Maadi");
	inputValueElement(pom.getInstanceBp().getCardNo(),"1111111123888965");
	dropDowm(pom.getInstanceBp().getCard_Type(),"byVisibleText","American Express");					
	dropDowm(pom.getInstanceBp().getMonth(),"byIndex","1");
	dropDowm(pom.getInstanceBp().getYear(),"byIndex","5");
	inputValueElement(pom.getInstanceBp().getCvv(),"101");
	clickOnElement(pom.getInstanceBp().getPress());
	clickOnElement(pom.getInstanceCp().getSign());
	captureScreenShot(driver,"C:\\Users\\welcome\\eclipse-workspace\\Cucumber_Test\\Screenshot\\Adactin2.png");
	
		}}