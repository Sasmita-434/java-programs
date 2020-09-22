package org.block;

public class BlockMain {
    static String var = "Static variable";
    //main method
    public static void main(String[] args) {
        new BlockMain();
        System.out.println("------------------------------------------");
        System.out.println("This is the main method");
        System.out.println("------------------------------------------");
        new BlockMain();
    }
    //static class
    static {
        System.out.println("This is a Static class");
        System.out.println(var+" : inside static class");
    }
    static {
        System.out.println("This is another Static class");
        int a, b;
        a = 21; b = 9;
        int sum = a + b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("Summation of a & b = "+sum);
        System.out.println("------------------------------------------");
    }
    //instance class
    {
        System.out.println("This is an Instance class without static keyword");
        System.out.println(var+" : inside instance class");
       // int sum = a + b;
    }
    {
        System.out.println("This is another Instance class");
        System.out.println("------------------------------------------");
    }
    public BlockMain(){
        System.out.println("****Constructor method created****");
        System.out.println(var+" : inside main method");
        String classname = "BlockMain";
        System.out.println("Constructor name is same as Class name = "+classname);
    }
}
