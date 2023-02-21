package com.anz.wholesale.account.exception;

import java.util.ArrayList;
import java.util.List;

public class AccountingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8469377475138532860L;
	private List<String> messages = new ArrayList<>();

	public AccountingException() {
		super();
	}

	public AccountingException(String message) {
		super(message);
		this.messages.add(message);
	}

	public AccountingException(List<String> messages) {
		this.setMessages(messages);
	}

	public AccountingException(String message, Throwable cause) {
		super(message, cause);
		this.messages.add(message);
	}

	public AccountingException(Throwable cause) {
		super(cause);
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
