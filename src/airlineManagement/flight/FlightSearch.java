package airlineManagement.flight;

import java.time.LocalDate;
import java.util.*;


public class FlightSearch {
    List<Flight> flightList;
    public FlightSearch(List<Flight> flightList) {
        this.flightList = flightList;
    }
    public List<Flight> getFlightList(String source, String destination, LocalDate dateOfFlight) {

        List<Flight> flightList = new ArrayList<>();
        for (Flight flight : flightList) {
            //logic
        }
        return flightList;
    }
}
