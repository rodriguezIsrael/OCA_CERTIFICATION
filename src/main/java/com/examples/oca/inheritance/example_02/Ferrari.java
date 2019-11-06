package com.examples.oca.inheritance.example_02;

/**
 * 
 * Clase hijo que tiene que tener un constructor para poder usar con
 * super(String) el constructor de la clase base
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public class Ferrari extends Car {

	/**
	 * Constructor de la clase hijo que es obligatorio, debido a que la clase base
	 * tiene un constructor que no es default.
	 * 
	 * @param model - Modelo del auto
	 */
	public Ferrari(String model) {
		super(model);
	}

	/**
	 * Se crea metodo que no sobreescribe el metodo existente, si no que realiza una
	 * sobre carga de metodos.
	 * 
	 * @param speed - Velocidad con la cual se desplazara el automovil
	 */
	public void move(Double speed) {
		System.out.println("Movimiendose con velocidad de: " + speed + " KM/h");
	}

	/**
	 * Sobreescritura de método
	 */
	@Override
	public void move() {
		System.out.println("Movimiendose con velocidad default del ferrari de : 30 KM/h");
	}

	/**
	 * Se invoca al metodo original por default de la clase padre
	 */
	public void moveDefaultCar() {
		super.move();
	}

}
