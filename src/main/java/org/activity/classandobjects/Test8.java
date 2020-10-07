package org.activity.classandobjects;

public class Test8 {

    int x;
    String y;

    public Test8(int x, String y)
    {
        this.x = x;
        this.y = y;
        this.m1(this);
    }

    public static void main(String[] args) {
        Test8 t = new Test8(10,"john");
        System.out.println(t.x == 10);  //false
        System.out.println(t.y == "john");  //false
    }

    public void m1(Test8 t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
