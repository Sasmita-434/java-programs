package org.activity.FinalVariablesConstant;

// ACTIVITY - 7 : FINAL VARIABLES AND CONSTANTS

public class Test {

    final static int x = 21;
    // final static int x = 12; //variable x is already defined in class org.activity.FinalVariablesConstant.Test
    final int y = 9;
    // final int y = 10; //variable y is already defined in class org.activity.FinalVariablesConstant.Test

    public static void main(String[] args) {
        System.out.println("x = "+x);
        Test var = new Test();
        System.out.println("y = "+var.y);
    }
}
