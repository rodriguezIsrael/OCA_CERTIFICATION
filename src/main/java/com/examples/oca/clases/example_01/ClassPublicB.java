package com.examples.oca.clases.example_01;

/**
 * Se declara clase que tiene modificador de acceso publico, por lo cual
 * cualquier clase que este dentro del package o fuera puede utilizarla
 * 
 * @author isivroes
 * @since 03/11/2019
 *
 */
public class ClassPublicB {

	/**
	 * Se declara instancia de una clase que tiene modificador de accso default
	 * package
	 */
	public ClassDefaultPackage defaultPackageOne = new ClassDefaultPackage();

	/**
	 * Se declara instancia de una clase que tiene modificador de acceso default
	 * package, pero en la delcaracion de variable es de tipo publica
	 */
	ClassDefaultPackage defaultPackagePublic = new ClassDefaultPackage();

	/**
	 * Se declara un objeto que tiene como modificador de acceso public final, lo
	 * cual permite que se use pero no heredarse
	 */
	public PublicFinalClass publicFinalClass = new PublicFinalClass();

	/**
	 * Se obtiene la instancia de una clase sin modificador de acceso
	 * [DefaultPackage]
	 * 
	 * @return Regresa una instancia de una clase con modificador de acceso default
	 *         package
	 */
	public ClassDefaultPackage callClassDefaultPackage() {
		System.out.println(
				"Regresando una instancia de un un objeto que proviene de una clase que tiene default package");
		return defaultPackageOne;
	}

	/**
	 * Se invoca a la variable publica de una clase con modificador de accesodefault
	 * package
	 * 
	 * @param msg - Mensage que se le desea concatenar a la variable publica
	 *            proveniente de una clase con [default package]
	 */
	public void callClassDefaultPackageVariable(String msg) {
		System.out.println(
				"Pintanto el valor de una variable de un objeto que proviene de una clase que tiene default package");
		System.out.println(defaultPackageOne.hello + " - " + msg);
	}

	public String callDefaultPackageVariableFromClassDefaultPackage() {
		System.out.println(
				"Pintanto el valor de una variable con modifcador de acceso default package de un objeto que proviene de una clase que tiene default package");
		System.out.println(defaultPackageOne.defaultPackage);
		return defaultPackageOne.defaultPackage;
	}

	/**
	 * Se pinta y retorna el valor de una clase con modificador de acceso public
	 * final
	 * 
	 * @return String - publicFInalClass
	 */
	public String callPublicFinalClass() {
		System.out.println(publicFinalClass.value);
		return publicFinalClass.value;
	}

}
