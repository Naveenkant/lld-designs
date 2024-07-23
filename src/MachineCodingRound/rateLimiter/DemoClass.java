package MachineCodingRound.rateLimiter;

import MachineCodingRound.rateLimiter.service.RateLimiterService;

public class DemoClass {
    public static void main(String[] args) {

        System.out.println("Welcome to Rate limiter!");
        RateLimiterService rateLimiterService=new RateLimiterService();

        for (int i=0;i<10;i++) {
            System.out.println(rateLimiterService.rateLimit(1)+" customerId=1");
            System.out.println(rateLimiterService.rateLimit(2)+" customerId=2");
            System.out.println(rateLimiterService.rateLimit(3)+" customerId=3");
            System.out.println(rateLimiterService.rateLimit(4)+" customerId=4");
            System.out.println(rateLimiterService.rateLimit(5)+" customerId=5");
        }

    }
}
