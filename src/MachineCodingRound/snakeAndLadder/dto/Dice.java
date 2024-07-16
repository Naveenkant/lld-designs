package MachineCodingRound.snakeAndLadder.dto;

public class Dice {
    int lowestNumber;
    int highestNumber;

    public Dice(int lowestNumber, int highestNumber) {
        this.lowestNumber = lowestNumber;
        this.highestNumber = highestNumber;
    }
    public int getLowestNumber() {
        return lowestNumber;
    }
    public void setLowestNumber(int lowestNumber) {
        this.lowestNumber = lowestNumber;
    }
    public int getHighestNumber() {
        return highestNumber;
    }
    public void setHighestNumber(int highestNumber) {
        this.highestNumber = highestNumber;
    }
}
