package MachineCodingRound.meesho.services;

import MachineCodingRound.meesho.dto.Product;

import java.util.Map;

public interface ProductServiceI {
    public void addProduct(Product product) ;
    public void updateProduct(String productId, int quantity);
    public boolean checkInventory(int orderedQuantity, String productId);
}
