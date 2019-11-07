package com.examples.oca.inheritance.example_03;

/**
 * Se crea clase para probar multiples tipos de modificadores de acceso
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class B extends A {

	static public void sayHelloMethod() {

		System.out.println("Soy el metodo: sayHelloMethod sobre escrito");
	}

	/**
	 * Se intenta sobre escribir un método, pero da error de compilacion debido a
	 * que el metodo se encuentra con el modificador de acceso final, lo que no
	 * permite que el metodo sea sobreescrito (PARA VISUALIZAR EL ERROR, DESCOMENTAR
	 * LAS SIGUIENTES LINEAS DE CÓDIGO)
	 */
//	public static final void staticFinalMethod() {
//		System.out.println("Intentando sobre escribit un método");
//	}

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

		B b = new B();

		/**
		 * Se invoca al método sobre escrito de la clase A
		 */
		b.sayHelloMethod();

	}

}
