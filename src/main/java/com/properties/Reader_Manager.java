package com.properties;

import java.io.IOException;

public class Reader_Manager {
	
	private Reader_Manager() {

	
	}
	
	
	public static Reader_Manager getInstanceRm() {
		
		Reader_Manager rm = new Reader_Manager();
		
		return rm;

	}
	
	public Configration_Reader getInstanceCr() throws IOException {
		
		Configration_Reader cr = new Configration_Reader();
		
		return cr;

	}

}
