package org.controlstatements;

public class ForLoop {

    public static void main(String[] args) {

        printSquare();
        System.out.println("------------------------------");
        printSum();
    }

    private static void printSquare() {
        // display square of the number from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }

        System.out.println("----------------------------");

        int i = 1;
        for (; i <= 10; ) {
            System.out.println(i * i);
            i++;
        }
    }

    private static void printSum()
    {

        for(int i = 1, j = 1; i<=10 || j <=10 ; i++, j++)
        {
            System.out.println(i+j);
        }

    }
}
