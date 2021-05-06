
public class SaleManager implements SaleService {
	
	private User user;
	private Game[] games;
	private double total = 0;

	public SaleManager(User user, Game[] games) {
		this.user = user;
		this.games = games;
	}
	
	public void add(Sale sale, Campaign[] campaigns) {
		for(Game game: games) {
			System.out.println(user.getFirstName()+" bought "+game.getGameName());
			total += game.getPrice();
		}
		sale.setTotalPrice(total);
		System.out.println("Total price is :"+sale.getTotalPrice());
		sale.setAfterCampaignPrice(sale.getTotalPrice());
		
		for(Campaign campaign: campaigns) {
			sale.setAfterCampaignPrice(sale.getAfterCampaignPrice()-(sale.getAfterCampaignPrice()*campaign.getDiscount()/100));
			System.out.println("Price : "+sale.getAfterCampaignPrice()+" after "+campaign.getName());
		}
		System.out.println("Total price after campaigns:"+sale.getAfterCampaignPrice());
		
	}
	
}
