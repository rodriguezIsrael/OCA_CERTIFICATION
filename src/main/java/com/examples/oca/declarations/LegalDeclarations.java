package com.examples.oca.declarations;

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

}
