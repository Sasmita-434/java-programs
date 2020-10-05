package org.oops.modifiers;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book();
        Book book1 = new Book("B1","Java",899);
        book1.setBookEdition("null");
        System.out.println(book1.getBookEdition());
        System.out.println("------------------------------------------");
        Book book2 = new Book();
        book2.setId("B2");
        System.out.println(book2.getId());
        book2.setName("C++");
        System.out.println(book2.getName());
        book2.setPrice(659);
        System.out.println(book2.getPrice());
        book2.setBookEdition("5th");
        System.out.println(book2.getBookEdition());
    }
}
