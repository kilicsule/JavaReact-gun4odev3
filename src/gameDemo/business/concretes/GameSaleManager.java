package gameDemo.business.concretes;

import gameDemo.business.abstracts.GameSaleService;
import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Game;
import gameDemo.entities.concretes.User;

public class GameSaleManager implements GameSaleService {

	private User user;
	private Game game;
	private Campaign campaign;
	
	public GameSaleManager() {

	}
	
	public GameSaleManager(User user, Game game, Campaign campaign) {
		this.user = user;
		this.game = game;
		this.campaign = campaign;
	}


	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getUserName() + " kullanıcı adlı kullanıcı " + game.getGameName() + " oyununu " + campaign.getCampaignName() + " ile satın almıştır.");
		
	}

}
