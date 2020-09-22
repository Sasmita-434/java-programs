package org.methods;

public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod object1 = new InstanceMethod();
        InstanceMethod object2 = new InstanceMethod();
        object1.getvalue(10,21);
        object1.swap(10,21);
        System.out.println("-----------------------------------------------");
        object2.getvalue(10,21);
        object2.swap(10,21);
    }
    void getvalue(int x, int y){
        System.out.println("Before swapping : ");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    void swap(int x, int y){
        int thirdvalue = 0;
        thirdvalue = x;
        x = y;
        y = thirdvalue;
        System.out.println("After swapping using third variable : ");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
