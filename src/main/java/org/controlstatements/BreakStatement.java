package org.controlstatements;

public class BreakStatement {

    public static void main(String[] args) {

        putBreak();
    }

    private static void putBreak(){

        for (int i = 1; i <= 10; i++){
            if(i == 9){
                System.out.println("Break");
                break;  //if condition satisfies the control comes out of the loop
            }
            System.out.println(i+" ");
        }
        System.out.println("Done");
    }
}
