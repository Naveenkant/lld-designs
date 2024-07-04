package zomato;

import zomato.item.Item;
import zomato.order.OrderItem;
import java.util.*;
public class Cart {
    private final Map<String, OrderItem> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addItem(Item product, int quantity) {
        String productId = product.getItemId();
        if (items.containsKey(productId)) {
            OrderItem item = items.get(productId);
            quantity += item.getTotal();
        }
        items.put(productId, new OrderItem( quantity,product));
    }

    public void removeItem(String productId) {
        items.remove(productId);
    }

    public void updateItemQuantity(String productId, int quantity) {
        OrderItem item = items.get(productId);
        if (item != null) {
            items.put(productId, new OrderItem( quantity,item.getItem()));
        }
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items.values());
    }

    public void clear() {
        items.clear();
    }
}

