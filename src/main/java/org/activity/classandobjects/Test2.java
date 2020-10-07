package org.activity.classandobjects;

public class Test2 {

    int x;
    public Test2(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Test2 t = new Test2(10);
        System.out.println(t.x);
    }
}
