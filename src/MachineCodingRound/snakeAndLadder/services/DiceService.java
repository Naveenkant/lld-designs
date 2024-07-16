package MachineCodingRound.snakeAndLadder.services;

import MachineCodingRound.snakeAndLadder.dto.Dice;

import java.util.Random;

public class DiceService {
    Dice dice;

    public DiceService(Dice dice) {
        this.dice = dice;
    }
    public int rollDice(){
        int maxNumber=dice.getHighestNumber();
        int minNumber=dice.getLowestNumber();

        Random random = new Random();

        return random.nextInt(maxNumber) + minNumber;
    }
}
