package MachineCodingRound.meesho.services;

import MachineCodingRound.meesho.dto.User;

public interface UserServiceI {
    public String addUser(User user);
    public User getUser(String userId);
}
