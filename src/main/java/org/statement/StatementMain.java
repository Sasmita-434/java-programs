package org.statement;

public class StatementMain {
    public static void main(String[] args) {
        int mark1 , mark2 , mark3;
        mark1 = 89;
        mark2 = 92;
        mark3 = 85;
        int res = ((mark1 + mark2 + mark3) / 3) * 100;
        if(res >= 75)
            System.out.println("Congratulations!!You are passed");
        else
            System.out.println("Better luck next time");
        int year = 2020;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
