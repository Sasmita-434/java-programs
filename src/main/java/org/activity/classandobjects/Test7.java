package org.activity.classandobjects;

public class Test7 {

    int x;
    String y;

    public Test7(int x, String y)
    {
        this.x = x;
        this.y = y;
        m1(this);
    }

    public static void main(String[] args) {
        Test7 t = new Test7(10,"john");
        System.out.println(t.x);  // 100
        System.out.println(t.y);  // Doe
    }

    public void m1(Test7 t1)
    {
        t1.x = 100;
        t1.y = "Doe";
    }
}
