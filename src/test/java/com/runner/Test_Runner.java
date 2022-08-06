package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Practice.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature" , glue = "com.stepdefinition")
public class Test_Runner {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void srtUp() {
		driver= BaseClass.browserLaunch("chrome");

	}
	
	@AfterClass
	public static void endUp() {
		driver.close();

	}
	

}
