package LLDs.airlineManagement.flight;
import LLDs.airlineManagement.Aircraft;

import java.time.LocalDateTime;

public class Flight {
    String  flightId;
    Aircraft aircraft;
    LocalDateTime arrivalTime;
    LocalDateTime   depratureTime;
    String source;
    String destination;
    double cost;
    FlightStatus flightStatus;

    public Flight(String flightId,Aircraft aircraft, LocalDateTime arrivalTime, LocalDateTime depratureTime, String source, String destination, double cost, FlightStatus flightStatus){
        this.flightId = flightId;
        this.aircraft = aircraft;
        this.arrivalTime = arrivalTime;
        this.depratureTime = depratureTime;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
        this.flightStatus = flightStatus;

    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepratureTime() {
        return depratureTime;
    }

    public void setDepratureTime(LocalDateTime depratureTime) {
        this.depratureTime = depratureTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }
}
