package com.cleilsonmes.die.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class PropertiesController {

	/*
	 * Capturando variavel definida em application.properties
	 * 
	 * */
	
	@Value("${version}")
	private String versionStr;

	public PropertiesController() {
		super();
		System.out.println(versionStr);
	}
	
	
	
}
