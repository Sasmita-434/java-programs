package org.methods;

public class LargestSmallestMain {

    public static void main(String[] args) {

        LargestSmallest ls = new LargestSmallest();   //creating objects of another class
        ls.s_result = ls.smallest(9,21,10);
        System.out.println(ls.s_result+" is the smallest among 9,21,10");

        LargestSmallest.l_result = LargestSmallest.largest(9,21,10);
        System.out.println(LargestSmallest.l_result+" is the largest among 9,21,10");

    }
}
