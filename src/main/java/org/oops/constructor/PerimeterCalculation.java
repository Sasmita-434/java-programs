package org.oops.constructor;

public class PerimeterCalculation {

    public static void main(String[] args) {

        Perimeter perimeter = new Perimeter();
        System.out.println("----------------------------------------------");
        Perimeter Square = new Perimeter(4.2);
        System.out.println("----------------------------------------------");
        Perimeter Rectangle = new Perimeter(8,3.5);
        System.out.println("----------------------------------------------");
        Perimeter Triangle = new Perimeter(10.5,8.2,6);
    }
}
