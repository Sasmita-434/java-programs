package org.activity.classandobjects;

public class Test2 {

    int x;
    public Test2(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Test2 t = new Test2(10); // 10 passed as parameter to the constructor
        System.out.println(t.x); // value of x = 10 will be displayed
    }
}
