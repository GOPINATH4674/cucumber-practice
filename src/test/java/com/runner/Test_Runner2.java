package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Cucumber_Practice.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin2.feature", glue = "com.stepdefinition2" ,
                monochrome = true,
                    plugin = {"html:Report","json:Report/Cucumber.json", //"pretty" , 
                		    "com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})
public class Test_Runner2 {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("chrome");

	}

	@AfterClass
	public static void endUp() {

		driver.close();

	}
}
