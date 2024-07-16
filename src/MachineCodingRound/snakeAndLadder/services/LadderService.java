package MachineCodingRound.snakeAndLadder.services;

import MachineCodingRound.snakeAndLadder.Repository.LadderRepository;
import MachineCodingRound.snakeAndLadder.dto.Ladder;

import java.util.List;

public class LadderService {
    LadderRepository ladderRepository=LadderRepository.getInstance();

    List<Ladder>ladderList=ladderRepository.getLaddersList();

    public void addLadders(int topPosition,int bottomPosition){
        Ladder ladder=new Ladder(topPosition,bottomPosition);
        ladderList.add(ladder);
        System.out.println("ladder added");
    }
    public List<Ladder> getLaddersList(){
        return ladderList;
    }
}

