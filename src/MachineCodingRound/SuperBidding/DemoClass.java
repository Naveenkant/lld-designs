package MachineCodingRound.SuperBidding;

import MachineCodingRound.SuperBidding.dto.Buyer;
import MachineCodingRound.SuperBidding.dto.Seller;
import MachineCodingRound.SuperBidding.services.*;

import java.util.*;

public class DemoClass {
    public static void main(String[] args) {
        BuyerService buyerService = new BuyerService();
        SellerService sellerService = new SellerService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bidding Auction starts");
        while (true) {
            System.out.println("enter the input");
            String input = scanner.nextLine();
            input = input.trim();
            String[] inpArr = input.split(" ");
            try {
                switch (inpArr[0]) {
                    //    ADD_BUYER,ADD_SELLER,CREATE_AUCTION,CREATE_BID,WITHDRAW_BID,UPDATE_BID,CLOSE_AUCTION
                    case "ADD_BUYER": {
                        Buyer buyer = new Buyer(inpArr[1]);
                        buyerService.ADD_BUYER(buyer);
                    }
                    break;
                    case "ADD_SELLER": {
                        Seller seller = new Seller(inpArr[1]);
                        sellerService.ADD_SELLER(seller);
                    }
                    break;
                    case "CREATE_AUCTION": {
                        sellerService.CREATE_AUCTION(inpArr[1], Integer.parseInt(inpArr[2]), Integer.parseInt(inpArr[3]), inpArr[4]);
                    }
                    break;
                    case "CREATE_BID": {

                        buyerService.CREATE_BID(inpArr[1], inpArr[2], Integer.parseInt(inpArr[3]));
                    }
                    break;
                    case "WITHDRAW_BID": {
                        buyerService.WITHDRAW_BID(inpArr[1], inpArr[2]);
                    }
                    break;
                    case "UPDATE_BID": {
                        buyerService.UPDATE_BID(inpArr[1], inpArr[2], Integer.parseInt(inpArr[3]));
                    }
                    break;
                    case "CLOSE_AUCTION": {
                        sellerService.CLOSE_AUCTION(inpArr[1]);
                    }
                    break;
                    default:
                        System.out.println("Invalid Command");
                }
            } catch (RuntimeException runtimeException) {
                System.out.println(runtimeException);
            }
        }
    }

}
//    InMemory inMemory=new InMemory();
