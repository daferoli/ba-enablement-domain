package com.redhat;

import java.util.Collection;

public class RuleResponse {

	@KieQuery(binding = "$business", queryName = "Get Business")
	private Business business;

	@KieQuery(binding = "$successRes", queryName = "getSuccessRes")
	private boolean successResult; // e.g. success, failure, filtered, validation error...

	@KieQuery(binding = "$theReasons", queryName = "Get Reasons")
	private Collection<Reason> reasons; // messages about why the response Code came bacl

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public boolean getSuccessResult()
	{
		return successResult;
	}

	public void setSuccessResult(boolean nextResponseCode)
	{
		this.successResult = nextResponseCode;
	}

	public Collection<Reason> getReasons()
	{
		System.out.println("hello");
		return reasons;
	}

	public void setReasons(Collection<Reason> nextReason)
	{
		this.reasons = nextReason;
	}
}
