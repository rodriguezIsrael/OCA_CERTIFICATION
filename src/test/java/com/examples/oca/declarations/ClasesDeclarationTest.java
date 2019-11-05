package com.examples.oca.declarations;

import org.junit.jupiter.api.Test;

import com.examples.oca.declarations.clases.example_01.ClassPublicB;

/**
 * Clase de pruebas para mostrar cuando si y cuando no se puede acceder a
 * información de una clase con modificador de acceso default package
 * 
 * @author isivroes
 * @since 03/11/2019
 *
 */
public class ClasesDeclarationTest {

	/**
	 * Debe de dar error de compilación debido a que la clase
	 * ClassDefaultPackage.java no tine modificador de acceso, lo que en automatico
	 * la vuelve de tipo [package] y solo podra ser utilizada por clases del mismo
	 * package (SI SE DESCOMENTA LA SIGUIENTE LINEA DE CÓDIGO DARA ERROR LA
	 * COMPILACION)
	 */
//	private ClassDefaultPackage classDefaultPackage = new ClassDefaultPackage();

	private ClassPublicB classPublicB = new ClassPublicB();

	/**
	 * Se intenta llamar a un metodo public que regresa la instancia de un objeto
	 * proveniente de una clase sin modificador de acceso por lo cual dara error
	 * debido a que vive en distintos packages (SI SE DESCOMENTA LA LINEA DE CÓDIGO
	 * COMENTADA SURGIRA UN ERROR DE COMPILACION)
	 */
	@Test
	public void callObjectPublicFromDefaultPackageClass() {
//		System.out.println(classPublicB.callClassDefaultPackage().hello);
//		System.out.println(classPublicB.callClassDefaultPackage().defaultPackage);
	}

	/**
	 * Se llama a una variable de tipo publica que proviene de una clase con
	 * modificador de acceso default package, este llamado es mediante otra clase
	 * publica la cual contiene a la clase con modificador de acceso package
	 */
	@Test
	public void callFielPublicFromPackageClassSincePublicClass() {
		classPublicB.callClassDefaultPackageVariable("Accedo desde una clase publica");

	}

	/**
	 * Se llama a una variable de tipo default package que proviene de una clase con
	 * modificador de acceso default package, este llamado es mediante otra clase
	 * publica la cual contiene a la clase con modificador de acceso package
	 */
	@Test
	public void callFielDefaultPackageFromPackageClassSincePublicClass() {

		System.out.println("Valor obtenido:: " + classPublicB.callDefaultPackageVariableFromClassDefaultPackage());

	}

	/**
	 * Se llama una variable publica desde una clase public final, que no puede ser
	 * extendida pero si instanciada
	 */
	@Test
	public void callPublicFinalClass() {
		System.out.println("Valor obtenido:: " + classPublicB.callPublicFinalClass());
	}

}
