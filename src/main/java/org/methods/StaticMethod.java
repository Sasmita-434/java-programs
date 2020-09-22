package org.methods;

public class StaticMethod {
    int a ;
    static int b ;

    public static void main(String[] args) {
        input();
        input(30,7);
        // System.out.println("Summation of c and d = "+output());
        output();
        int getoutput = output(21);
        System.out.println("Result = "+getoutput);
        display("Sasmita");
    }
    static {
       // System.out.println(a);
        b = 1996;
        System.out.println("My birthday year is on : "+b);
        // b = 1996; //  gives 0 as output as it is initialized after execution
        // System.out.println(c);
    }
    static int c = 10;

    static void input(){
        System.out.println("Static method without parameter");
    }
    static void input(int x, int y){
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
    }
    static int output(int x){
        //int result = c * c;
        //return rseult;
        return (x * x);
        // System.out.println("c = "+c);
    }
    static void output(){
        System.out.println("c = "+c);
    }
    static void display(String name){
        System.out.println("Displaying my name : "+name);
        System.out.println("Value of c = "+c);
    }
}
