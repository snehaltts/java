
public class Wicket {

	
	private String playerName;
	private Bowler BowlerObject;
	
	
	
	public Wicket(String playerName, Bowler BowlerObject) {
		super();
		this.playerName = playerName;
		this.BowlerObject = BowlerObject;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getBowlerObject() {
		return BowlerObject;
	}
	public void setBowlerObject(Bowler BowlerObject) {
		this.BowlerObject = BowlerObject;
	}

	public String toString() {
		return "Wicket [playerName=" + playerName + ", BowlerObject=" + BowlerObject + "]";
	}
}