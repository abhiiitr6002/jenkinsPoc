package com.example.JenkinsTry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	@JsonProperty("accountId")
	private String AccountId;

	public String getAccountId() {
		return AccountId;
	}

	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
}
