package com.cleilsonmes.die.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Component
@Repository
public class DataCleansingService {

	// Somente para mostrar: Service x Component x Repository
	
	/*
	 * Pesquisar sobre a diferença dessas anotações
	 * 
	 * Service x Component x Repository
	 * 
	 * */
	
	public DataCleansingService() {
		super();
		System.out.println("Criado DataCleansingService automatico pela anotação @");
	}
	
}
