package org.oops.constructor;

public class ConstructorRun {

        public static void main(String[] args) {
            ConstructorVoid default_object = new ConstructorVoid();
            System.out.println("Inside Main method");
            System.out.println("i = "+default_object.i+" ; "+"j = "+default_object.j);
            ConstructorVoid default_object2 = new ConstructorVoid();
            System.out.println(default_object == default_object2);  //false
            System.out.println("for default_object2, i = "+default_object2.i);
            default_object2.i = 9;
            System.out.println("for default_object2, i = "+default_object2.i);

            System.out.println("-------------------------------------------------");

            ConstructorVoid parameterized_object = new ConstructorVoid(21,32);
            System.out.println("i = "+parameterized_object.i+" ; "+"j = "+parameterized_object.j);
            ConstructorVoid parameterized_object2 = new ConstructorVoid(51,88);
            System.out.println("i = "+parameterized_object2.i+" ; "+"j = "+parameterized_object2.j);
            System.out.println(parameterized_object == parameterized_object2);  //false

            System.out.println("-------------------------------------------------");

            System.out.println("Constructor overloading");
            ConstructorVoid overloading_object1 = new ConstructorVoid(9);
            ConstructorVoid overloading_object2 = new ConstructorVoid(39,56);
            ConstructorVoid overloading_object3 = new ConstructorVoid(21,"SASMITA");

            System.out.println("-------------------------------------------------");

            System.out.println("x = "+overloading_object1.i+" ; "+"y = "+overloading_object1.j);
            System.out.println("x = "+overloading_object2.i+" ; "+"y = "+overloading_object2.j);
            System.out.println("x = "+overloading_object3.i+" ; "+"y = "+overloading_object3.s);
        }

}
