package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Confirmation_Page {
	public static WebDriver driver;
	@FindBy(css= "#logout")
	private WebElement sign;
	
	
	
	

	public Adactin_Confirmation_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}





	public WebElement getSign() {
		return sign;
	}
	
	
	
	









	
	}




















