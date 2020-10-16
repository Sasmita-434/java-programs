package org.oops.inheritance.usecases;

public class Test5 {

    public static void main(String[] args) {

        Parent p = new Child();
    }

    public static class Parent {
        public Parent() { // super class constructor method
            System.out.println("Parent class: "+this.hashCode());
            System.out.println("Parent class: "+this.getClass());
        }
    }

    public static class Child extends Parent {
        public Child() {  // child class constructor method
            super(); // used to invoke the super class constructor,
            // must be written in the first lie of the constructor
            System.out.println("Child class: "+this.hashCode());
            System.out.println("Child class: "+this.getClass());
        }
    }
}
