package org.activity.classandobjects;

public class Test9 {

    int x;
    String y;

    public Test9(int x, String y) {
        x = x;
        y = y;
        this.m1(this);
    }

    public static void main(String[] args) {
        Test9 t = new Test9(10,"john");
        System.out.println(t.x);  // 100
        System.out.println(t.y);  // Doe
    }

    public void m1(Test9 t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
