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

    public static void metricIssueOne(Object object) {
        if (object == null) {
            System.out.println("Big no-no");
        }
        System.out.println("Hashcode: " + object.hashCode());
    }

    public static void metricIssueTwo() {
        Uncovered o1 = new Uncovered();
        Uncovered o2 = new Uncovered();
        boolean result = o1 == o2;
        System.out.println("Result: " + result);
    }

    public static void main(String args[]) {
        new Uncovered().justSomeGenericMethod();
    }
}
