package org.Constructor;

public class ConstructorReturn {

    int x = 21;
    int y = 32;
    int z;

    public void ConstructorReturn()
    {
        System.out.println("Substraction of x & y = "+(x-y));
        System.out.println("Before initialization, z = "+z);
        z = 9;
        System.out.println("After initialization, z = "+z);
    }

    public void ConstructorReturn(int x, int y)
    {
        System.out.println("x = "+x+" ; "+"y = "+y);
        System.out.println("Multiplication of x & y = "+(x*y));
        System.out.println("Before initialization, z = "+z);
        z = x;
        System.out.println("After initialization, z = "+z);
    }

    public void ConstructorReturn(int x, int y, int z)
    {
        System.out.println("x = "+x+" ; "+"y = "+y+" ; "+"z = "+z);
        System.out.println("Summation of x, y, & z = "+(x+y+z));
    }

    public void ConstructorReturn(int roll, String name)
    {
        System.out.println("My Roll no. = "+roll);
        System.out.println("My Name = "+name);
    }

}
