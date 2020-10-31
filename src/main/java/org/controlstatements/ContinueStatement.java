package org.controlstatements;

public class ContinueStatement {

    public static void main(String[] args) {

        putContinue();
    }

    private static void putContinue(){

        for (int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println("Skip and Continue");
                continue;
                //if condition satisfies the control skip this iteration
                // and moves to the next iteration
            }
            System.out.println(i);
        }
        System.out.println("Done");
    }
}
