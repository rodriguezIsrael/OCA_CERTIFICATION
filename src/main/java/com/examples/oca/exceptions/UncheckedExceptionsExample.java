package com.examples.oca.exceptions;

/**
 * @author Israel I. Rodriguez E. on 16/09/2020
 */
public class UncheckedExceptionsExample {

    public static final void main(String[] x) {


        int opcion = 3;

        switch (opcion) {
            case 1:
                /**
                 * Este ejemplo lanza una excepcion que el compilador no detecta, es una excepcion generada en tiempo de ejecucion.
                 */
                System.out.println("Generando unchecked excepcion");
                String value = null;
                value.toUpperCase();
                break;
            case 2:
                /**
                 * Se lanza una excepción, misma que no se pedira atrapar o propagar
                 */
                System.out.println("Generando unchecked excepcion personalizada");
                if (true) {
                    throw new MyUnchekedException();
                }
                break;
            case 3:
                /**
                 * Se lanza una excepción, misma que se pedira atrapar o propagar
                 */
                System.out.println("Generando excepcion checked personalizada");
                if (true)
                    try {
                        throw new MyCheckedException();
                    } catch (MyCheckedException e) {// La compilacion nos soliita atrapar la excepcion o propagarla
                        e.printStackTrace();
                    }
                break;
        }

    }





}
