package MachineCodingRound.SuperBidding.utils;

import MachineCodingRound.SuperBidding.dto.Seller;

import java.util.List;

public class SellerHelper {

    public static Seller getSellerByName(String sellerName, List<Seller> sellerList){
        for(Seller seller:sellerList){
            if(seller.getName().equals(sellerName)){
                return seller;
            }
        }
        return null;
    }
}
