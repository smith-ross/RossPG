package entities;

import status.StatusEffect;

public class Entity {
	
	private String name;
	private int maxHealth;
	private int health;
	
	private StatusEffect[] statusEffects;
	private EntityState state;
	
	public String getName() {
		return name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getHealth() {
		return health;
	}

	public Entity(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.health = maxHealth;
	}
	
	public int takeDamage(int damage) {
		this.health -= damage;
		return this.health;
	}
	
	public int heal(int healAmount) {
		this.health += healAmount;
		return this.health;
	}
	
	
	
}
