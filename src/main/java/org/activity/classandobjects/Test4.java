// Will below code will compile?
// yes, returns the initial value of x = 0,
// because no value is initialized to x

package org.activity.classandobjects;

public class Test4 {

    int x;
    public Test4(int x){

        this.x = x;
    }

    public Test4(){

    }

    public static void main(String[] args) {
        Test4 t = new Test4(); // no parameter passed to the constructor
        System.out.println(t.x); // display default value of x = 0
    }
}
