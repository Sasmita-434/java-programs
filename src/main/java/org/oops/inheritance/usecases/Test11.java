package org.oops.inheritance.usecases;

public class Test11 {

    public static void main(String[] args) {

        Child c = new Child();
    }

    public static class Parent {
        private int i;

        public Parent(int i) {
            this.i = i;
            System.out.println("Inside parent class : "+this.i);
        }
        // public Parent() {}
    }

    public static class Child extends Parent {
        public Child()
        {
            super(10); // invoke parent class param constructor
        }
    }
}
