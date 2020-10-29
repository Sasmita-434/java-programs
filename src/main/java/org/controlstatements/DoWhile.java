package org.controlstatements;

public class DoWhile {

    public static void main(String[] args) {
        print();
    }

    private static void print(){
        int i = 11;
        do{
            System.out.println(i);
            i++;
        }while (i <= 10);
    }
}
