package org.activity.classandobjects;

public class Test12 {

    static int x;  // static variable
    int y;

    static{
        x = 10;
        System.out.println("x = "+x);
    }

    static{
        x = x + 20;
        System.out.println("x = "+x);
    }

    {
        y = 100;
        System.out.println("y = "+y);
    }

    {
        y = y + 20;
        System.out.println("y = "+y);
    }

    public static void main(String[] args)
    {
        Test12 t = null;
        t.x = t.x + 40;
        x = x + 50;

        // t.y = t.y + 200; // NullPointerException
        t = new Test12();
        t.y = t.y + 200;

        Test12 t1 = new Test12();
        System.out.println(t.x);
        System.out.println(t1.x);
        System.out.println(Test12.x);

        System.out.println(t.y);
        System.out.println(t1.y);

        System.out.println(t.getX());
        System.out.println(t1.getX());
        System.out.println(Test12.getX());

        System.out.println(t.getSum());
        System.out.println(t1.getSum());

    }

    public static int getX()  // static method
    {
        return x;
    }

    public int getSum()
    {
        return  x + y;
    }
}
