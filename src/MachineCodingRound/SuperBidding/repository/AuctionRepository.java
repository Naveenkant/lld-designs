package MachineCodingRound.SuperBidding.repository;

import MachineCodingRound.SuperBidding.dto.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionRepository {
    private static AuctionRepository instance;
    List<Auction> auctions;

    private AuctionRepository() {
        auctions = new ArrayList<Auction>();
    }
    public static AuctionRepository getInstance() {
        if (instance == null) {
            instance = new AuctionRepository();
        }
        return instance;
    }
    public List<Auction> getAuctionsList() {
        return auctions;
    }
    public void addAuctions(Auction auction) {
        auctions.add(auction);
    }

}
