package org.activity.classandobjects;

public class Test {

    private int x;
    private int y;
    private int sum;

    public Test(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("x = "+this.x);
        System.out.println("y = "+this.y);
        this.calculation();
        this.display();
    }
     public void calculation()
     {
         this.sum = this.x + this.y;
     }
     public void display()
     {
         System.out.println("Summation of x & y = "+this.sum);
     }
}
