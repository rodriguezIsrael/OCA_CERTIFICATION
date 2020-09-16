package com.examples.oca.loops;

/**
 * @author Israel I. Rodriguez E.
 */
public class LabelledContinueExample {
    public static final void main(String... a) {

        System.out.println("Sample with label");
        SAMPLE:
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println("j: " + j);
                if (j % 2 == 0) {
                    continue SAMPLE;
                }
            }
        }

        System.out.println("Sample with break label");
        SAMPLE_TWO:
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            SAMPLE_X:
            for (int j = 1; j < 10; j++) {
                System.out.println("j: " + j);
                if (j % 2 == 0) {
                    break SAMPLE_TWO;
                }
            }
        }
    }
}
