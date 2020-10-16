package org.oops.inheritance.usecases;

public class Test10 {

    public static void main(String[] args) {

        Child c = new Child(); // displays no output,
        // no parameter passed to the parent class param constructor
    }

    public static class Parent {
        private int i;
        public Parent(int i) {
            this.i = i;
            System.out.println(this.i);
        }
        public Parent() {
        }
    }

    public static class Child extends Parent {
        public Child() {
            super();
        }
    }
}
