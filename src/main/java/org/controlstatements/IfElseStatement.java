package org.controlstatements;

public class IfElseStatement {

    public static void main(String[] args) {

        checkEligibility();
        checkEvenOrOdd();
    }

    private static void checkEligibility() {
        int age = 24;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }

    private static void checkEvenOrOdd(){
        int num = 20;
        if(check(num)){
            System.out.println(num+" is an Even number");
        }
        else{
            System.out.println(num+" is an Odd Number");
        }

    }

    private static boolean check(int num){
        return (num % 2 == 0);
    }
}
