package com.infogain.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;
import com.infogain.microservices.limitsservice.bean.Configuration;
import com.infogain.microservices.limitsservice.bean.Limitconfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limitconfiguration retrievelimitsfromConfiguration() {
		
		Limitconfiguration limitconfiguration = new Limitconfiguration(configuration.getMaximum(), configuration.getMinimum());
		return limitconfiguration;
		
	}

}
