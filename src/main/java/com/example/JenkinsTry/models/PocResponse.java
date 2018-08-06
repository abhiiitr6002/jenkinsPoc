package com.example.JenkinsTry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PocResponse {

	@JsonProperty("Data")
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
}
