package com.anz.wholesale.account.domain;

import java.util.ArrayList;
import java.util.List;

public class AccountingResponse<T> {
	private T data;
	private ResponseStatus responseStatus;
	List<MetaMessage> messages;
	private String responseStatusDetails;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public List<MetaMessage> getMessages() {
		if (messages == null) {
			messages = new ArrayList<>();
		}
		return messages;
	}

	public void setMessages(List<MetaMessage> messages) {
		this.messages = messages;
	}

	public String getResponseStatusDetails() {
		return responseStatusDetails;
	}

	public void setResponseStatusDetails(String responseStatusDetails) {
		this.responseStatusDetails = responseStatusDetails;
	}
}
