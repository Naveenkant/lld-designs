package MachineCodingRound.SuperBidding.repository;

import MachineCodingRound.SuperBidding.dto.Buyer;

import java.util.ArrayList;
import java.util.List;

public class BuyerRepository {
    private static BuyerRepository instance;
    List<Buyer> buyers;


    private BuyerRepository() {
       buyers = new ArrayList<Buyer>();
   }
   public synchronized static BuyerRepository getInstance() {
       if (instance == null) {
           instance = new BuyerRepository();
       }
       return instance;
   }

    public List<Buyer> getBuyersList() {
        return buyers;
    }

    public void addBuyers(Buyer buyer) {
        buyers.add(buyer);
    }
}
