package org.activity.ParameterizedMethod;

// ACTIVITY - 4 : PARAMETERIZED METHODS

public class Test {

    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println("Sum of x & y = "+result);
    }

    static int sum(int x, int y) {
        return (x+y);
    }
}
