package org.oops.inheritance.usecases;

public class Test1 {

    public static void main(String[] args)
    {
        Child c = new Child();
        c.m2();
    }

    //base class or super class
    public static class Parent {
        public int i;
        protected int j;
        private int k; // private is not accessible to outside of the class

        public void m1() {
            System.out.println("Parent class method m1()");
        }
    }
    // child class or sub-class inherits base class properties
    public static class Child extends Parent {
        public void m2() {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
            // System.out.println("k: "+k); // private field
            m1(); // base class method
            System.out.println("Child class method m2()");
        }
    }
}
