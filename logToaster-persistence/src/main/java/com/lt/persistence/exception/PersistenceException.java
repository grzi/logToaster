package com.lt.persistence.exception;

public class PersistenceException extends Exception{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public PersistenceException(String msg){
		message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
