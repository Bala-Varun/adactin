package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Continue;
	
	public BookingHotel( WebDriver ldriver) {
		BookingHotel.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinue() {
		return Continue;
	}
	
	
}