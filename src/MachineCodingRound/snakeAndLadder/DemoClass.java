package MachineCodingRound.snakeAndLadder;

import MachineCodingRound.snakeAndLadder.dto.Dice;
import MachineCodingRound.snakeAndLadder.services.*;

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        Dice dice = new Dice(1,6);
        PlayerService playerService = new PlayerService();
        SnakeService snakeService = new SnakeService();
        LadderService ladderService = new LadderService();
        DiceService diceService=new DiceService(dice);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Snake and Ladder!");
        System.out.println("Please add the snakes");
        int snakeCount = scanner.nextInt();
        while(snakeCount>0){
            System.out.println("Please add top position of snake and then bottom position");
            int topPosition = scanner.nextInt();
            int bottomPosition = scanner.nextInt();
            snakeService.addSnakes(topPosition,bottomPosition);
            snakeCount--;
        }

        System.out.println("Please add the ladders");
        int ladderCount = scanner.nextInt();
        while(ladderCount>0){
            System.out.println("Please add bottom position of ladder and then top position");

            int bottomPosition = scanner.nextInt();
            int topPosition = scanner.nextInt();

            ladderService.addLadders(topPosition,bottomPosition);
            ladderCount--;
        }

        System.out.println("Please add the number of players");
        int playerCount = scanner.nextInt();
        while(playerCount>0){
            System.out.println("Please add name of player");
            String name = scanner.next();
            playerService.addPlayers(name);
            playerCount--;
        }

        while(true){
            String nextPlayer=playerService.getNextPlayer();
            if(nextPlayer==""){
                System.out.println("no players");
                break;
            }
          boolean hasWon=  playerService.playMove(nextPlayer,snakeService.getSnakeList(),
                    ladderService.getLaddersList(),diceService);

            if(hasWon)break;
        }
    }
}
