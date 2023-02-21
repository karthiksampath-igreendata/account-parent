package com.anz.wholesale.account.domain;

public class MetaMessage {
	private String message;

	public MetaMessage() {
		super();
	}

	/**
	 * @param message
	 */
	public MetaMessage(String message) {
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
