package entities;

import moves.*;

public class Player extends Ally {

	// TO IMPLEMENT
	private int gold = 0;
	

	public int getGold() {
		return gold;
	}

	public void gainGold(int gold) {
		this.gold += gold;
	}


	public Player(String name, int maxHealth) {
		super(name, maxHealth);
	}
}
