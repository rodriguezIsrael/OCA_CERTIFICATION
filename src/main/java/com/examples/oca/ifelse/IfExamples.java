package com.examples.oca.ifelse;

/**
 * @author Israel I. Rodriguez E. on 16/09/2020
 */
public class IfExamples {
    public static final void main(String... anyThing) {

        boolean resultOne = 10 > 5 ? true : false;

        System.out.println("Ternary  operator result: (1)" + resultOne);

        String resultTwo = 10 > 5 ? 5 > 2 ? "One" : "two" : "three";

        System.out.println("Ternary  operator result: (2)" + resultTwo);

        String resultThree = 10 < 5 ? 5 > 2 ? "One" : "two" : "three";

        System.out.println("Ternary  operator result: (3)" + resultThree);

        String resultFour = 10 < 5 ? 5 < 2 ? "One" : "two" : "three";

        System.out.println("Ternary  operator result: (4)" + resultFour);

        String resultFive = 10 > 5 ? 5 < 2 ? "One" : "two" : "three" ;

        System.out.println("Ternary  operator result: (5)" + resultFive);
    }
}
