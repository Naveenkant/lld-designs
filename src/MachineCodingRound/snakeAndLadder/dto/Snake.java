package MachineCodingRound.snakeAndLadder.dto;

public class Snake {
    int topPostion;
    int bottomPosition;

    public Snake(int topPostion, int bottomPosition) {
        this.topPostion = topPostion;
        this.bottomPosition = bottomPosition;
    }

    public int getTopPostion() {
        return topPostion;
    }

    public void setTopPostion(int topPostion) {
        this.topPostion = topPostion;
    }

    public int getBottomPosition() {
        return bottomPosition;
    }

    public void setBottomPosition(int bottomPosition) {
        this.bottomPosition = bottomPosition;
    }
}
