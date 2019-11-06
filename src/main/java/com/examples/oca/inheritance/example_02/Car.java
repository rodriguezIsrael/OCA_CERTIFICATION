package com.examples.oca.inheritance.example_02;

/**
 * Se crea clase sin constructor por default obligando a que la clase que
 * extienda de esta clase tendra que utilizar el super(String) para enviar el
 * valor a la clase padre
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public abstract class Car {

	/**
	 * Declaracion de variable modelo que debera de ser inicializada en el
	 * cosntructor.
	 */
	private String model;

	/**
	 * Constructor de la clase base
	 * 
	 * @param model - Model del auto
	 */
	public Car(String model) {
		this.model = model;
	}

	/**
	 * 
	 * @return String - Modelo del auto
	 */
	public String getModel() {
		return this.model;
	}

	public void move() {
		System.out.println("Arrancando con velocidad default");
	}
}
