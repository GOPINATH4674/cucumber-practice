package com.properties;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Configration_Reader {

	public static  Properties p;

	public Configration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\gopi\\eclipse-workspace\\Maven_Practice\\src\\main\\java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String url = p.getProperty("Url");

		return url;

	}

	public String getUsername() {
		
		String username = p.getProperty("Username");
		
		return username;

	}
	
	public String getPassword() {
		
		String password = p.getProperty("Password");
		
		return password;

	}

}
