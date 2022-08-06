package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import com.Cucumber_Practice.BaseClass;
import com.pommanager.PageObjectManager;
import com.properties.Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		
		String name = s.getName();
		
		System.out.println("Scenario Name Is:" + name);

	}
	
	@After
	public void afterHooks(Scenario s) throws IOException {
		
		String status = s.getStatus();
		System.out.println("Scenario Status Is:" + status);
		
		if (s.isFailed()) {
			
			screenshotMethod("C:\\Users\\gopi\\eclipse-workspace\\Cucumber_Practice\\Screenshot");
		}

	}
	
	@Given("^user Must launch The Url$")
	public void user_Must_launch_The_Url() throws Throwable {
		launchUrl(Reader_Manager.getInstanceRm().getInstanceCr().getUrl());
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {		
		passInput(pom.getInstanceLogin().getUsername(), Reader_Manager.getInstanceRm().getInstanceCr().getUsername());
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {		
		passInput(pom.getInstanceLogin().getPass(), Reader_Manager.getInstanceRm().getInstanceCr().getPassword());
	}

	@Then("^user Click the login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_the_login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {		
		clickbtn(pom.getInstanceLogin().getBtn());
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		selectOption(pom.getinstanceHp().getLoc(), "Brisbane");
	}

	@When("^user Select The Hotel In The Hotel Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {	
		selectOption(pom.getinstanceHp().getHotel(), "Hotel Sunshine");
	}

	@When("^user Select The Room Type In The  Room Type Field$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {		
		selectOption(pom.getinstanceHp().getRoomtype(),"Double");
	}

	@When("^user Select The Room Numbers In The  Room Numbers Field$")
	public void user_Select_The_Room_Numbers_In_The_Room_Numbers_Field() throws Throwable {		
		selectOption(pom.getinstanceHp().getRoomnum(), "4");
	}
	
	@When("^user Erase The Start Date In The Start Date Field$")
	public void user_Erase_The_Start_Date_In_The_Start_Date_Field() throws Throwable {
		clearElement(pom.getinstanceHp().getDatep());
	}

	@When("^user Enter The Date In In The Date In Field$")
	public void user_Enter_The_Date_In_In_The_Date_In_Field() throws Throwable {
		passInput(pom.getinstanceHp().getDatep(), "15/06/2022");				
	}
	
	@When("^user Erase The End Date In The End Date Field$")
	public void user_Erase_The_End_Date_In_The_End_Date_Field() throws Throwable {
		clearElement(pom.getinstanceHp().getDateo());
	}

	@When("^user Enter The Date Out In The Date Out Field$")
	public void user_Enter_The_Date_Out_In_The_Date_Out_Field() throws Throwable {
		passInput(pom.getinstanceHp().getDateo(), "17/06/2022");
			}

	@When("^user Select The Adult In The Adult Field$")
	public void user_Select_The_Adult_In_The_Adult_Field() throws Throwable {
		selectOption(pom.getinstanceHp().getAdultroom(), "2");
	}

	@When("^user Select The Child In The Child Field$")
	public void user_Select_The_Child_In_The_Child_Field() throws Throwable {
		selectOption(pom.getinstanceHp().getChild_room(), "2");
	}

	@Then("^User Click The Submit Button and it Navigate to Confirmation page$")
	public void user_Click_The_Submit_Button_and_it_Navigate_to_Confirmation_page() throws Throwable {
		clickbtn(pom.getinstanceHp().getSubmit());
	}

	@When("^user Click The Radio button$")
	public void user_Click_The_Radio_button() throws Throwable {
		
	}

	@Then("^User Click The Continue Button And It Navigate to Hotel Booking Page\\.$")
	public void user_Click_The_Continue_Button_And_It_Navigate_to_Hotel_Booking_Page() throws Throwable {
	}

	@When("^user Enter the First Name In The First Name Field$")
	public void user_Enter_the_First_Name_In_The_First_Name_Field() throws Throwable {
	}

	@When("^user Enter The Last Name in The Last Name Field$")
	public void user_Enter_The_Last_Name_in_The_Last_Name_Field() throws Throwable {
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	}

	@When("^user Enter The Card Number In The Card Number Field$")
	public void user_Enter_The_Card_Number_In_The_Card_Number_Field() throws Throwable {
	}

	@When("^user Select the Type Of Card In The Card Type$")
	public void user_Select_the_Type_Of_Card_In_The_Card_Type() throws Throwable {
	}

	@When("^user Select The Expiry Month In The Month Field$")
	public void user_Select_The_Expiry_Month_In_The_Month_Field() throws Throwable {
	}

	@When("^user Select The Expiry Year In The Year Field$")
	public void user_Select_The_Expiry_Year_In_The_Year_Field() throws Throwable {
	}

	@When("^user Enter The Cvv Number In The Cvv Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Field() throws Throwable {
	}

	@Then("^Click The Booking Button And Navigate To The Booking Confirmation Page$")
	public void click_The_Booking_Button_And_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
	}

	@Then("^Click The Logout Button And Finish The Booking Functionality$")
	public void click_The_Logout_Button_And_Finish_The_Booking_Functionality() throws Throwable {
	}



}
