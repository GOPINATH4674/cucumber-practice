package com.pommanager;

import org.openqa.selenium.WebDriver;

import compomclass.LoginPage;
import compomclass.SelectHotelPage;

public class PageObjectManager {
	
//	Pojo      ==> private datatype variable;
//	pom       ==> private webelement refName;
//	pomManager==> private className objname;
	
	public WebDriver driver;
	
	private LoginPage lp;
	
	private SelectHotelPage hp;

	public PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;
		
	}

	public LoginPage getInstanceLogin() {
		
		if (lp==null) {
			
			 lp =  new LoginPage(driver);
			
		}
		
		return lp;
	}

	public SelectHotelPage getinstanceHp() {
		if (hp==null) {
			
			hp = new SelectHotelPage(driver);
		}
		
		
		return hp;
	}
	
	
	

}
