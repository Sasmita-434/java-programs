package org.methods;

public class LargestSmallest {

    public static int l_result;      //static variable
    public int s_result;            //non-static variable
    public static int largest(int a,int b,int c){     //static method
        if(a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
    }

    public int smallest(int a,int b,int c){        //ono-static method
        if(a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else
            return c;
    }

}
