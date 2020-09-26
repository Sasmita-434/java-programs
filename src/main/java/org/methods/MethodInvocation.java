package org.methods;

public class MethodInvocation {

    static {
        System.out.println("Welcome to Static Class");
        MethodInvocation obj2 = new MethodInvocation();
        obj2.sum(13,9);
        int m_result = mul(9,13);
        System.out.println("Multiplication of 9 and 13 = "+m_result);
        System.out.println("--------------------------------------------");
    }
    {               //it automatically gets executed when main method is invoked
        System.out.println("*******  Welcome to Instance Class");
        sum(15,20);
        int mul_result = mul(20,15);
        System.out.println("Multiplication of 20 and 15 = "+mul_result+"  *******");
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Welcome to main method");
        MethodInvocation obj1 = new MethodInvocation();
        obj1.sum(21,10);
        int result = mul(10,21);
        System.out.println("Multiplication of 10 and 21 = "+result);
    }

    void sum(int x,int y){
        System.out.println("Summation of "+x+" and "+y+" = "+(x+y));
    }
    static int mul(int x,int y){
        return(x*y);
    }

}
