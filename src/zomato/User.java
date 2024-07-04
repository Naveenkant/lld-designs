package zomato;

import zomato.observer.Observer;
import zomato.order.Order;

public class User implements Observer {
    String name;
    String phone;
    Location location;

    public User(String name, String phone, Location location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void update(Order orderDetails) {
        System.out.println("your order status is this : " + orderDetails);
    }
}
