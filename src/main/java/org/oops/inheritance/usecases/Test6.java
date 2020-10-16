package org.oops.inheritance.usecases;

public class Test6 {

    // variable hiding
    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println("Parent class variable i = "+p.i);

        Child c = new Child();
        System.out.println("Child class variable i = "+c.i);

        p = new Child();
        System.out.println(p.i);
    }

    public static class Parent
    {
        public int i = 10;

    }

    public static class Child extends Parent
    {
        public int i = 21;
    }
}
