package org.oops.modifiers;

public class Book {

    private String bookid;
    private String bookname;
    int bookprice;
    public String bookedition;

    public Book(String bookid, String bookname, int bookprice)
    {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
        bookdetails();
    }

    public Book(){
    }

    public void bookdetails(){
        System.out.println("Book Details :-----");
        System.out.println("Book Id = "+this.bookid);
        System.out.println("Book Name = "+this.bookname);
        System.out.println("Book Price = "+this.bookprice);
    }

    public String getId() {
        return bookid;
    }

    public void setId(String bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return bookname;
    }

    public void setName(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return bookprice;
    }

    public void setPrice(int bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookEdition() {
        return bookedition;
    }

    public void setBookEdition(String bookedition) {
        if (bookedition == "null") {
            this.bookedition = "Latest Edition";
        } else {
            this.bookedition = "Old Edition";
        }
    }
}
