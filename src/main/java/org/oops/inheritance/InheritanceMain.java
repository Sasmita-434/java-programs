package org.oops.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Child c = new Child();

        System.out.println("Calling child class method from main");
        c.child_check();
        System.out.println("Calling parent class method from main");
        c.parent_check();
    }
}
