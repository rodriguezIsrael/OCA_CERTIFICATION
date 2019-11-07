package com.examples.oca.interfaces.example_01;

/**
 * Interface de ejemplo
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public interface Bounceable {

	/**
	 * Método sin public abstract void, pero ya viene implicito
	 */
	void bounce();

	/**
	 * Método con public abstract void, aun que el compilador ya lo tiene por
	 * default
	 * 
	 * @param bf - int
	 */
	public abstract void setBounceFactor(int bf);

	/**
	 * Se declara metodo estatico
	 */
	public static void staticMethod() {
		System.out.println("Esto es un metodo statico que vive dentor de una interface");
	}

	/**
	 * Se intenta poner modificador de acceso final , pero en interfaces solo esta
	 * permitido abstract, static, default y strictfp, (DESCOMENTAR EL SIGUIENTE
	 * CÓDIGO PARA VER EL ERROR)
	 */
//	public static final void staticFinalMethod() {
//
//	}

}
