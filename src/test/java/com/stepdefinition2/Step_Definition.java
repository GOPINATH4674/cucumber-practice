package com.stepdefinition2;

import java.io.IOException;

import com.Cucumber_Practice.BaseClass;
import com.pommanager.PageObjectManager;
import com.properties.Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
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

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		passInput(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		passInput(pom.getInstanceLogin().getPass(), password);
	}

	@Then("^user Click the login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_the_login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickbtn(pom.getInstanceLogin().getBtn());
	}


}
