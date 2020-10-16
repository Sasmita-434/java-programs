package org.oops.inheritance.usecases;

public class Test9 {

    public static void main(String[] args) {

        Parent p = new Child();
        //System.out.println(p.i);
        p.m1();

        Child c = new Child();
        System.out.println(c.i);
        c.m1();
    }

    public static class Parent {
        //public int i = 10;
        public void m1()
        {
            System.out.println("Inside parent class method");
        }
    }

    public static class Child extends Parent {
        public int i = 21;

        @Override
        public void m1()
        {
            System.out.println("Inside child class method : "+i);
        }
    }
}
