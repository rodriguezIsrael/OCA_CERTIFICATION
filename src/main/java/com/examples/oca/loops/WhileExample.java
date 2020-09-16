package com.examples.oca.loops;

/**
 * Ejemplos de ciclo while
 */
public class WhileExample {
    public static final void main(String... x) {

        /**
         * Este código se ejecuta por que el resultado es true debido a que se
         * realiza una asignacion y no una comparacion
         */
        boolean result = false;

        while (result = true) {
            System.out.println("Ejecutando");
            result = false;
        }

        while (true)
            System.out.println("Ejecutando sin llaves");
    }
}
