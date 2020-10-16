package org.oops.inheritance.usecases;

public class Test3 {

    public static void main(String[] args) {

        Child c = new Child();
        c.m2();
        c.m1();
        System.out.println("----------------------------------------");
        Parent p = new Parent();
        p.m1();
        System.out.println("----------------------------------------");
        p = new Child();
        p.m1();
    }

    public static class Parent {
        public void m1()
        {
            System.out.println("Parent class method m1()");
        }
    }

    public static class Child extends Parent {
        public void m2()
        {
            System.out.println("Child class method m2()");
        }
    }
}
