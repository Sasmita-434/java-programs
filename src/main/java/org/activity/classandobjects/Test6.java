package org.activity.classandobjects;

public class Test6 {

    int x;
    String y;

    public Test6(int x, String y)
    {
        this.x = x;
        this.y = y;
        Test6 tVar = this;
        System.out.println(tVar.hashCode() == this.hashCode());
        // true, both contain same values
    }

    public static void main(String[] args) {
        Test6 t = new Test6(10,"john");
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
