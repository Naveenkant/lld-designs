package MachineCodingRound.SuperBidding.dto;
import java.util.*;
public class Auction {
    String auctionId;
    String auctionName;
    int startPrice;
    int closePrice;
    Seller seller;
    boolean isActive ;
    Map<String ,Integer>buyerBidMap;

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public int getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public int getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(int closePrice) {
        this.closePrice = closePrice;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    public Map<String, Integer> getBuyerBidMap() {
        return buyerBidMap;
    }

    public Auction(String auctionId, String auctionName, int startPrice, int closePrice, Seller seller, boolean isActive) {
        this.auctionId = auctionId;
        this.auctionName = auctionName;
        this.startPrice = startPrice;
        this.closePrice = closePrice;
        this.seller = seller;
        this.isActive = isActive;
        this.buyerBidMap = new HashMap<>();
    }
}
