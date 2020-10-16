package org.activity.classandobjects;

public class Test5 {

    int x;
    String y;

    public static void main(String[] args) {
        Test5 t = new Test5();
        System.out.println(t.x); //returns 0, default value of an integer as no value is assigned to x
        System.out.println(t.y); // returns null, default value of string as no value is assigned to y
    }
}
