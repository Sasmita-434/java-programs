package org.activity.StaticMethod;

// ACTIVITY - 2 : STATIC METHOD

    public class Test {

        public static int number;     //static variable
        public static void main(String[] args) {
            m1();
            m2();
        }
        //static method
        static void m1(){
            number = 33;
            if(number % 2 == 0)
                System.out.println(number+" is an even number");
            else
                System.out.println(number+" is an odd number");
        }
        static void m2(){
            number = 18;
            if(number % 2 == 0)
                System.out.println(number+" is an even number");
            else
                System.out.println(number+" is an odd number");
            m1();
        }
        //static block
        static {
            System.out.println("INSIDE STATIC BLOCK");
            m1();
            System.out.println("--------------------------------");
        }
}
