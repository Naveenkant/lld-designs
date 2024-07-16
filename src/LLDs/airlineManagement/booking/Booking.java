package LLDs.airlineManagement.booking;

import LLDs.airlineManagement.Passenger;
import LLDs.airlineManagement.payment.Payment;
import LLDs.airlineManagement.seat.Seat;

import java.util.*;

public class Booking {
    String bookingId;
    Passenger passenger;
    List<Seat> bookedSeats;
    Payment payment;
    BookingStatus bookingStatus;
    public Booking(String bookingId , Passenger passenger, List<Seat> bookedSeats, Payment payment) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.bookedSeats = bookedSeats;
        this.payment = payment;
    }

    public void cancel() {
        bookingStatus = BookingStatus.CANCELED;
    }
    public String getBookingId() {
        return bookingId;
    }
}
