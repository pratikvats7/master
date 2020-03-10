package com.example.telecom.exceptions;

public class CustomErrorTest extends Exception {
 
	private static final long serialVersionUID = 1L;
	
	public CustomErrorTest() {
		super();
	}

	public CustomErrorTest(String errors) {
		super(errors);
		
	}
	
	

}
