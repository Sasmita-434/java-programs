package org.oops.inheritance.usecases;

public class Test12 {

    public static void main(String[] args) {

        new Child(10);
    }

    public static class Parent {
        private int i;
        public Parent(int i) {
            this.i = i;
            System.out.println("Inside parent class : "+this.i);
        }
    }

    public static class Child extends Parent
    {
        public Child(int i) {
            super(i); // invoke param constructor, and no new object is created
        }
    }
}
