
public class Game {
	private int gameID;
	private String gameName;
	private double price;
	 
	
	public Game() {}

	public Game(int gameID, String gameName, double price) {
		super();
		this.gameID = gameID;
		this.gameName = gameName;
		this.price = price;
		
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
