package org.oops.thisconstructor;

public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int price)
    {
        this.price = price-100;
        System.out.println(this.hashCode());
    }

    public Product(int id, String name, int price)
    {
        this(price); //this constructor
        this.id = id;
        this.name = name;
        System.out.println(this.hashCode());
        productdetails(this);
    }

    public void productdetails()
    {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.price);
    }

    public void productdetails(Product p)
    {
        productdetails();
    }
}
