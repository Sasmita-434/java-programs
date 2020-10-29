package org.controlstatements;

public class IfStatement {

    public static void main(String[] args) {

        checkEligibility();
        checkEvenOrOdd();
    }

    private static void checkEligibility() {
        int age = 24;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        System.out.println("Not eligible");
    }

    private static void checkEvenOrOdd(){
        int num = 20;
        if(check(num)){
            System.out.println(num+" is an Even number");
        }
        System.out.println("Odd Number");
    }

    private static boolean check(int num){
        return (num % 2 == 0);
    }
}
