package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.GameDao;
import gameDemo.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Hibernate ile eklendi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Hibernate ile güncellendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Hibernate ile silindi: " + game.getGameName());
		
	}

}
