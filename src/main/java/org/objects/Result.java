package org.objects;

public class Result {

    public String StudentName;
    public float mark1;
    public float mark2;
    public float percentage;

    public String getResult()
    {
        if(percentage >= 60)
        {
            return "Grade A";
        }
        else if(percentage < 60 && percentage >= 50)
        {
            return "Grade B";
        }
        else if(percentage < 50 && percentage >= 40)
        {
            return "Grade C";
        }

        return "Grade D";
    }

}
