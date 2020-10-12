package org.oops.inheritance.behaviour;

public class Child extends Parent{

    public int j = 10;

    public void method(){
        System.out.println("This a child class method");
    }

    // method overriding
    public void method1(){
        System.out.println("This is a child class method-1");
    }

    // method hiding
    public static void method2(){
        System.out.println("This a child class static method-2");
    }

}
