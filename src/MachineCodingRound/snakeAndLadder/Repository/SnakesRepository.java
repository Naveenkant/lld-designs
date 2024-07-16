package MachineCodingRound.snakeAndLadder.Repository;

import MachineCodingRound.snakeAndLadder.dto.Ladder;
import MachineCodingRound.snakeAndLadder.dto.Snake;

import java.util.ArrayList;
import java.util.List;

public class SnakesRepository {
    private static SnakesRepository instance;
    List<Snake> snakesList;

    private SnakesRepository() {
        snakesList = new ArrayList<Snake>();
    }
    public synchronized static SnakesRepository getInstance() {
        if (instance == null) {
            instance = new SnakesRepository();
        }
        return instance;
    }

    public List<Snake> getSnakeList() {
        return snakesList;
    }

    public void addSnakeToList(Snake snake) {
        snakesList.add(snake);
    }

}
