package zomato;

import zomato.item.Item;
import zomato.observer.Observer;
import zomato.order.Order;

import java.util.List;

public class Restaurant implements Observer {
    String id;
    String name;
    String address;
    List<Item> items;

    public Restaurant(String id, String name, String address, List<Item> items) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void update(Order orderDetails) {
        System.out.println("Restaurant " + name + " received order: " + orderDetails);
    }


}
