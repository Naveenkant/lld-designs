package MachineCodingRound.snakeAndLadder.Repository;

import MachineCodingRound.snakeAndLadder.dto.Ladder;

import java.util.ArrayList;
import java.util.List;

public class LadderRepository {
    private static LadderRepository instance;
    List<Ladder> laddersList;

    private LadderRepository() {
        laddersList = new ArrayList<Ladder>();
    }
    public synchronized static LadderRepository getInstance() {
        if (instance == null) {
            instance = new LadderRepository();
        }
        return instance;
    }

    public List<Ladder> getLaddersList() {
        return laddersList;
    }

    public void addLadderInLIst(Ladder ladder) {
       laddersList.add(ladder);
    }
}
