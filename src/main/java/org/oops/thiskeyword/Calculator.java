package org.oops.thiskeyword;

public class Calculator {

    private int i;
    private int j;

    {
        System.out.println("Inside Instance block");
        i = 20;
        System.out.println("i = "+i);
        this.i = 21;
        System.out.println("i = "+i);
        System.out.println("i = "+this.i);
        System.out.println(this.hashCode());
        System.out.println("--------------------------------------");
    }

    public Calculator(int x)
    {
        System.out.println("Inside constructor method");
        System.out.println(this.hashCode());
        this.i = x;
        System.out.println("i = "+this.i);
        System.out.println("--------------------------------------");
    }

    public Calculator(int x, int y)
    {
        i = x;
        j = y;
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("Sum = "+sum());
        System.out.println(this.hashCode());
        System.out.println("--------------------------------------");
    }

    public int sum()
    {
        return i + j;
    }
}
