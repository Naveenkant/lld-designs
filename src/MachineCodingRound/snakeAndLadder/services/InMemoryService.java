package MachineCodingRound.snakeAndLadder.services;

import java.util.Scanner;

public class InMemoryService {

    public InMemoryService(Scanner scanner) {
    SnakeService snakeService = new SnakeService();
    LadderService ladderService = new LadderService();
    PlayerService playerService = new PlayerService();

//    snakeService.initializeSnakeRepository(scanner);
//    ladderService.initializeLadderRepository(scanner);
//    playerService.initializePlayerService(scanner);
    }
}
