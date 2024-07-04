package zomato.order;

import zomato.item.Item;

public class OrderItem {
  public  int total;
   public Item item;
    public OrderItem(int total, Item item) {
        this.total = total;
        this.item = item;
    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


}
