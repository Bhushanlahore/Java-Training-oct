package com.Assignments.exception;

public class FailException extends Exception{

	private String message;

	
	public FailException(String message) {
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
