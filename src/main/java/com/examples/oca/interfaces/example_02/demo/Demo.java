package com.examples.oca.interfaces.example_02.demo;

import com.examples.oca.interfaces.example_02.Implementation;
import com.examples.oca.interfaces.example_02.InterfaceA;
import com.examples.oca.interfaces.example_02.InterfaceB;
import com.examples.oca.interfaces.example_02.InterfaceC;

/**
 * Se crea clase de prueba para multiples interfaces
 * 
 * @since 06/11/2019
 * @author isivroes
 *
 */
public class Demo {

	public static void main(String... string) {

		/**
		 * Se asigna una instancia de implementacion a la interface A
		 */
		InterfaceA interfaceA = new Implementation();

		Implementation implementacion = new Implementation();

		System.out.println("-------- Metodos vistos por las interfaces --------");
		/**
		 * Se crea una instancia de implementacion a la interface B
		 */
		InterfaceB interfaceB = new Implementation();

		/**
		 * Se crea una instancia de implementacion a la interface C
		 */
		InterfaceC interfaceC = new Implementation();

		/**
		 * La interface A solo puede visualizar al metodo A
		 */
		interfaceA.methodA();

		/**
		 * La interface A solo puede visualizar al metodo B
		 */
		interfaceB.methodB();

		/**
		 * La interface A solo puede visualizar al metodo C
		 */
		interfaceC.methodC();

		System.out.println("-------- --------------------------------- --------");

		System.out.println("-------- Metodos vistos por las implementaciones --------");

		/**
		 * La implementacion ve a todos los metodos (A,B,C)
		 */
		implementacion.methodA();

		/**
		 * La implementacion ve a todos los metodos (A,B,C)
		 */
		implementacion.methodB();

		/**
		 * La implementacion ve a todos los metodos (A,B,C)
		 */
		implementacion.methodC();

		System.out.println("-------- --------------------------------- --------");

	}

}
