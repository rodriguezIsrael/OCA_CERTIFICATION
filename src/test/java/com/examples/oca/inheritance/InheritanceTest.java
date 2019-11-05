package com.examples.oca.inheritance;

import org.junit.jupiter.api.Test;

import com.examples.oca.declarations.inheritance.Apple;

/**
 * 
 * Clase de prueba de ejemplos de herencia
 * 
 * @since 04/11/2019
 * @author isivroes
 *
 */
public class InheritanceTest {

	Apple apple = new Apple();

	/**
	 * Se invoca a un metodo que existe en la clase abstracta y no en la clase hijo
	 */
	@Test
	public void callMethodInheritanceTest() {
		apple.method();
	}

	/**
	 * Se invoca a un metodo sobre escrito
	 */
	@Test
	public void callMethodoOverridedTest() {
		apple.overridedMethod();
	}

	/**
	 * Se invoca al metodo sobreescrito con la palabra reservada this
	 */
	@Test
	public void callMethodWitReserverWordThis() {
		apple.callOverridedMethod();
	}

	/**
	 * Se invoca al metodo real con la palabra reservada super
	 */
	@Test
	public void callRealMethodWithWordSuper() {
		apple.callRealMethod();
	}

	/**
	 * Se invoca al metodo implementado en la clase hijo, y en la clase padre se
	 * tiene como public abstract
	 */
	@Test
	public void callImplementedMethod() {
		apple.abstractMethod();
	}

}
