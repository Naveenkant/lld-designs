package airlineManagement;

import airlineManagement.seat.Seat;

import java.util.List;

public class Aircraft {
    String aircraftId;
    String name;
    List<Seat> seats;
    public Aircraft(String aircraftId, String name, List<Seat> seats) {
        this.aircraftId = aircraftId;
        this.name = name;
        this.seats = seats;
    }

}
