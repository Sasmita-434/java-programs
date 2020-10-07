package org.oops.tostring;

public class Train {

    private int ticket_no;
    private String place;
    private String seat_no;
    private float bill;

    public Train(int ticket_no, String place, String seat_no, float bill)
    {
        this.ticket_no = ticket_no;
        this.place = place;
        this.seat_no = seat_no;
        this.bill = bill;
        System.out.println("toString with 'this' : "+this);
    }

    public void bookingDetails()
    {
        System.out.println("Ticket no : "+this.ticket_no);
        System.out.println("Place : "+place);
        System.out.println("Seat no : "+seat_no);
        System.out.println("Bill : "+bill);
    }

    public String toString()
    {
        String display = ticket_no+" "+place+" "+seat_no+" "+bill;
        return display;
    }
}
