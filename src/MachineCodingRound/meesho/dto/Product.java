package MachineCodingRound.meesho.dto;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private Address productAddress;


    public Product(String productId, String productName, double productPrice,int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Address getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(Address productAddress) {
        this.productAddress = productAddress;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
