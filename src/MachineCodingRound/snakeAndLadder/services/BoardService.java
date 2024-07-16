package MachineCodingRound.snakeAndLadder.services;

public class BoardService {

//        public static void addPlayers(String name){
//        Player player=new Player(name,0);
//        playerList.add(player);
//        System.out.println("player added");
//    }
//
//    public  boolean playMove(String playerName, List<Snake>snakeList,List<Ladder>ladderList,DiceService diceService){
//        Player player=getPlayerByName(playerName, playerList);
//        int currentPosition=player.getCurrentPosition();
//
//        int nextPostion=currentPosition+diceService.rollDice();
//        System.out.println(player.getName()+" rolled a "+nextPostion+
//                " and moved from "+currentPosition +" to "+nextPostion);
//        int finalPosition=positionAfterSnakeAndLadder(nextPostion,snakeList,ladderList);
//        if(finalPosition>=100){
//            System.out.println("Player "+player.getName()+" has won the match");
//            return true;
//        }
//        player.setCurrentPosition(finalPosition);
//
//        playerList.poll();
//        playerList.add(player);
//        return false;
//    }
//    public String getNextPlayer(){
//        if(!playerList.isEmpty()){
//            Player player=playerList.peek();
//            System.out.println("player "+player.getName()+" will play next move");
//            return player.getName();
//
//        }
//        System.out.println("No players have been added");
//        return "";
//
//    }
}
