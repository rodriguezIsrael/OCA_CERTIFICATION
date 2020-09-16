package com.examples.oca.variables;

/**
 * variables mas chicas pueden asignarse en variables de mayor rango,
 * y una variable de mayor rango, puede asignarse a una variable de menor rango realizando casteos.
 *
 * @author Israel I. Rodriguez Espinoza
 */
public class DataTypes {
    public static void main(String... args) {
        System.out.println("Hola mundo");

        byte byteOne = 5;
        byte byteTwo = 1;
        byte result = (byte) (byteOne + byteTwo);
        System.out.println("byte = byte + byte; Solo funciona si se realiza casteo del resultado ");
        System.out.println("Resultado: " + result);

        int intOne = 0;
        intOne = byteOne;

        System.out.println("Se asigna un byte a un int, y automaticamente se realiza conversion: " + intOne);

        byteOne = (byte) intOne;
        System.out.println("Un int no se puede asignar a un byte, al menos que se haga un casteo: " + byteOne);

        long longOne = 10;

        int resultLong = (int) (longOne + longOne);
        System.out.println("Un long puede asignarse a un int, con parseo: " + resultLong);
        double resultDouble = resultLong;
        System.out.println("Un long puede asignarse a un double sin casteo" + resultDouble);

    }
}
