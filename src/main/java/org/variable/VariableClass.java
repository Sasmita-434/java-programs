package org.variable;

public class VariableClass {

    public static int variable1;
    public String variable2;
    public static int rollno;
    public String name;
    public static int age = 24;
    public String address = "Khordha";

    static{
        System.out.println("First static variable : "+variable1);
        // System.out.println("First non-static variable : "+variable2);
        rollno = 21;
        System.out.println("My Roll-no is : "+rollno);
        System.out.println("----------------------------------------------");
    }
    {
        System.out.println("First non-static variable : "+variable2);
        name = "SASMITA PRADHAN";
        System.out.println("My name is : "+name);
    }

    public static void main(String[] args) {
        System.out.println("My age is : "+age);
        VariableClass obj1 = new VariableClass();
        System.out.println("I am from : "+obj1.address);
        System.out.println("---------------------------------------------------");
        method1();
        obj1.method2();
    }

    static void method1(){
        variable1 = 2;
        System.out.println("Static variable within static method : "+variable1);
    }
    void method2(){
        variable2 = "Second variable";
        System.out.println("Non-static variable within non-static method : "+variable2);
        System.out.println("---------------------------------------------------");
    }
    public VariableClass(){
        System.out.println("This is a constructor");
        variable1 = 3;
        variable2 = "Third variable";
        System.out.println("Static variable within constructor : "+variable1);
        System.out.println("Non-static variable within constructor : "+variable2);
    }
}
