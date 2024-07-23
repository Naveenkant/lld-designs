package MachineCodingRound.meesho.respository;

import MachineCodingRound.meesho.dto.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    Map<String, User> users;

    public UserRepository() {
        users = new HashMap<String, User>();
    }

    public User createUser(User user){
        if(users.get(user.getId())!=null) {
            throw new RuntimeException("User already exists");
        }
        users.put(user.getId(), user);
        return user;
    }

    public User getUser(String userId){
        return users.get(userId);
    }

}
