package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetails	 {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement 	Address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardno;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expyear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow_btn;
	
	
	public UserDetails(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);	
		
		
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	public WebElement getAddress() {
		return Address;
	}
	public void setAddress(WebElement address) {
		Address = address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public void setCardno(WebElement cardno) {
		this.cardno = cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public void setCardtype(WebElement cardtype) {
		this.cardtype = cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public void setExpmonth(WebElement expmonth) {
		this.expmonth = expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public void setExpyear(WebElement expyear) {
		this.expyear = expyear;
		
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
	public WebElement getBooknow_btn() {
		return booknow_btn;
	}
	public void setBooknow_btn(WebElement booknow_btn) {
		this.booknow_btn = booknow_btn;
	}
	
		
}
