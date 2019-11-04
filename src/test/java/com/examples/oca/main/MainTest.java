package com.examples.oca.main;

import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas para metodos main
 * 
 * @author isivroes
 * @since 03/11/2019
 *
 */
public class MainTest {

	/**
	 * Se genera ejemplo invocando un main sin pasarle argumentos
	 */
	@Test
	public void testMainWithOutArgs() {

		MainDefault.main();
	}

	/**
	 * Se genera un ejemplo invocando a un main pasandole argumentos de tipo varargs
	 */
	@Test
	public void testMainWithArgs() {

		MainDefault.main("Texto uno", "Texto 2", "Texto 3");
	}

	/**
	 * Se genera ejemplo invocando a un main que tiene modificador de acceso final
	 */
	@Test
	public void testMainWithFinal() {
		String[] array = new String[3];
		array[0] = "Esto es un ";
		array[1] = " main con modificador final ";
		MainFinal.main(array);
	}
}
