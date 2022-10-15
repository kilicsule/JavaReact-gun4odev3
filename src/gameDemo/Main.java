package gameDemo;

import gameDemo.business.concretes.GameManager;
import gameDemo.business.concretes.GameSaleManager;
import gameDemo.business.concretes.UserManager;
import gameDemo.core.concretes.MernisServiceAdapter;
import gameDemo.dataAccess.concretes.HibernateUserDao;
import gameDemo.entities.concretes.Campaign;
import gameDemo.entities.concretes.Game;
import gameDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("kilicsule");
		user1.setFirstName("Şule");
		user1.setLastName("Kılıç");
		user1.setNationalityId("57121565060");
		user1.setDateOfBirth(1997);
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Pubg");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Şirket kampanyası");
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(user1, game1, campaign1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);

	}

}
