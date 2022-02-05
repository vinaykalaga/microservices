package com.vinay.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.microservices.limitsservice.bean.Limits;
import com.vinay.microservices.limitsservice.configuration.Configuartion;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuartion configuration;
	
	@GetMapping("/limits")
	public Limits retreive() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		//return new Limits(1,200);
	}

}
