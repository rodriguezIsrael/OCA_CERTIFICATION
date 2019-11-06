package com.examples.oca.inheritance.example_03;

/**
 * Se crea clase para probar multiples tipos de modificadores de acceso
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class B {

	public static void main(String... strings) {

		/**
		 * Se crea instancia de la clase A que tiene multiples variables
		 */
		A a = new A();

		/**
		 * Se invoca a una variable publica
		 */
		System.out.println(a.sayHelloPublic);

		/**
		 * Se invoca a una variable protected, y se puede acceder desde una clase que se
		 * encuentra en el mismo package o por medio de herencia
		 * 
		 */
		System.out.println(a.sayHelloProtected);

		/**
		 * Se invoca a una variable statica y se puede acceder desde
		 * Clase.VARIABLE_ESTATICA ó desde la instancia del objeto
		 * clase.VARIABLE_ESTATICA
		 */
		System.out.println(A.SAY_HELLO_STATIC);

		/**
		 * Se invoca a una variable statica y se puede acceder desde
		 * Clase.VARIABLE_ESTATICA ó desde la instancia del objeto
		 * clase.VARIABLE_ESTATICA
		 */
		System.out.println(a.SAY_HELLO_STATIC);

		/**
		 * Se invoca a un método estatico sin necesidar de realizar una instancia de la
		 * clase.
		 */
		A.sayHelloMethod();

		/**
		 * Se llama a una variable privada desde otra clase que vive en el mismo package
		 * y da error de complicacion para probar mas a detalle se debe descomentar la
		 * linea de código de abajo
		 */
//		System.out.println(a.sayHelloPrivate);
		

	}

}
