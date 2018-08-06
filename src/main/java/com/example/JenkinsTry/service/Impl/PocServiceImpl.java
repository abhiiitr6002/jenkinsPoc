package com.example.JenkinsTry.service.Impl;

import org.springframework.stereotype.Service;

import com.example.JenkinsTry.models.Data;
import com.example.JenkinsTry.models.PocResponse;
import com.example.JenkinsTry.service.PocInterface;

@Service
public class PocServiceImpl implements PocInterface{

	public PocResponse getPocResponse() {
		PocResponse pocResponse = new PocResponse();
		Data data = new Data();
		String temp = "Hello World";
		data.setAccountId(temp);
		pocResponse.setData(data);
		return pocResponse;
	}

}
