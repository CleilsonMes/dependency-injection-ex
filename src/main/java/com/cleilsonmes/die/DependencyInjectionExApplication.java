package com.cleilsonmes.die;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cleilsonmes.die","com.cleilsonmes.utils"})
public class DependencyInjectionExApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionExApplication.class, args);
	}

}
