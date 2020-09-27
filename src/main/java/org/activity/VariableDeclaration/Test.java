package org.activity.VariableDeclaration;

// ACTIVITY - 5 : VARIABLE DECLARATION

public class Test {

    static int x;
    public String y;

    public static void main(String[] args) {
        Test var = new Test();
        m1();
        var.m2();
        System.out.println("INSIDE MAIN METHOD");
        System.out.println("Value of x = "+x);
        //System.out.println("Value of y = "+y);
        System.out.println("-------------------------------------");
    }
    static {
        System.out.println("INSIDE STATIC BLOCK");
        System.out.println("Value of x = "+x);
       // System.out.println("Value of y = "+y); //non-static variable cannot be accessed by static block
        System.out.println("------------------------------------");
    }
    {
        System.out.println("INSIDE NON-STATIC BLOCK");
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
        System.out.println("-------------------------------------");
    }
    static void m1(){
        System.out.println("INSIDE STATIC METHOD");
        System.out.println("Value of x = "+x);
        //System.out.println("Value of y = "+y); //non-static variable cannot be accessed by static method
        System.out.println("-------------------------------------");
    }
    void m2(){
        System.out.println("INSIDE NON-STATIC METHOD");
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
        System.out.println("-------------------------------------");
    }
}
