package com.cleilsonmes.die.dto;

public class Car {

	Engine engine;
	Doors doors;
	Tires tires;
	
	public Car(Engine engine, Doors doors, Tires tires) {
		super();
		this.engine = engine;
		this.doors = doors;
		this.tires = tires;
		System.out.println("Objeto Car criado");
	}

	public void printCarDetails() {
		System.out.println(this.engine + " " + this.doors);
	}
	
	
	
}
