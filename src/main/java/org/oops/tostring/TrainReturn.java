package org.oops.tostring;

public class TrainReturn {

    public static void main(String[] args) {

        Train booking = new Train(1,"Bangaluru","A1",659);
        System.out.println("Hashcode : "+booking.hashCode());
        booking.bookingDetails();
        System.out.println(booking);
        System.out.println(booking.toString());
    }
}
