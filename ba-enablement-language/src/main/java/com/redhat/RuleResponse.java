package com.redhat;

import java.util.Collection;

public class RuleResponse {

	@KieQuery(binding = "$business", queryName = "Get Business")
	private Business business;

	@KieQuery(binding = "$resCode", queryName = "getResCode")
	private String responseCode; // e.g. success, failure, filtered, validation error...

	@KieQuery(binding = "$theReasons", queryName = "Get Reasons")
	private Collection<Reason> reasons; // messages about why the response Code came bacl

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public String getResponseCode()
	{
		return responseCode;
	}

	public void setResponseCode(String nextResponseCode)
	{
		System.out.println("boom + " + nextResponseCode);
		this.responseCode = nextResponseCode;
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
