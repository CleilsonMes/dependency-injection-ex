package com.cleilsonmes.utils;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Component
@Repository
public class DataCleansingUtils {

	// Somente para mostrar classe fora do Pacote.
	/*
	 * Obs:... 
	 * Essa classe esta fora do pacote padrão (com.aulas.dependencyinjectionex)
	 * Podemos definir assim caso a classe pertença a empresa e não ao programa.
	 * Então temos que dizer pro Spring achar esse pacote no metodo main, assim:
	 * 
	 * @SpringBootApplication(scanBasePackages = {"com.aulas.utils"})
	 * 
	 * */
	
	public DataCleansingUtils() {
		super();
		System.out.println("Criado DataCleansingUtils automatico pela anotação @");
	}
	
}
