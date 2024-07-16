package MachineCodingRound.snakeAndLadder.utils;

import MachineCodingRound.snakeAndLadder.dto.Ladder;
import MachineCodingRound.snakeAndLadder.dto.Player;
import MachineCodingRound.snakeAndLadder.dto.Snake;

import java.util.List;
import java.util.Queue;

public class PlayerHelper {
    public static Player getPlayerByName(String playerName, Queue<Player> playerList) {
        for(Player player:playerList){
            if(player.getName().equals(playerName)){
                return player;
            }
        }
        return null;
    }

    public static int positionAfterSnakeAndLadder(int nextPosition, List<Snake> snakeList, List<Ladder>ladderList){
        for(Snake snake:snakeList){
            if(snake.getTopPostion()==nextPosition){
                return snake.getBottomPosition();
            }
        }
        for(Ladder ladder:ladderList){
            if(ladder.getBottomPosition()==nextPosition){
                return ladder.getTopPostion();
            }
        }
        return nextPosition;
    }
}
