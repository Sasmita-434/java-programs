package org.oops.thisconstructor;

public class ProductMain {

    public static void main(String[] args) {

        Product product1 = new Product(1,"Sugar",199);
        System.out.println(product1.hashCode());
        Product product2 = new Product(2,"Honey",280);
        product1.productdetails();
    }
}
