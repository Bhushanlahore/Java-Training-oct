package com.Assignments.exception;

public class NegativeInputException extends Exception{

	private String message;

	public NegativeInputException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
