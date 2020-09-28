package org.objects;

public class Result {

    public String StudentName;
    public float mark1;
    public float mark2;
    public float percentage;

    public void getResult()
    {
        if(percentage >= 60)
        {
            System.out.println("Your result : Grade A");
        }
        else if(percentage < 60 && percentage >= 50)
        {
            System.out.println("Your result : Grade B");
        }
        else if(percentage < 50 && percentage >= 40)
        {
            System.out.println("Your result : Grade C");
        }
        else if(percentage < 40)
        {
            System.out.println("Your result : Grade D");
        }
    }

}
