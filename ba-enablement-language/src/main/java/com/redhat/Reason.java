package com.redhat;

public class Reason {

	private String reasonMessage; // tell me what happened? was it null?

	public Reason(){}

	public Reason(String message)
	{
		reasonMessage = message;
	}

	public String getReasonMessage()
	{
		return reasonMessage;
	}

	public void setReasonMessage(String nextMessage)
	{
		reasonMessage = nextMessage;
	}
}
