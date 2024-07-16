package MachineCodingRound.SuperBidding.services;

import MachineCodingRound.SuperBidding.dto.*;
import MachineCodingRound.SuperBidding.repository.*;

import java.util.*;

import static MachineCodingRound.SuperBidding.utils.AuctionHelper.getAuctionByName;

public class BuyerService {
     /*
    ADD_BUYER
    CREATE_BID
    WITHDRAW_BID
    UPDATE_BID
     */
    List<Buyer> buyerList= BuyerRepository.getInstance().getBuyersList();
    List<Auction>auctionList= AuctionRepository.getInstance().getAuctionsList();
    Map<String,Auction> auctionMap= new HashMap<>();

    public void ADD_BUYER(Buyer buyer){
        buyerList.add(buyer);
    }
    public void CREATE_BID(String buyerName,String auctionName,int bidAmount){
    Auction auction= getAuctionByName(auctionList,auctionName);
        if(!auction.isActive()){
            throw  new RuntimeException("NO Auction Found");
        }
        if (bidAmount<auction.getStartPrice()&& bidAmount>auction.getClosePrice())
            throw new RuntimeException("Bid AMount Not in Range");
        auction.getBuyerBidMap().put(buyerName,bidAmount);
    }
    public void WITHDRAW_BID(String buyerName,String auctionName){
        Auction auction= getAuctionByName(auctionList,auctionName);
        if(!auction.isActive()){
            throw  new RuntimeException("NO Auction Found");
        }
        auction.getBuyerBidMap().remove(buyerName);
    }
    public void UPDATE_BID(String buyerName,String auctionName,int newBidAmount){
        Auction auction= getAuctionByName(auctionList,auctionName);
        if(!auction.isActive()){
            throw  new RuntimeException("NO Auction Found");
        }
        auction.getBuyerBidMap().put(buyerName,newBidAmount);
    }

}
