package gameDemo.dataAccess.abstracts;

import gameDemo.entities.concretes.Campaign;

public interface CampaignDao {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
