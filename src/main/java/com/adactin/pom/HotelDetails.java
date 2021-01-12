
package com.adactin.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetails {
	public static WebDriver driver;
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement SelectHotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement Roomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement rooms;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childroom;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebDriver search;
	
	
	public void setSearch(WebDriver search) {
		this.search = search;
	}

	public HotelDetails(WebDriver ldriver ) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public void setSelectHotel(WebElement selectHotel) {
		SelectHotel = selectHotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		Roomtype = roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public void setAdultroom(WebElement adultroom) {
		this.adultroom = adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	public WebDriver getSearch() {
		return search;
	}
	
	
}
