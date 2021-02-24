package com.cleilsonmes.die.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManufactureConfig {

	/*
	 * Classe de configurações definida com @Configuration
	 * 
	 * Definido um @Bean (newCar()) para o Spring criar meu objeto definido na classe DependencyInjectionExApplication
	 * 
	 * Meu objeto Car pode estar em qualquer canto que será criado automaticamente.
	 * 
	 * */
	@Bean
	public Car newCar() {
		
		Engine engine = new Engine();
		Doors doors = new Doors();
		Tires tires = new Tires();
		
		return new Car(engine, doors, tires);
	}	
	
}
