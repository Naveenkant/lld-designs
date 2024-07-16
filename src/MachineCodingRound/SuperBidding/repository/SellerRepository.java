package MachineCodingRound.SuperBidding.repository;

import MachineCodingRound.SuperBidding.dto.Seller;

import java.util.ArrayList;
import java.util.List;

public class SellerRepository {
    private static SellerRepository instance;
    List<Seller> sellers;

    public SellerRepository() {
        sellers = new ArrayList<Seller>();
    }
    public static SellerRepository getInstance() {
        if (instance == null) {
            instance = new SellerRepository();
        }
        return instance;
    }
    public List<Seller> getSellers() {
        return sellers;
    }
    public void addSellers(Seller seller) {
        sellers.add(seller);
    }

}
