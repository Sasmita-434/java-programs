package org.controlstatements;

public class WhileLoop {

    public static void main(String[] args) {
        print();
    }

    private static void print(){
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }
}
