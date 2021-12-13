package snakeandladder;
import java.util.*;
public class Play{
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);
    	Queue<Player> players = new LinkedList<>();
    	System.out.println("Enter number of dice : ");
    	int no_dice = sc.nextInt();
    	Dice dice = new Dice(no_dice);
    	System.out.println("Enter number of players: ");
    	int n = sc.nextInt();
    	sc.nextLine();
    	while(n-- > 0) {
    		System.out.println("Enter player name: ");
    		String name = sc.nextLine();
    		Player p = new Player(name);
    		players.add(p);
    	}
    	Snakes snake1 = new Snakes(10,2);
        Snakes snake2 = new Snakes(95,30);
        Snakes snake3 = new Snakes(99,1);
        Snakes snake4 = new Snakes(10,2);
        Snakes snake5 = new Snakes(77,14);
        Snakes snake6 = new Snakes(47,8);
        Snakes snake7 = new Snakes(29,5);
        Map<Integer,Snakes> snakes = new HashMap<>();
        snakes.put(95,snake2);
        snakes.put(10,snake1);
        snakes.put(99,snake3);
        snakes.put(47,snake6);
        snakes.put(29,snake7);
        snakes.put(77,snake5);
        snakes.put(10,snake4);
        Ladder ladder1 = new Ladder(5,25);
        Ladder ladder2 = new Ladder(40,89);
        Ladder ladder3 = new Ladder(13, 60);
        Ladder ladder4 = new Ladder(54, 83);
        Ladder ladder5 = new Ladder(4, 91);
        Map<Integer,Ladder> ladders = new HashMap<>();
        ladders.put(5,ladder1);
        ladders.put(40,ladder2);
        ladders.put(13,ladder3);
        ladders.put(54,ladder4);
        ladders.put(4,ladder5);
        //System.out.println(players.poll().getPlayerName());
        GameBoard gb=new GameBoard(dice,players,snakes,ladders);
        gb.startGame();
        sc.close();
    }
}