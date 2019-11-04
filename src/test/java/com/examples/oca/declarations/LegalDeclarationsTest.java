package com.examples.oca.declarations;

import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas para mostrar las declaraciones de variables que son validas
 * 
 * @author isivroes
 * @since 03/11/2019
 *
 */
public class LegalDeclarationsTest {

	/**
	 * Se muestran nombres de declaraciones de variables que son validas
	 */
	@Test
	public void legalDeclarations() {

		System.out.println("Se muestran todas las declaraciones de variables que son validas, Tomando en cuenta que todo lo que inicie con $, _ , o una letra es valido");
		System.out.println("No se permiten caracteres extraños como * , . # : ;");

		System.out.println("Valida: " + LegalDeclarations.$_______Hola);
		System.out.println("Valida: " + LegalDeclarations._$_$_$);
		System.out.println("Valida: " + LegalDeclarations._1992$);
		System.out.println("Valida: " + LegalDeclarations._____a);
		System.out.println("Valida: " + LegalDeclarations.CHAR);
		System.out.println("Valida: " + LegalDeclarations.Class);
		System.out.println("Valida: " + LegalDeclarations.doublE);
		System.out.println("Valida: " + LegalDeclarations.inT);
		System.out.println("Valida: " + LegalDeclarations.string);
	}

}
