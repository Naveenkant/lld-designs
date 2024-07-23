package MachineCodingRound.SuperBidding.services;

import MachineCodingRound.SuperBidding.dto.Auction;
import MachineCodingRound.SuperBidding.dto.Seller;
import MachineCodingRound.SuperBidding.repository.AuctionRepository;
import MachineCodingRound.SuperBidding.repository.SellerRepository;

import java.util.*;

import static MachineCodingRound.SuperBidding.utils.AuctionHelper.getAuctionByName;
import static MachineCodingRound.SuperBidding.utils.SellerHelper.getSellerByName;

public class SellerService {
    /* Add seller
       Create Auction
       Close Auction
     */
    List<Seller> sellerList= SellerRepository.getInstance().getSellers();
    List<Auction>auctionList= AuctionRepository.getInstance().getAuctionsList();

    public void ADD_SELLER(Seller seller) {
        sellerList.add(seller);
    }
    public void CREATE_AUCTION(String auctionName,int minBid,int maxBid,String sellerName) {
        Seller seller=getSellerByName(sellerName,sellerList);
        if(seller==null) {
            throw new RuntimeException("Seller not found");
        }
        Auction auction =new Auction("1",auctionName,minBid,maxBid,seller,true);
        auctionList.add(auction);
        seller.getAuctionList().add(auction);
    }
    public void CLOSE_AUCTION(String auctionName){
        System.out.println("here we are closing the auction");
       Auction auction= getAuctionByName(auctionList,auctionName);
       if(auction==null) {
           throw new RuntimeException("Auction not found");
       }

        String winnerName=getAuctionWinner(auction);
        auctionList.remove(auction);
        auction.setActive(false);
           if(winnerName.isEmpty()) {
               throw new RuntimeException("Winner not declared");
           }
        System.out.println("winner name: "+winnerName);
    }
    public String getAuctionWinner(Auction auction){
        Map<String,Integer> buyerBidMap=auction.getBuyerBidMap();
        Map<Integer,Integer>freqMap=new TreeMap<Integer,Integer>(Collections.reverseOrder());
        for(String buyerName:buyerBidMap.keySet()){
            int bidAmount=buyerBidMap.get(buyerName);
            freqMap.put(bidAmount,freqMap.getOrDefault(bidAmount,0)+1);
        }
        int maxValidBid=0;
        for(int bidAmount:freqMap.keySet()){
            if(freqMap.get(bidAmount)==1){
                maxValidBid=bidAmount;
                break;
            }
        }
        String winnerName="";
        for(String buyerName:buyerBidMap.keySet()){
            if(buyerBidMap.get(buyerName)==maxValidBid){
                winnerName=buyerName;
                break;
            }
        }
        return winnerName;

    }
}
