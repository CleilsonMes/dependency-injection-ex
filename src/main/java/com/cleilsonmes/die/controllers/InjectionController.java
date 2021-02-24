package com.cleilsonmes.die.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import com.cleilsonmes.die.dao.IStaffRepository;
import com.cleilsonmes.die.dto.Car;

@Controller
public class InjectionController {
	
	// Exemplos de: Field Injection x Constructor Injection x Setter Injection
	
	/* Para construir uma Injeção de dependencia preciso definir um @Bean method
	 * Que retorne esse mesmo valor da variavel "car" por exemplo.
	 * 
	 * Se Iniciarmos o programa sem esse @Bean, dará erro.
	 * E o proprio eclipse nos pede para definirmos um @Bean:
	 * 
	 * Action:
	 * Consider defining a bean of type 'com.aulas.dependencyinjectionex.dto.Car' in your configuration.
	 * 
	 * 
	 * Para definir esse @Bean criamos uma classe de @Configuration
	 * Por exemplo, criamos essa: ManufactureConfig
	 * 
	 * Quando colocamos a anotação @Configuration na classe, o Spring cria automaticamente.
	 * 
	 * */
	
	/* "Field Injection" para a classe Car
	 * 
	 * */ 
//	@Autowired
//	Car car;

	
	/* "Constructor Injection" no lugar de definir no Field
	 * Posso passar no construtor:
	 * 
	 * */
//	Car car;
//	
//	public HomeController(Car car) {
//		super();
//	 	this.car = car;
//		if (car == null) {
//			System.out.println("Objeto Car da Classe HomeController Criado NAO "+car);
//		} else {
//			System.out.println("Objeto Car da Classe HomeController Criado SIM "+car);
//		}
//	}

	
	/* "Setter Injection" no lugar de definir no Field ou no Construtor
	 * Posso passar no method Setter:
	 * 
	 * */
//	Car car;
//
//	@Autowired
//	public void setCar(Car car) {
//		this.car = car;
//		
//		if (car == null) {
//			System.out.println("Objeto Car da Classe HomeController Criado NAO "+car);
//		} else {
//			System.out.println("Objeto Car da Classe HomeController Criado SIM "+car);
//		}
//	}
	

	
	/* PEOBLEMA: Se eu tiver 2 Classes herdando da mesma Interface
	 * E passar a Interface no "Constructor Injection", qual classe irá escolher?
	 * Dará erro de execução e a seguinte dica:
	 * 
	 * Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, 
	 * 	or using @Qualifier to identify the bean that should be consumed
	 * 
	 * Então podemos usar a anotação @Primary para escolher a classe a ser chamada.
	 * 	ou @Qualifier onde o objeto esta sendo chamando.
	 * 
	 * */
	@Qualifier("staffRepository2")
	@Autowired
	IStaffRepository repo;
	
	public InjectionController(@Qualifier("staffRepository2") IStaffRepository repo) {
		super();
		
		this.repo = repo;
		if (repo == null) {
			System.out.println("Objeto Repository Criado NAO "+repo);
		} else {
			System.out.println("Objeto Repository Criado SIM "+repo);
		}
	}
	
	/* Podemos qualificar no parametro ou no field assim:
	 * 
	 * 	@Qualifier("staffRepository2")
		@Autowired
		IStaffRepository repo;
	 * 
	 * Ou no metodo setter
	 * 
	 * 	@Qualifier("staffRepository2")
		@Autowired
		public void setIStaffRepository(IStaffRepository repo){};
	 *	
	 * */

}
