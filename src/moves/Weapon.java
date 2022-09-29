package moves;

import entities.*;

public class Weapon extends Damager {
	final float LEVEL_SCALE_MODIFIER = .5f;
	
	int initialBaseDamage;
	int initialCritDamage;
	
	public Weapon(int baseDamage, int critDamage) {
		super(baseDamage, critDamage);
		initialBaseDamage = baseDamage;
		initialCritDamage = critDamage;
	}
	
	public void scaleDamage(Player plr) {
		baseDamage = initialBaseDamage * plr.getLevel() * LEVEL_SCALE_MODIFIER;
	}
	
}
