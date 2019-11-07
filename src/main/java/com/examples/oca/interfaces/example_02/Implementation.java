package com.examples.oca.interfaces.example_02;

/**
 * Ejemplo de implementar multiples clases
 * 
 * Por lo que siempre primero se debe de extener, y luego se implementan las
 * interfaces
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class Implementation extends ClassA implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void methodC() {
		System.out.println("Soy el metodo C");

	}

	@Override
	public void methodB() {
		System.out.println("Soy el metodo B");

	}

	@Override
	public void methodA() {
		System.out.println("Soy el metodo A");

	}

	@Override
	public void abstractMethodClassA() {
		System.out.println("Metodo abstracto de la clase A");

	}

}
