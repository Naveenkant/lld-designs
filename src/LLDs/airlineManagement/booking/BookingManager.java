package LLDs.airlineManagement.booking;
import LLDs.airlineManagement.Passenger;
import LLDs.airlineManagement.payment.Payment;
import LLDs.airlineManagement.seat.Seat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {
    private static BookingManager instance ;
    private  Map<String, Booking> bookings;
    private final Object lock = new Object();
    private final AtomicInteger bookingCounter = new AtomicInteger(0);

    private BookingManager() {
        bookings = new HashMap<>();

    }
    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public Booking createBooking(Passenger passenger, List<Seat> bookedSeats, Payment payment) {
        String bookingNumber = generateBookingNumber();
        Booking booking = new Booking(bookingNumber,passenger,bookedSeats,payment);
        synchronized (lock) {
            bookings.put(bookingNumber, booking);
        }
        return booking;
    }
    public void cancelBooking(String bookingNumber) {
        synchronized (lock) {
            Booking booking = bookings.get(bookingNumber);
            if (booking != null) {
                booking.cancel();
            }
        }

    }

    private String generateBookingNumber() {
        int bookingId = bookingCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "BKG" + timestamp + String.format("%06d", bookingId);
    }
}
