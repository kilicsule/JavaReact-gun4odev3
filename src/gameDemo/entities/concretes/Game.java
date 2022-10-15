package gameDemo.entities.concretes;

import gameDemo.entities.abstracts.Entity;

public class Game implements Entity {

	private int id;
	private String gameName;
	private String categoryName;
	private double price;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, String categoryName, double price) {
		this.id = id;
		this.gameName = gameName;
		this.categoryName = categoryName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
}
