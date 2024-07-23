package MachineCodingRound.meesho.services.impl;

import MachineCodingRound.meesho.dto.Product;
import MachineCodingRound.meesho.respository.ProductRepository;
import MachineCodingRound.meesho.services.ProductServiceI;

import java.util.Map;

public class ProductService implements ProductServiceI {
    /*
    Add product
    Update Product
    Check Inventory
     */

    ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product.getProductId(),product);
    }
    public void updateProduct(String productId, int quantity) {
        Product product=productRepository.getProducts().get(productId);
       product.setProductQuantity(quantity);
       productRepository.getProducts().put(productId,product);
    }

    public boolean checkInventory(int orderedQuantity, String productId){
        synchronized (this) {
            Product product = productRepository.getProduct(productId);
            if (orderedQuantity <= product.getProductQuantity()) {
                product.setProductQuantity(product.getProductQuantity() - orderedQuantity);
                return true;
            } else {
                throw new RuntimeException("insufficient quantity");
//                throw new EcommerceException(ErrorCode.IN_SUFFICIENT_INVENTORY, ErrorCodeMap.errorCodeStringHashMap.get(ErrorCode.IN_SUFFICIENT_INVENTORY));
            }
        }
    }

}
