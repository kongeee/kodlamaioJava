
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : "+ campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted : "+ campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign, double newDiscount) {
		double temp = campaign.getDiscount();
		campaign.setDiscount(newDiscount);
		System.out.println("Discount is updated (from "+temp+" to "+campaign.getDiscount());
		
	}

}
