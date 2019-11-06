package com.examples.oca.inheritance.example_01.demo;

import com.examples.oca.inheritance.example_01.Apple;

/**
 * 
 * Clase de prueba de ejemplos de herencia
 * 
 * @since 04/11/2019
 * @author isivroes
 *
 */
public class Demo {

	public static void main(String args[]) {

		Apple apple = new Apple();

		/**
		 * Se invoca a un metodo que existe en la clase abstracta y no en la clase hijo
		 */
		apple.method();

		/**
		 * Se invoca a un metodo sobre escrito
		 */
		apple.overridedMethod();

		/**
		 * Se invoca al metodo sobreescrito con la palabra reservada this
		 */
		apple.callOverridedMethod();

		/**
		 * Se invoca al metodo real con la palabra reservada super
		 */
		apple.callRealMethod();

		/**
		 * Se invoca al metodo implementado en la clase hijo, y en la clase padre se
		 * tiene como public abstract
		 */
		apple.abstractMethod();

	}

}
