package org.oops.constructor;

public class Perimeter {

    double square;
    double rectangle;
    double triangle;

    public Perimeter()
    {
        System.out.println("Displaying the Perimeter of Square, Rectangle, & Triangle :- ");
    }
    public Perimeter(double side)
    {
        square = 4 * side;
        System.out.println("Perimeter of the Square = "+square);
    }

    public Perimeter(double length, double breadth)
    {
        rectangle = (2 * length) + (2 * breadth);
        System.out.println("Perimeter of the Rectangle = "+rectangle);
    }

    public Perimeter(double side1, double side2, double side3)
    {
        triangle = side1 + side2 + side3;
        System.out.println("Perimeter of the Triangle = "+triangle);
    }
}
