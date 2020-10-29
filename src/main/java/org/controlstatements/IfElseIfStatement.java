package org.controlstatements;

public class IfElseIfStatement {

    public static void main(String[] args) {

        findLargest();
    }

    private static void findLargest(){
        int a = 21, b = 9, c = 10;
        if(a > b && a > c){
            System.out.println(a+" is the largest");
        }
        else if(b > a && b > c){
            System.out.println(b+" is the largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
        System.out.println("Have found the largest number");
    }
}
