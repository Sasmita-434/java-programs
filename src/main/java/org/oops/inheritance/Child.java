package org.oops.inheritance;

public class Child extends Parent{

    public Child(){
        super();
        System.out.println("Inside Child class");
        System.out.println("Parent variable1 in Child class : "+number1);
        parent_check();
        System.out.println("------------------------------------------");
    }

    public void child_check(){
        number2 = 20;
        System.out.println("Parent variable1 in Child class : "+number2);
        if(number2 % 2 == 0)
            System.out.println(number2+" is an even number");
        else
            System.out.println(number2+" is a odd number");
    }
}
