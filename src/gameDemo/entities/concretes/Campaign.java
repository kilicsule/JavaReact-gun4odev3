package gameDemo.entities.concretes;

import gameDemo.entities.abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private double discount;
	private int campaignDate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, double discount, int campaignDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignDate = campaignDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaigName) {
		this.campaignName = campaigName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getCampaignDate() {
		return campaignDate;
	}

	public void setCampaignDate(int campaignDate) {
		this.campaignDate = campaignDate;
	}
	
	
	
	
	
	
}
