package gameDemo.business.abstracts;

import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Game;
import gameDemo.entities.concretes.User;

public interface GameSaleService {

	void sell(User user, Game game, Campaign campaign);
}
