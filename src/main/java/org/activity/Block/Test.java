package org.activity.Block;

// ACTIVITY - 1 : BLOCKS

    public class Test {

        public static int x = 9;         //static variable
        public static int y = 21;        //non-static variable

        public static void main(String[] args) {
            System.out.println("INSIDE MAIN METHOD");
            new Test();
        }

        static{       //static block
            System.out.println("Summation of x & y = "+(x+y));
        }
        {             // non-static block
            System.out.println("Multipliction of x & y = "+(x*y));
        }
}
