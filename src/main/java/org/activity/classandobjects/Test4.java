// Will below code will compile?
// yes, returns the initial value of x = 0

package org.activity.classandobjects;

public class Test4 {

    int x;
    public Test4(int x){
        this.x = x;
    }

    public Test4(){

    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        System.out.println(t.x);
    }
}
