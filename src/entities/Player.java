package entities;

import moves.*;

public class Player extends Entity {

	// TO IMPLEMENT
	
	private int Level = 1;
	private int currentExp = 0;
	private int maxExp = 25;
	
	private Weapon equippedWeapon;
	
	public int getLevel() {
		return Level;
	}

	public void levelUp() {
		Level++;
	}

	public int getCurrentExp() {
		return currentExp;
	}

	public void gainExp(int exp) {
		this.currentExp += exp;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public void equipWeapon(Weapon equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public Player(String name, int maxHealth) {
		super(name, maxHealth);
	}
}
