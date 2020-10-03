package org.Constructor;

public class ConstructorMain {

    public static void main(String[] args) {

        ConstructorReturn object1 = new ConstructorReturn();
        ConstructorReturn object2 = new ConstructorReturn();
        ConstructorReturn object3 = new ConstructorReturn();

        System.out.println("Default Constructor");
        System.out.println("x = "+object1.x+" ; "+"y = "+object1.y+" ; "+"z = "+object1.z);
        object1.ConstructorReturn();
        System.out.println(object1 == object2);
        System.out.println("Before initialization in main(), z = "+object2.z);
        object2.z = 10;
        System.out.println("After initialization in main(), z = "+object2.z);

        System.out.println("-----------------------------------------");

        System.out.println("Parameterized Constructor");
        System.out.println("Before initialization,in main() z = "+object1.z);
        object1.ConstructorReturn(28,36);
        System.out.println("After initialization, in main() z = "+object1.z);
        System.out.println("For object2, z = "+object2.z);
        System.out.println("For object3, z = "+object3.z);

        System.out.println("-----------------------------------------");

        System.out.println("Constructor Overloading");
        object1.ConstructorReturn(11,33,49);

        object1.ConstructorReturn(21,"Sasmita Pradhan");
    }
}
