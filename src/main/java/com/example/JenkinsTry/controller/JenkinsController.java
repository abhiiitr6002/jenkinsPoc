package com.example.JenkinsTry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.JenkinsTry.models.PocResponse;
import com.example.JenkinsTry.service.PocInterface;

@RestController
public class JenkinsController {

	@Autowired
	private PocInterface pocInterface;

	@RequestMapping(value="/accounts", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public PocResponse getRequest() {
		return pocInterface.getPocResponse();
	}
}
