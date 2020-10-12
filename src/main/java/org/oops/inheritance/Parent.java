package org.oops.inheritance;

public class Parent {

    public int number1;
    public int number2;

    public Parent(){

        this.number1 = 9;
    }

    public void parent_check(){

        if(number1 % 2 == 0)
            System.out.println(number1+" is an even number");
        else
            System.out.println(number1+" is a odd number");
    }
}
