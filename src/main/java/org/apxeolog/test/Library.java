package org.apxeolog.test;

/**
 * Created by APXEOLOG on 31.10.2017.
 */
public class Library {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int something(int a, int b) {
        return sum(a, b) - mul(a, b);
    }

    public static void main(String args[]) {
        new Uncovered().justSomeGenericMethod();
    }
}
