package org.activity.classandobjects;

public class Test1 {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.hashCode() == obj2.hashCode());
        //false, as input value of both the objects or their states are not same/unequal
        System.out.println(obj1.getClass());
        //returns the runtime class of the object
        System.out.println(obj1 == obj2);
        //false, both the objects are not same or have different values
    }
}
