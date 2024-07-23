package MachineCodingRound.rateLimiter.service;

import MachineCodingRound.rateLimiter.constants.RateLimiterConstants;
import MachineCodingRound.rateLimiter.utils.Pair;

import java.util.*;
public class RateLimiterService {
    Map<Integer, Pair> rateLimiterMap;

    public RateLimiterService() {
        rateLimiterMap = new HashMap<>();
    }
    public boolean rateLimit(int customerId){
        if(!rateLimiterMap.containsKey(customerId)){
                rateLimiterMap.put(customerId,new Pair(RateLimiterConstants.BUCKET_SIZE-1,
                        System.currentTimeMillis()+RateLimiterConstants.TIME_WINDOW));
                return true;
        }else{
            Pair pair = rateLimiterMap.get(customerId);
            if(pair.getBucketSize() >0) {
                pair.setBucketSize(pair.getBucketSize()-1);
                rateLimiterMap.put(customerId, pair);
                return true;
            }else{
                long currentTime = System.currentTimeMillis();
                if(pair.getTime()<currentTime){
                    pair.setTime(currentTime+1000);
                    pair.setBucketSize(RateLimiterConstants.BUCKET_SIZE-1);
                    rateLimiterMap.put(customerId,pair);
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
}

