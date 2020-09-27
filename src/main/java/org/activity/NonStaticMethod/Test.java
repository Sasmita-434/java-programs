package org.activity.NonStaticMethod;

// ACTIVITY - 3 : NON-STATIC METHOD

    public class Test {

        public int age;     //static variable

        public static void main(String[] args) {
           Test var = new Test();
           var.m1();
        }
        //non-static method
        void m1(){
            age = 21;
            System.out.println("INSIDE STATIC METHOD");
            if(age >= 18)
                System.out.println("Eligible to Vote");
            else
                System.out.println("Not eligible to vote");
        }
        void m2(){
            age = 9;
            if(age >= 18)
                System.out.println("Eligible to vote");
            else
                System.out.println("Not eligible to vote");
            m1();
        }
        //non-static block
        {
            System.out.println("INSIDE NON-STATIC BLOCK");
            m1();
            System.out.println("--------------------------------");
        }
}
