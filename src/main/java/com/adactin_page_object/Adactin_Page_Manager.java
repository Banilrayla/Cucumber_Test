package com.adactin_page_object;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Adactin_Book_Hotel;
import com.adactin.pom.Adactin_Confirmation_Page;
import com.adactin.pom.Adactin_Login_Page;
import com.adactin.pom.Adactin_Search_Hotel_Page;
import com.adactin.pom.Adactin_Select_Hotel;

public class Adactin_Page_Manager {

	public static WebDriver driver;
	
	public Adactin_Login_Page lp;
	public Adactin_Search_Hotel_Page hp;
	public Adactin_Select_Hotel sp;
	public Adactin_Book_Hotel bp;
	public Adactin_Confirmation_Page cp;
	
	
	public Adactin_Page_Manager(WebDriver driver2) {
		this.driver=driver2;
	}


	public Adactin_Login_Page getInstanceLp() {
		lp = new Adactin_Login_Page(driver);
		return lp;

	}
	
	
	public Adactin_Search_Hotel_Page getInstanceHp() {
		hp= new Adactin_Search_Hotel_Page(driver);
		return hp;
	}
	
	public Adactin_Select_Hotel getInstanceSp() {
		sp=new Adactin_Select_Hotel(driver);
		return sp;
	}
	
	public Adactin_Book_Hotel getInstanceBp() {
		bp=new Adactin_Book_Hotel(driver);
		return bp;
	}
	
	public Adactin_Confirmation_Page getInstanceCp() {
		cp=new Adactin_Confirmation_Page(driver);
		return cp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}



