package LLDs.zomato;
import LLDs.zomato.deliveryPartner.Partner;
import LLDs.zomato.deliveryPartner.PartnerStatus;
import LLDs.zomato.item.Item;
import LLDs.zomato.item.ItemStatus;

import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        ZomatoService deliveryService = ZomatoService.getInstance();

        // Register customers
        User customer1 = new User("C001", "546789", new Location(344,2342,""));
        User customer2 = new User("C002", "98765432",  new Location(344,2342,""));
//        deliveryService.registerCustomer(customer1);
//        deliveryService.registerCustomer(customer2);

        // Register restaurants
        List<Item> restaurant1Menu = new ArrayList<>();
        restaurant1Menu.add(new Item("M001", "Burger", 3432, ItemStatus.AVAILABLE));
        restaurant1Menu.add(new Item("M002", "Pizza",34532, ItemStatus.AVAILABLE));
        Restaurant restaurant1 = new Restaurant("R001", "Restaurant 1", "Address 1", restaurant1Menu);
//        deliveryService.registerRestaurant(restaurant1);

        List<Item> restaurant2Menu = new ArrayList<>();
        restaurant2Menu.add(new Item("M003", "Sushi" , 15.99,ItemStatus.AVAILABLE));
        restaurant2Menu.add(new Item("M004", "Ramen", 10.99,ItemStatus.AVAILABLE));
        Restaurant restaurant2 = new Restaurant("R002", "Restaurant 2", "Address 2", restaurant2Menu);
//        deliveryService.registerRestaurant(restaurant2);

        // Register delivery agents
        Partner agent1 = new Partner("D001", "Agent 1", new Location(344,2342,""), PartnerStatus.AVAILABLE);
        Partner agent2 = new Partner("D002", "Agent 2", new Location(344,2342,""), PartnerStatus.AVAILABLE);
//        deliveryService.registerDeliveryAgent(agent1);
//        deliveryService.registerDeliveryAgent(agent2);


    }
}
