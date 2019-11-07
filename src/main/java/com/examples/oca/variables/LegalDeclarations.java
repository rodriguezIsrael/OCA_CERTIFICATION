package com.examples.oca.variables;

/**
 * Clase que tiene declaraciones de variables validas e invalidas
 * 
 * @since 03/11/2019
 * @author isivroes
 */
public class LegalDeclarations {

	/**
	 * Variable que inicia con multiples guiones bajos
	 */
	public static final String _____a = "String _____a";

	/**
	 * Variable que inicia con guion bajo y segido de signo de pesos es valido
	 */
	public static final String _$_$_$ = "String _$_$_$";

	/**
	 * Variable que inicia con simbolo de pesos es valida
	 */
	public static final String $_______Hola = "String $_______Hola";

	/**
	 * Variable declarada con el nombre de "string" (s) minuscula es valido
	 */
	public static final String string = "string";

	/**
	 * Declaración de variables que inician con _ ó $ seguidos de números, son
	 * validas
	 */
	public static final String _1992$ = "String _1992$";

	/**
	 * Variable declarada con el nombre de "doublE" (E) Mayuscula es valido
	 */
	public static final String doublE = "String doublE";

	/**
	 * Variable declarada con el nombre de "inT" (T) Mayuscula es valido
	 */
	public static final String inT = "String inT";

	/**
	 * Variable declarada con el nombre de "CHAR" todo en Mayuscula es valido
	 */
	public static final String CHAR = "String CHAR";

	/**
	 * Variable declarada con el nombre de "Class" con la (C) en mayuscula es valido
	 */
	public static final String Class = "String Class";

	/**
	 * Se declara variable con el nombre de $
	 */
	public static final String $ = "String $";

	/**
	 * No se pueden utilizar declaraciones empezando con números
	 */
//	public String 34_="Declaracion invalida";

	/**
	 * Declaracion invalida con caracteres ubvakudis
	 */
//	public String _{_="Declaracion invalida";

	/**
	 * Declaracion invalida que inicia con un astericso
	 */
//	public String *__ ="Declaracion invalida";

	/**
	 * Declaracion invalida que inicia con un dos puntos
	 */
//	public String :__ ="Declaracion invalida";

	/**
	 * Declaracion invalida que inicia con punto y coma (;)
	 */
//	public String ;__ ="Declaracion invalida";

	/**
	 * Declaracion invalida que inicia con puntos (.)
	 */
//	public String ;__ ="Declaracion invalida";

	public static final void main(String[] main) {
		System.out.println(
				"Se muestran todas las declaraciones de variables que son validas, Tomando en cuenta que todo lo que inicie con $, _ , o una letra es valido");
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
		System.out.println("Valida: " + LegalDeclarations.$);
	}

}
