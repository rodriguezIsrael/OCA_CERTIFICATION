package com.examples.oca.finalize;

/**
 * @author Israel I. Rodriguez E. on 16/09/2020
 */
public class FinalizeExample {

    private void great() {
        System.out.println("Hello!!");
    }


    /**
     * It's call only when it's executed garbage collector
     */
    protected void finalize() {
        System.out.println("Finalize: Close any connection to DB.");
    }


    public static void main(String x[]) throws Throwable {

        FinalizeExample finalizeExample = new FinalizeExample();
        finalizeExample.great();

        finalizeExample.finalize();
    }
}
