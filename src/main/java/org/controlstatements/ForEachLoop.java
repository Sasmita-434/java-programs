package org.controlstatements;

public class ForEachLoop {

    public static void main(String[] args) {

        printArray();
        System.out.println("-----------------------------");
        printTable();
    }
    private static int arr[] = {1,2,3,4,5,6,7,8,9,10};
    private static void printArray(){
        for(int num : arr){
                System.out.println(num);
        }
    }

    private static void printTable(){
        int num = 9;
        for(int i = 1; i <= arr.length; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
