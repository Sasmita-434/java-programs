package org.activity.VariableInitialization;

// ACTIVITY - 6 : VARIABLE DECLARATION AND INITIALIZATION

public class Test {

    public static int x;
    public String y;

    public static void main(String[] args) {
        m1();
        Test var = new Test();
        var.m2();
    }

    static {
        x = 20;
        System.out.println("INSIDE STATIC BLOCK");
        System.out.println("x = "+x);
        System.out.println("--------------------------------");
    }
    static void m1(){
        x = 30;
        System.out.println("INSIDE STATIC METHOD");
        System.out.println("x = "+x);
        System.out.println("--------------------------------");
    }
    {
        y = "hello";
        System.out.println("INSIDE NON-STATIC BLOCK");
        System.out.println("y = "+y);
        System.out.println("--------------------------------");
    }
    void m2(){
        y = "bye";
        System.out.println("INSIDE NON-STATIC METHOD");
        System.out.println("y = "+y);
        System.out.println("--------------------------------");
    }
}
