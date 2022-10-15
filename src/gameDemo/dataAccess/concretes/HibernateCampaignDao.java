package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.CampaignDao;
import gameDemo.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Hibernate ile eklendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Hibernate ile güncellendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Hibernate ile silindi: " + campaign.getCampaignName());
		
	}

}
