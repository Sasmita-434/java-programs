package org.activity.classandobjects;

public class Test10 {

    int x;
    String y;

    public Test10(int x, String y) {
        x = x;
        y = y;
    }

    public static void main(String[] args) {
        Test10 t = new Test10(10,"john");
        System.out.println(t.x);  // 0
        System.out.println(t.y);  // null
        // parameters are assigned to itself
        // no values assigned to x and y, so it returns default value
    }

    public void m1(Test10 t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
