package moves;

import java.util.Random;
import entities.Entity;

public abstract class Damager {
	
	final int CRIT_ODDS = 5;
	
	int baseDamage;
	int critDamage;
	
	public Damager(int baseDamage, int critDamage) {
		this.baseDamage = baseDamage;
		this.critDamage = critDamage;
	}
	
	private boolean rollCrit() {
		Random rnd = new Random();
		return rnd.nextInt(CRIT_ODDS) == 0;
	}
	
	public int hit(Entity target) {
		return target.takeDamage(rollCrit() ? critDamage : baseDamage);
	}
	
}
