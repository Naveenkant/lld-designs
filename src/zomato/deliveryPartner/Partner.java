package zomato.deliveryPartner;

import zomato.Location;
import zomato.observer.Observer;

public class Partner implements Observer {
    String name;
    String phone;
    Location location;
    PartnerStatus partnerStatus;

    public Partner(String name, String phone, Location location, PartnerStatus partnerStatus) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.partnerStatus = partnerStatus;
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

    public PartnerStatus getPartnerStatus() {
        return partnerStatus;
    }

    public void setPartnerStatus(PartnerStatus partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void update(String orderDetails) {
        System.out.println("Delivery Partner " + name + " received order: " + orderDetails);
    }
}
