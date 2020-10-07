package org.activity.classandobjects;

public class Test11 {

    int x;
    String y;

    public Test11(int x, String y) {
        x = x;
        y = y;
    }

    public static void main(String[] args) {
        Test11 t = new Test11(10,"john");
        Test11 t1 = t;
        System.out.println(t1 == t); //true, different objects with same values
        t1.x = 300;
        t1.y = "alex";
        System.out.println(t.x);  // 300
        System.out.println(t.y);  // alex
    }
}
