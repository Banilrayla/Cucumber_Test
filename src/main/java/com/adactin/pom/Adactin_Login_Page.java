package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login_Page {
	public static WebDriver driver;
	
	@FindBy(name="username")
private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;

	public Adactin_Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

}

