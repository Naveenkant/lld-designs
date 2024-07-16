package MachineCodingRound.snakeAndLadder.services;

import MachineCodingRound.snakeAndLadder.Repository.SnakesRepository;
import MachineCodingRound.snakeAndLadder.dto.Snake;

import java.util.List;

public class SnakeService {

    SnakesRepository snakesRepository=SnakesRepository.getInstance();
    List<Snake>snakeList=snakesRepository.getSnakeList();

    public void addSnakes(int topPostion,int bottomPostion){
        Snake snake=new Snake(topPostion,bottomPostion);
       snakeList.add(snake);
        System.out.println("Snake added");
    }
    public List<Snake> getSnakeList(){
        return snakeList;
    }
}
