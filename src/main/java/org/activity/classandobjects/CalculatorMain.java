package org.activity.classandobjects;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator c = new Calculator(10,20);
        System.out.println("Sum = "+c.sum());
    }
}
