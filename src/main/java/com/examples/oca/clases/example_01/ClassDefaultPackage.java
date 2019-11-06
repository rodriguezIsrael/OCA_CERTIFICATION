package com.examples.oca.clases.example_01;

/**
 * Clase sin modificador de acceso, por lo cual esta clase tendra el modificador
 * de acceso package
 * 
 * Lo que quiere decir que solo las clases que vivan dentro de la misma clase
 * pueden utilizar estos valores
 * 
 * @since 03/11/2019
 * @author isivroes
 *
 */
class ClassDefaultPackage {

	/**
	 * Se declara variable publica.
	 */
	public String hello = "Soy una variable publica que proviene de una clase sin modificador de acceso";

	/**
	 * Se declara variable sin modificador de acceso, la que la convierte en una
	 * variable con modificaor de acceso default package y que solo clases qyue
	 * vivan en el mismo package pueden llamarla
	 */
	String defaultPackage = "Soy una variable con modificador de acceso default package";

}
