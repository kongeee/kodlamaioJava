
public class Main {

	public static void main(String[] args) {
		
		User ekici = new User(1, "furkan", "ekici", "12345678910", "1997");
		UserManager userManager = new UserManager(new UserCheckManager());
		userManager.add(ekici);
		
		Game game1 = new Game(1, "Battlefield", 100);
		Game game2 = new Game(2, "GTA", 195);
		Game game3 = new Game(3, "CS", 24);
		
		Game[] games = {game1, game2, game3};
		
		Campaign campaign1 = new Campaign(1, "Ekici", 10);
		Campaign campaign2 = new Campaign(2, "black friday", 20);
		Campaign[] campaigns = {campaign1, campaign2};
		
		SaleManager saleManager = new SaleManager(ekici, games);
		
		saleManager.add(new Sale(), campaigns);
		
	}

}
