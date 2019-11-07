package com.examples.oca.inheritance.example_01;

/**
 * Clase abstracta utilizada para heredar
 * 
 * @since 04/11/2019
 * @author isivroes
 *
 */
public abstract class Fruit {

	/**
	 * Método abstracto sin cuerpo, que oblica a que la clase que lo herede, tenga
	 * que implementar el metodo
	 */
	public abstract void abstractMethod();

	/**
	 * No se puede colocar un modificador de acceso privado a un metodo abstracto
	 */
//	private abstract void privateAbstractMethod();

	/**
	 * Es valido poner un metodo abstracto como protected
	 */
	protected abstract void protectedAbstract();

	/**
	 * Método abstracto que tiene el modificador de acceso final, esto no esta
	 * permitido cuando se tiene el modificador de acceso abstract, [Descomentar la
	 * linea de código para visualizar el error]
	 */
//	public final abstract void finalAbstractMethod();

	/**
	 * Método abstracto con cuerpo, lo cual da un error de compilacion [Descomentar
	 * texto para comprobarlo]
	 */
//	public abstract void abstractMethod() {
//		
//	}

	/**
	 * Método publico que se heredara
	 */
	public void method() {
		System.out.println("This is an example");
	}

	/**
	 * Método que sera sobre escrito
	 */
	public void overridedMethod() {
		System.out.println("Soy el metodo original");
	}

}
