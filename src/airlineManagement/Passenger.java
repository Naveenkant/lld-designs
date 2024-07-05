package airlineManagement;

import airlineManagement.booking.Booking;
import  java.util.*;
public class Passenger {
    String userId;
    String  name;
    String phone;
    List<Booking>bookingHistory;

    public Passenger(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        bookingHistory = new ArrayList<>();
    }

    public List<Booking> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<Booking> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
