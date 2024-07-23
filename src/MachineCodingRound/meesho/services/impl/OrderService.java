package MachineCodingRound.meesho.services.impl;

import MachineCodingRound.SuperBidding.services.BuyerService;
import MachineCodingRound.meesho.dto.Order;
import MachineCodingRound.meesho.respository.OrderRepository;
import MachineCodingRound.meesho.services.OrderServiceI;

public class OrderService implements OrderServiceI {

        OrderRepository orderRepository;
        ProductService productService;
        UserService userService;

        public OrderService(OrderRepository orderRepository,ProductService productService,
                UserService userService){
            this.orderRepository = orderRepository;
            this.productService = productService;
            this.userService = userService;
        }

        @Override
        public String addOrder(Order order) {
            // Check Pincode
            // Check Inventory
            if(productService.checkInventory(order.getQuantity(),order.getProductId())){
                Order createdOrder =  orderRepository.createOrder(order);
                return createdOrder.getOrderId();
            }
            throw new RuntimeException("Product not available");
        }

        @Override
        public Order getOrder(String orderId)  {
            return orderRepository.getOrder(orderId);
        }
}
