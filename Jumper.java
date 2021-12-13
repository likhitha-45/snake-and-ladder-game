package snakeandladder;
public class Jumper {
    int startPoint;
    int endPoint;
    public Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
}
class Ladder extends Jumper{
	Ladder(int s, int e){
		super(s,e);
	}
	public int getEndPoint() {
		return endPoint;
	}
}
class Snakes extends Jumper{
	Snakes(int s, int e){
		super(s,e);
	}
	public int getEndPoint() {
		return endPoint;
	}
}