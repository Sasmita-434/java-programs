package org.oops.inheritance.usecases;

public class Test4 {

    public static void main(String[] args) {
        Child  c = new Child();
        c.m1(); // overridden method
        c.m2(); // static method of child class
        System.out.println("--------------------------------------------");
        Parent p = new Parent();
        p.m1();
        p.m2(); // static method of parent class
    }

    public static class Parent {
        public void m1()
        {
            System.out.println("Parent class method m1()");
        }
        public static void m2()
        {
            System.out.println("Parent class static method m2()");
        }
    }

    public static class Child extends Parent {
        @Override
        public void m1()
        {
            System.out.println("Child class method m1()");
        }
        public static void m2()
        {
            System.out.println("Child class static method m2()");
        }
    }
}
