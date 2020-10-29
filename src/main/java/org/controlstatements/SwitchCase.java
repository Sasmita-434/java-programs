package org.controlstatements;

public class SwitchCase {

    public static void main(String[] args) {

        calculator();
        calculator1();
    }

    // using switch case
    private static void calculator(){
        String calc = "Division";
        int a = 20, b = 5;
        switch (calc){
            case "Addition" :
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case "Subtraction" :
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case "Multiplication" :
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case "Division" :
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case "Modulus" :
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    // using if-else-if-else statement
    private static void calculator1(){
        String calc = "Subtraction";
        int a = 66, b = 33;
        if(calc == "Addition"){
            System.out.println(a+" + "+b+" = "+(a+b));
        }
        else if(calc == "Subtraction"){
            System.out.println(a+" - "+b+" = "+(a-b));
        }
        else if(calc == "Multiplication"){
            System.out.println(a+" * "+b+" = "+(a*b));
        }
        else if(calc == "Division"){
            System.out.println(a+" / "+b+" = "+(a/b));
        }
        else if(calc == "Modulus"){
            System.out.println(a+" % "+b+" = "+(a%b));
        }
        else{
            System.out.println("Wrong Entry");
        }
    }
}
