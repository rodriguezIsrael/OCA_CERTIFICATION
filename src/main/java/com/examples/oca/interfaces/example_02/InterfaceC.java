package com.examples.oca.interfaces.example_02;

/**
 * Se declara una interface de ejemplo
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public interface InterfaceC {

	/**
	 * Declaracion valida
	 */
	void methodC();

	/**
	 * Método invalido, no se puede poner modificador de acceso privado a un metodo
	 * de una interface
	 */
//	private void example();

	/**
	 * No se puede poner modificador de acceso protected a una interface
	 */
//	protected void example();

}
