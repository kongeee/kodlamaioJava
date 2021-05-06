
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("game added :"+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("game deleted :"+ game.getGameName());
	}
}
