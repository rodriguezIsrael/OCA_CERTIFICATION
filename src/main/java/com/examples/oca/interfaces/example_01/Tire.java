package com.examples.oca.interfaces.example_01;

/**
 * Clase que implementa la interface de ejemplo
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class Tire implements Bounceable {

	/**
	 * Método sobre escrito (Implementado)
	 */
	@Override
	public void bounce() {
		System.out.println("Estoy botando");
	}

	/**
	 * Cantidad de veces que se botara
	 */
	@Override
	public void setBounceFactor(int bf) {
		System.out.println("Voy a botar " + bf + " veces");

	}

}
