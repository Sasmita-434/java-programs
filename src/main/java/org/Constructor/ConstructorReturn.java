package org.Constructor;

public class ConstructorReturn {

    int x = 21;
    int y = 32;

    public void ConstructorReturn(){
        System.out.println("Substraction of x & y = "+(x-y));
    }

    public void ConstructorReturn(int x, int y){
        System.out.println("x = "+x+" ; "+"y = "+y);
        System.out.println("Multiplication of x & y = "+(x*y));
    }

    public void ConstructorReturn(int x, int y, int z){
        System.out.println("x = "+x+" ; "+"y = "+y+" ; "+"z = "+z);
        System.out.println("Summation of x, y, & z = "+(x+y+z));
    }

    public void ConstructorReturn(int roll, String name){
        System.out.println("My Roll no. = "+roll);
        System.out.println("My Name = "+name);
    }

}
