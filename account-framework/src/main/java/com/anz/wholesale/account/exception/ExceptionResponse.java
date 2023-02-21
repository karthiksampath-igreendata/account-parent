package com.anz.wholesale.account.exception;

import java.util.ArrayList;
import java.util.List;

import com.anz.wholesale.account.domain.MetaMessage;
import com.anz.wholesale.account.domain.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse {

	private List<MetaMessage> messages = new ArrayList<>();
	private ResponseStatus responseStatus;

	public ExceptionResponse(String message) {
		super();
		MetaMessage msg = new MetaMessage();
		msg.setMessage(message);
		this.messages.add(msg);
	}

	public ExceptionResponse(List<String> messages) {
		super();
		for (String message : messages) {
			MetaMessage msg = new MetaMessage();
			msg.setMessage(message);
			this.messages.add(msg);
		}
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
}
