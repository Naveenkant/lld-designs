package LLDs.zomato.item;

public class Item {
            String  itemId;
            String  itemName;
            double price;
            ItemStatus itemStatus;
            public Item(String itemId, String itemName, double price, ItemStatus itemStatus) {
                this.itemId = itemId;
                this.itemName = itemName;
                this.price = price;
                this.itemStatus = itemStatus;
            }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }
}
