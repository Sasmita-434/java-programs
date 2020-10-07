// Why below code will not compile?
// What is the fix we have to do so that the code will compile.

package org.activity.classandobjects;

public class Test3 {

    int x;
    public Test3(int x){
        this.x = x;
    }

    public static void main(String[] args) {
        //Test3 t = new Test3(); //value of x is not assigned to parameterized constructor
        Test3 t = new Test3(9); //this is the right statement
        System.out.println(t.x);
    }

}
