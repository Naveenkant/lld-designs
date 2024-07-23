package MachineCodingRound.meesho.respository;

import MachineCodingRound.meesho.dto.Product;

import java.util.HashMap;

public class ProductRepository {
    HashMap<String, Product> products ;

    public ProductRepository() {
        products = new HashMap<>();
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    public void addProduct(String productId, Product product) {
        products.put(productId, product);
    }

    public Product createProduct(Product product){
        if(products.get(product.getProductId())!=null){
            throw new RuntimeException("Product already exists");

        }
        products.put(product.getProductId(), product);
        return product;
    }

    public Product getProduct(String productId){
        return products.get(productId);
    }

}
