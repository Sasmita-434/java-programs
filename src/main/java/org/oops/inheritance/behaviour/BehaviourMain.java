package org.oops.inheritance.behaviour;


public class BehaviourMain {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2();
        p.method3();
        System.out.println("--------------------------------------------");
        method1();
    }

    private static void method1()
    {
        Child c = new Child();
        System.out.println("Value of i : "+c.i);
        System.out.println("Value of j : "+c.j);
        c.method1();
        c.method2();
        c.method3();
        c.method();
    }
}
