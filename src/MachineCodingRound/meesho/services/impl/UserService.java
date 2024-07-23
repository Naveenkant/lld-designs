package MachineCodingRound.meesho.services.impl;

import MachineCodingRound.meesho.dto.User;
import MachineCodingRound.meesho.respository.UserRepository;
import MachineCodingRound.meesho.services.UserServiceI;

public class UserService implements UserServiceI {
    /*
    Add user
    get user
     */

        UserRepository userRepository;
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public String addUser(User user) {
           User newuser= userRepository.createUser(user);
            return newuser.getId();
        }
        public User getUser(String userId) {
         User user=   userRepository.getUser(userId);
         if(user==null){
             System.out.println("User not found");
         }
            System.out.println("User found");
            return user;
        }

}
