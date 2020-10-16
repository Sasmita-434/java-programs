package org.oops.inheritance.usecases;

public class Test7 {

    // use of variable with this object
    public static void main(String[] args) {

        Parent p = new Child();
        System.out.println("i = "+p.i);
        p.m1();

        Child c = new Child();
        System.out.println("i = "+c.i);
        c.m1();

    }

    public static class Parent {
        public int i = 10;
        public void m1()
        {
            System.out.println("Inside parent class method: "+i);
        }
    }

    public static class Child extends Parent {
        public int i = 21;

        @Override
        public void m1()
        {
            System.out.println("Inside child class method: "+i);
        }
    }
}
