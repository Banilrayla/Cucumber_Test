package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Search_Hotel_Page {
	public static WebDriver driver;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotels;
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement rooms;
	@FindBy(name="room_nos")
	private WebElement rnumber;
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement checkIn;
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement checkOut;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement search;
	
	
	
	
	
	
	public Adactin_Search_Hotel_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getRnumber() {
		return rnumber;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getChild() {
		return child;
	}
}
