package com.examples.oca.inheritance.example_02;

import org.junit.jupiter.api.Test;

import com.examples.oca.declarations.inheritance.example_02.Car;
import com.examples.oca.declarations.inheritance.example_02.Ferrari;

/**
 * Clase de pruebas de herencia para el ejemplo 02
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public class Inheritance02Test {

	/**
	 * Instancia del objeto ferrari
	 */
	Ferrari ferrari = new Ferrari(Ferrari.class.getSimpleName());

	/**
	 * Instancia de un carro de tipo Ferrari
	 */
	Car ferrarri02 = new Ferrari("Otro ferrari");

	/**
	 * Se invoca al metodo sobreescrito
	 */
	@Test
	public void overridedTest() {
		System.out.println("---- AUTO: " + ferrari.getModel() + " ----------");
		ferrari.move();
		System.out.println("---- AUTO: " + ferrarri02.getModel() + " ----------");
		ferrarri02.move();
	}

	/**
	 * Se invoca al metodo original de la clase padre
	 */
	@Test
	public void originalMethodTest() {
		System.out.println("---- AUTO: " + ferrari.getModel() + " ----------");
		ferrari.moveDefaultCar();
	}

	/**
	 * Sobrecarga de funciones
	 */
	@Test
	public void overloadedTest() {
		System.out.println("---- AUTO: " + ferrari.getModel() + " ----------");
		ferrari.move(100D);

	}

}
