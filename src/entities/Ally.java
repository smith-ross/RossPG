package entities;

import moves.*;

public class Ally extends Entity {

	// TO IMPLEMENT
	
	private int Level = 1;
	private int currentExp = 0;
	private int maxExp = 25;
	private int mana = 10;
	private int maxMana = 10;
	
	private int gold = 0;
	
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

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public void equipWeapon(Weapon equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public Ally(String name, int maxHealth) {
		super(name, maxHealth);
	}
}
