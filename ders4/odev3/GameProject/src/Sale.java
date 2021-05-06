
public class Sale {
	
	private double totalPrice;
	private double afterCampaignPrice;
	
	public Sale() {}

	public Sale(double totalPrice, double afterCampaignPrice) {
		super();
		this.totalPrice = totalPrice;
		this.afterCampaignPrice = afterCampaignPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getAfterCampaignPrice() {
		return afterCampaignPrice;
	}

	public void setAfterCampaignPrice(double afterCampaignPrice) {
		this.afterCampaignPrice = afterCampaignPrice;
	}
	
	
	
}
