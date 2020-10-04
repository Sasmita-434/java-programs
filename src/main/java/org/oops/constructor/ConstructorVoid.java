package org.oops.constructor;

import javax.swing.plaf.IconUIResource;

public class ConstructorVoid {

    int i;
    int j;
    String s;

    public ConstructorVoid()
    {
        System.out.println("Default constructor");
        System.out.println("Before Initialization : "+i+" ; "+"j = "+j);
        i = 10;
        System.out.println("After Initialization : "+i+" ; "+"j = "+j);
    }

    public ConstructorVoid(int x, int y)
    {
        System.out.println("2 Parameterized constructor");
        System.out.println("Before Initialization : i = "+i+" ; "+"j = "+j);
        i = x;
        j = y;
        System.out.println("After Initialization : i = "+i+" ; "+"j = "+j);
    }

    public ConstructorVoid(int x, String y)
    {
        System.out.println("2 types of Parameterized constructor");
        i = x;
        s = y;
        System.out.println("x = "+i);
        System.out.println("y = "+s);
    }

    public ConstructorVoid(int x)
    {
        System.out.println("1 Parameterized constructor");
        i = x;
        System.out.println("x = "+i);
    }
}
