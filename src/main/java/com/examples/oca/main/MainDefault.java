package com.examples.oca.main;

/**
 * Clase que contiene un main con los modificadores de acceso [public static]
 * 
 * @author isivroes
 * @since 03/11/2019
 */
public class MainDefault {

	/**
	 * Método main con los modificadores de acceso [public static]
	 * 
	 * @param args Arreglo de Strings de tipo [varargs]
	 */
	public static void main(String... args) {

		System.out.println("Esto es un main con vargs [...] los cuales deben de ir justo despues del tipo de variable");

		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Valor [" + i + "] -> " + args[i]);
			}
		}

	}

}
