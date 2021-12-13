package snakeandladder;
import java.util.*;
class GameBoard {
    private Dice dice;
    private Queue<Player> nextTurn;
    private Map<Integer,Snakes>snakes;
    private Map<Integer, Ladder> ladders;
    private List<String> winningOrder = new ArrayList<>();
    int boardSize=100;
    GameBoard(Dice dice, Queue<Player> nextTurn, Map<Integer,Snakes> snakes, Map<Integer, Ladder> ladders) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
    }
    void startGame(){
        while(nextTurn.size() > 1) {
            Player player = nextTurn.poll();
            int currentPosition = player.getLocation();
            int diceValue = dice.rollDice();
            System.out.println(player.getPlayerName()+" rolled "+ diceValue);
            int nextCell = currentPosition + diceValue;
            if(nextCell <= boardSize) {
            	if(nextCell == boardSize) {
            		winningOrder.add(player.getPlayerName());
            		System.out.println(player.getPlayerName()+" won the game.");
            	}
            	else {
            	if(snakes.containsKey(nextCell)) {
            		System.out.println(player.getPlayerName()+" bitten by snake");
            		nextCell = snakes.get(nextCell).getEndPoint();
            	}
            	if(ladders.containsKey(nextCell)) {
            		System.out.println(player.getPlayerName()+" on the ladder");
            		nextCell = ladders.get(nextCell).getEndPoint();
            	}
            	nextTurn.add(player);
            	player.setLocation(nextCell);
            }

            }
            else {
            	nextTurn.add(player);
            }
            System.out.println(player.getPlayerName()+" at position "+ player.getLocation());
            
    }
        System.out.println("Winning Order is : "+ winningOrder);
}
}