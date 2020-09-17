package com.examples.oca.exceptions;

/**
 * @author Israel I. Rodriguez E. on 16/09/2020
 */
public class MyCheckedException extends Exception {

    public MyCheckedException() {
        super("Generando excepcion unchecked [RuntimeException]");
    }
}
