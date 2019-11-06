package com.examples.oca.inheritance.example_01;

/**
 * 
 * Clase que tiene multiples ejemplos, en esta clase se hereda de Fruit y se
 * utiliza la sobreescritura de metodos, Se llama al metodo sobre escrito y al
 * metodo original
 * 
 * @author isivroes
 * @since 04/11/2019
 *
 */
public class Apple extends Fruit {

	/**
	 * Se implementa método abstracto
	 */
	@Override
	public void abstractMethod() {
		System.out.println("This is an abstract method");

	}

	/**
	 * Se sobre escribe el metodo del padre
	 */
	public void overridedMethod() {
		System.out.println("Sobre escribi al metodo original");
	}

	/**
	 * CUando se sobre escribe un metodo y se manda a llamar con la palabra
	 * reservada this, se llama al método sobre escrito y no al original
	 */
	public void callOverridedMethod() {
		this.overridedMethod();
	}

	/**
	 * Cuando se quiere llamar al método real y no al sobreescrito, se utiliza la
	 * palabra reservada super.
	 */
	public void callRealMethod() {

		super.overridedMethod();
	}

}
