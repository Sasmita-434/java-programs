package org.block;

public class BlockMain {
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
    }
    {
        System.out.println("This is another Instance class");
    }
    public BlockMain(){
        System.out.println("****Constructor method created****");
        String classname = "BlockMain";
        System.out.println("Constructor name is same as Class name = "+classname);
    }
}
