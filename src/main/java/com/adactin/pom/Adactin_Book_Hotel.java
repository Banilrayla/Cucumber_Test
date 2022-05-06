package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Book_Hotel {
	public static WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement fname;
	@FindBy(id = "last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNo;
	@FindBy(xpath= "//select[@class='select_combobox']")
	private WebElement card_Type ;
	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement month;
	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")
	private WebElement year;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement press;
	
	
	
	
	
	
	
	
	public Adactin_Book_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCard_Type() {
		return card_Type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getPress() {
		return press;
	}

}
