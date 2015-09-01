package com.redhat;

public class Reason {

	private String statusCode;

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

	public String getStatusCode()
	{
		return statusCode;
	}

	public void setStatusCode(String nextStatusCode)
	{
		statusCode = nextStatusCode;
	}
}
