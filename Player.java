package snakeandladder;
class Player {
    private String playerName;
    private int location = 0;
    
    Player(String playerName) {
        this.playerName = playerName;
    }
    
    public String getPlayerName() {
    	return playerName;
    }
    public int getLocation() {
    	return location;
    }
    public void setLocation(int loc) {
    	location = loc;
    }

}
