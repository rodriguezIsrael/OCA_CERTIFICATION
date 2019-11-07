package com.examples.oca.inheritance.example_03;

/**
 * Se crea clase base para probar si una variable protected puede usarse en otra
 * clase solo instanciando y que viva en el mismo package
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class A {

	/**
	 * Se declara variable protegida que solo puede usarse en el mismo package o con
	 * herencia
	 */
	protected String sayHelloProtected = "Saludando desde una variable protected";

	/**
	 * Se declara variable publica que puede ser llamada en cualquier clase donde se
	 * haga una instancia de {@link A}
	 */
	public String sayHelloPublic = "Saludando desde una variable publica";

	/**
	 * Variable privada que solo puede ser utilizada en esta misma clase
	 */
	private String sayHelloPrivate = "Saludando desde una variable privada";

	/**
	 * Variable estatica que puede ser llamada en cualquier parte del código de este
	 * proyecto sin realizar una instancia de {@link A}
	 */
	public static String SAY_HELLO_STATIC = "Saludando desde una variable publica statica";

	/**
	 * Método statico que puede usarse en cualquier parte del código de este
	 * proyecto sin realizar una instancia de {@link A}
	 */
	static public void sayHelloMethod() {

		System.out.println("Soy un método que puede llamarse en cualquier lugar sin realizar una instancia de la clase "
				+ A.class.getSimpleName());
	}

	/**
	 * Se crea un metodo final statico que no podra ser sobreescrito
	 */
	public static final void staticFinalMethod() {
		System.out.println("Soy un metodo static final");
	}

}
