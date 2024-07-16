package MachineCodingRound.SuperBidding.dto;

import java.util.*;

public class Seller {
    String name;
    List<Auction> auctionList;

    public Seller(String name) {
        this.name = name;
        this.auctionList = new ArrayList<>();
    }


    public void setAuctionList(List<Auction> auctionList) {
        this.auctionList = auctionList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Auction> getAuctionList() {
        return auctionList;
    }


}
