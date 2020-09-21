package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println("Length of the string argument : "+args.length);
        if(args.length == 0){
            args = new String[2];
            args[0] = "Core Java";
            args[1] = "IntelliJ";
        }
        System.out.println("First argument = "+args[0]);
        System.out.println("Second argument = "+args[1]);
        String myname = "Sasmita";
        System.out.println(myname);
        System.out.println("Array of string :");
        String girls[] = {"sita","gita","ram"};
        System.out.println(girls[0]);
        System.out.println(girls[1]);
        System.out.println(girls[2]);
        System.out.println("Length of the string is = "+girls.length);
    }
}
