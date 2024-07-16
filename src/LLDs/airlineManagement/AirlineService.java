package LLDs.airlineManagement;

import LLDs.airlineManagement.booking.Booking;
import LLDs.airlineManagement.booking.BookingManager;
import LLDs.airlineManagement.flight.Flight;
import LLDs.airlineManagement.flight.FlightSearch;
import LLDs.airlineManagement.payment.Payment;
import LLDs.airlineManagement.seat.Seat;

import java.time.LocalDate;
import java.util.*;

public class AirlineService {
    private static AirlineService instance;
    List<Passenger>passengers;
    List<Aircraft>aircrafts;
    List<Flight>flights;
    FlightSearch flightSearch;
    BookingManager bookingManager;

    private AirlineService() {
        passengers = new ArrayList<>();
        flights = new ArrayList<>();
        flightSearch=new FlightSearch(flights);
        aircrafts = new ArrayList<>();

    }
    public static synchronized  AirlineService getInstance() {
        if (instance == null) {
            instance = new AirlineService();
        }
        return instance;
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }
    public Booking bookFlight(Flight flight, Passenger passenger, List<Seat> bookedSeats, Payment payment) {
       return bookingManager.createBooking(passenger,bookedSeats,payment);
    }
   public void cancelBooking(Booking booking) {
        bookingManager.cancelBooking(booking.getBookingId());
   }
   public List<Flight> searchFlight(String source, String destination, LocalDate dateOfFlight) {
       return  flightSearch.getFlightList(source,destination,dateOfFlight);
   }
    private String generateOrderId() {
        // Generate a unique order ID using UUID
        return "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
