package com.adactin.stepdefintion;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactin.pom.BookingHotel;
import com.adactin.pom.HotelDetails;
import com.adactin.pom.UserDetails;
import com.adactin.pom.UserLogin;
import com.baseclass.BaseClassMaven;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintion extends BaseClassMaven {
	public static WebDriver Driver;

	@Given("^User launch adactin application$")
	public void user_launch_adactin_application() {
		getDriver("chrome");
		getUrl("http://adactinhotelapp.com/");
	}

	@When("^user enter user name$")
	public void user_enter_user_name() {
		UserLogin ul = new UserLogin(Driver);
		inputValueElement(ul.getUsername(), "bala");

	}

	@When("^user enter password$")
	public void user_enter_password() {
		UserLogin ul = new UserLogin(Driver);
		inputValueElement(ul.getPassword(), "15588");
	}

	@When("^user click ok button$")
	public void user_click_ok_button() {
		UserLogin ul = new UserLogin(Driver);
		clickOnElement(ul.getLoginbtn());
	}

	@Then("^It naviagte to the search hotel page$")
	public void it_naviagte_to_the_search_hotel_page() {
		
	}

	@When("^User selecting the location$")
	public void user_selecting_the_location() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getLocation(),"index", "2");
	}

	@When("^User selecting the Hotels$")
	public void user_selecting_the_Hotels() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getSelectHotel(),"index", "2");
		
	}

	@When("^User selecting the Room Type$")
	public void user_selecting_the_Room_Type() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getRoomtype(),"index", "2");
	}

	@When("^User selecting the Number of Rooms$")
	public void user_selecting_the_Number_of_Rooms() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getRooms(),"index", "2");
	}

	@When("^User entering the Check In Date$")
	public void user_entering_the_Check_In_Date() {
		HotelDetails hd= new HotelDetails(Driver);
		inputValueElement(hd.getCheckin(), "12/02/2021");
	}

	@When("^User entering the Check Out Date$")
	public void user_entering_the_Check_Out_Date() {
		HotelDetails hd= new HotelDetails(Driver);
		inputValueElement(hd.getCheckout(), "14/02/2021");
	}

	@When("^User selecting the Adults per Room$")
	public void user_selecting_the_Adults_per_Room() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getAdultroom(),"index", "2");
	}

	@When("^User selecting the Children per Room$")
	public void user_selecting_the_Children_per_Room() {
		HotelDetails hd= new HotelDetails(Driver);
		selection(hd.getChildroom(),"index", "2");
	}

	@When("^User click search button$")
	public void user_click_search_button() {
		HotelDetails hd= new HotelDetails(Driver);
		clickOnElement(hd.getSearch());
	}

	@When("^user clicking the radio button$")
	public void user_clicking_the_radio_button() {
		BookingHotel bh= new BookingHotel(Driver);
		clickOnElement(bh.getRadiobutton());
		
	}

	@When("^User clicking the continue button$")
	public void user_clicking_the_continue_button() {
		BookingHotel bh= new BookingHotel(Driver);
		clickOnElement(bh.getContinue());

		
	}

	@When("^user enter First Name$")
	public void user_enter_First_Name() {
		UserDetails ud = new UserDetails(Driver);
	inputValueElement(ud.getFirstname(), "bala");
	}

	@When("^user enter Last Name$")
	public void user_enter_Last_Name() {
		UserDetails ud = new UserDetails(Driver);
		inputValueElement(ud.getLastname(), "varun");
	}

	@When("^user enter Billing Address$")
	public void user_enter_Billing_Address() {
		UserDetails ud = new UserDetails(Driver);
		inputValueElement(ud.getAddress(), "NO 234,chennai");
	}

	@When("^user enter Credit Card No$")
	public void user_enter_Credit_Card_No() {
		UserDetails ud = new UserDetails(Driver);
		inputValueElement(ud.getCardno(), "123");
	}

	@When("^user selecting Credit Card Type$")
	public void user_selecting_Credit_Card_Type() {
		UserDetails ud = new UserDetails(Driver);
		selection(ud.getCardtype(), "index", "2");
	}

	@When("^user selecting Expiry Date$")
	public void user_selecting_Expiry_Date() {
		UserDetails ud = new UserDetails(Driver);
		selection(ud.getCardtype(), "index", "2");
	}

	@When("^user entering CVV Number$")
	public void user_entering_CVV_Number() {
		UserDetails ud = new UserDetails(Driver);
		inputValueElement(ud.getCvv(), "125");
	}

	@And("^user clicking booknow button$")
	public void user_clicking_booknow_button() {
		UserDetails ud = new UserDetails(Driver);
		clickOnElement(ud.getBooknow_btn());
	}

}
