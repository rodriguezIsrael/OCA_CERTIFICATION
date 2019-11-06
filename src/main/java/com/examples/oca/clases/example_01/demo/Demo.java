package com.examples.oca.clases.example_01.demo;

import com.examples.oca.clases.example_01.ClassPublicB;

/**
 * Clase de pruebas para mostrar cuando si y cuando no se puede acceder a
 * información de una clase con modificador de acceso default package
 * 
 * @author isivroes
 * @since 03/11/2019
 *
 */
public class Demo {

	public static final void main(String[] loQueSea) {

		/**
		 * Debe de dar error de compilación debido a que la clase
		 * ClassDefaultPackage.java no tine modificador de acceso, lo que en automatico
		 * la vuelve de tipo [package] y solo podra ser utilizada por clases del mismo
		 * package (SI SE DESCOMENTA LA SIGUIENTE LINEA DE CÓDIGO DARA ERROR LA
		 * COMPILACION)
		 */
//		 ClassDefaultPackage classDefaultPackage = new ClassDefaultPackage();

		ClassPublicB classPublicB = new ClassPublicB();

		/**
		 * Se intenta llamar a un metodo public que regresa la instancia de un objeto
		 * proveniente de una clase sin modificador de acceso por lo cual dara error
		 * debido a que vive en distintos packages (SI SE DESCOMENTA LA LINEA DE CÓDIGO
		 * COMENTADA SURGIRA UN ERROR DE COMPILACION)
		 */
//		System.out.println(classPublicB.callClassDefaultPackage().hello);
//		System.out.println(classPublicB.callClassDefaultPackage().defaultPackage);

		/**
		 * Se llama a una variable de tipo publica que proviene de una clase con
		 * modificador de acceso default package, este llamado es mediante otra clase
		 * publica la cual contiene a la clase con modificador de acceso package
		 */
		classPublicB.callClassDefaultPackageVariable("Accedo desde una clase publica");

		/**
		 * Se llama a una variable de tipo default package que proviene de una clase con
		 * modificador de acceso default package, este llamado es mediante otra clase
		 * publica la cual contiene a la clase con modificador de acceso package
		 */
		System.out.println("Valor obtenido:: " + classPublicB.callDefaultPackageVariableFromClassDefaultPackage());
		
		/**
		 * Se llama una variable publica desde una clase public final, que no puede ser
		 * extendida pero si instanciada
		 */
		System.out.println("Valor obtenido:: " + classPublicB.callPublicFinalClass());


	}

}
