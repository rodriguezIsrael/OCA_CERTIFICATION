package com.examples.oca.interfaces.example_01.demo;

import com.examples.oca.interfaces.example_01.Bounceable;
import com.examples.oca.interfaces.example_01.Tire;

/**
 * Clase de ejemplo para interfaces
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class Demo {

	public static void main(String... x) {

		/**
		 * Se declara instancia de Tiro
		 */
		Bounceable bounceable = new Tire();

		bounceable.bounce();

		bounceable.setBounceFactor(10);

		/**
		 * Se intenta llamar al método estatico pero no se tiene acceso, solo se puede
		 * tener acceso directamente de la interface [Descomentar el siguiente código
		 * para ver el error]
		 */
//		bounceable.staticMethod();

		/**
		 * Se invoca a un método estatico que vive en la interface
		 */
		Bounceable.staticMethod();
	}

}
