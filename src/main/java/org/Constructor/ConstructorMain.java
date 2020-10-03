package org.Constructor;

public class ConstructorMain {

    public static void main(String[] args) {
        int z;
        ConstructorReturn object1 = new ConstructorReturn();

        System.out.println("Default Constructor");
        System.out.println("x = "+object1.x+" ; "+"y = "+object1.y);
        object1.ConstructorReturn();
        System.out.println("-----------------------------------------");

        System.out.println("Parameterized Constructor");
        object1.ConstructorReturn(28,36);
        System.out.println("-----------------------------------------");

        System.out.println("Constructor Overloading");
        object1.ConstructorReturn(11,33,49);

        object1.ConstructorReturn(21,"Sasmita Pradhan");
    }
}
