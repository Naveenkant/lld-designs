package MachineCodingRound.snakeAndLadder.Repository;

import MachineCodingRound.snakeAndLadder.dto.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayerRepository {
    private static PlayerRepository instance ;
    Queue<Player> playerList;

    private PlayerRepository() {
        playerList = new LinkedList<Player>();
    }
    public static PlayerRepository getInstance() {
        if (instance == null) {
            instance = new PlayerRepository();
        }
        return instance;
    }
    public Queue<Player> getPlayerList() {
        return playerList;
    }
    public void addPlayerToList(Player player) {
        playerList.add(player);
    }
}
