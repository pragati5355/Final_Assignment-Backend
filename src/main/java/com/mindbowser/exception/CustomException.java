package com.mindbowser.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;
	private String error;

	public CustomException(String message, String error) {
		super();
		this.message = message;
		this.error = error;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public String getError() {
		return error;
	}

}
