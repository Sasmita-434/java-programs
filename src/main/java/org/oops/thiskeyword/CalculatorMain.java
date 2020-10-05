package org.oops.thiskeyword;

import java.util.concurrent.Callable;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator object1 = new Calculator(10);
        System.out.println(object1.hashCode());

        Calculator object2 = new Calculator(9,21);
        System.out.println(object2.hashCode());
        int result = object2.sum();
        System.out.println("Sum = "+result);
    }
}
