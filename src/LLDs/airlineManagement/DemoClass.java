package LLDs.airlineManagement;

import LLDs.airlineManagement.booking.Booking;
import LLDs.airlineManagement.flight.Flight;
import LLDs.airlineManagement.flight.FlightStatus;
import LLDs.airlineManagement.payment.Payment;
import LLDs.airlineManagement.payment.PaypalPayment;
import LLDs.airlineManagement.seat.Seat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {

        AirlineService airlineService=AirlineService.getInstance();

        Passenger p1=new Passenger("1","Naveen","3455432345");
        Passenger p2=new Passenger("2","Harry","343256356");

        airlineService.addPassenger(p1);
        airlineService.addPassenger(p2);
        List<Seat>seatList=new ArrayList<>();

        Aircraft aircraft1=new Aircraft("1","Boing",seatList);
        Aircraft aircraft2=new Aircraft("1","Trance",seatList);

        airlineService.addAircraft(aircraft1);
        airlineService.addAircraft(aircraft2);

        LocalDateTime departureTime1 = LocalDateTime.now().plusDays(1);
        LocalDateTime arrivalTime1 = departureTime1.plusHours(2);
        Flight flight1=new Flight("1",aircraft1,arrivalTime1,departureTime1,"Delhi","Banglore",345, FlightStatus.ON_TIME);

        LocalDateTime departureTime2 = LocalDateTime.now().plusDays(1);
        LocalDateTime arrivalTime2 = departureTime1.plusHours(2);
        Flight flight2=new Flight("1",aircraft1,arrivalTime2,departureTime2,"Tamil Nadu","Shimla",345, FlightStatus.ON_TIME);

        airlineService.addFlight(flight1);
        airlineService.addFlight(flight2);

        // Search flights
        List<Flight> searchResults = airlineService.searchFlight("New York", "London", LocalDate.now().plusDays(1));
        System.out.println("Search Results:");
        for (Flight flight : searchResults) {
            System.out.println("Flight: " + flight.getFlightId() + " - " + flight.getSource() + " to " + flight.getDestination());
        }

        List<Seat>bookedSeatList=new ArrayList<>();
        Payment payment=new Payment(new PaypalPayment("naveen#gmail.com","*******"));

        Booking booking=airlineService.bookFlight(flight1,p1,bookedSeatList,payment);

        airlineService.cancelBooking(booking);
    }
}
