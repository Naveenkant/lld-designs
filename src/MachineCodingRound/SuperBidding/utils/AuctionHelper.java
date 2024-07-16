package MachineCodingRound.SuperBidding.utils;

import MachineCodingRound.SuperBidding.dto.Auction;

import java.util.List;

public class AuctionHelper {

    public static Auction getAuctionByName(List<Auction> auctionList, String auctionName) {
        for(Auction auction : auctionList) {
            if(auction.getAuctionName().equals(auctionName)) {
               return auction;
            }
        }
        return null;
    }

}
