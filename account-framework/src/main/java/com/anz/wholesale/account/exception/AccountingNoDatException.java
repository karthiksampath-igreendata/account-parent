package com.anz.wholesale.account.exception;

import java.util.ArrayList;
import java.util.List;

public class AccountingNoDatException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<String> messages = new ArrayList<>();

	public AccountingNoDatException() {
		super();
	}

	public AccountingNoDatException(String message) {
		super(message);
		this.messages.add(message);
	}

	public AccountingNoDatException(List<String> messages) {
		this.setMessages(messages);
	}

	public AccountingNoDatException(String message, Throwable cause) {
		super(message, cause);
		this.messages.add(message);
	}

	public AccountingNoDatException(Throwable cause) {
		super(cause);
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages.addAll(messages);
	}
}
