package org.oops.inheritance.usecases;

public class Test8 {

    public static void main(String[] args) {

        Parent p = new Child();
        System.out.println("i = " + p.i);
        p.m1();

        Child c = new Child();
        System.out.println("i = " + c.i);
        c.m1();
    }

    public static class Parent {
        public int i = 10;

        public void m1() {
            System.out.println("Inside parent class method : " + i);
        }
    }

    public static class Child extends Parent {

        @Override
        public void m1() {
            System.out.println("Inside child class method : " + i);
        }
    }
}
