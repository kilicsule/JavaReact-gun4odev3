package gameDemo.business.concretes;

import gameDemo.business.abstracts.GameService;
import gameDemo.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameName());		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getGameName());
		
	}

	
}
