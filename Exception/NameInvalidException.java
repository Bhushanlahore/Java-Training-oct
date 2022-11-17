package com.ExceptionHandling;

public class NameInvalidException extends Exception {

	private String message;

	public NameInvalidException(String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
