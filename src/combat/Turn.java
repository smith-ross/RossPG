package combat;
import entities.*;

public class Turn {
	
	private Ally ally;
	private Enemy enemy;
	private boolean isAlly = false;
	
	public Turn(Ally ally) {
		this.ally = ally;
		this.isAlly = true;
	}
	
	public Turn(Enemy enemy) {
		this.enemy = enemy;
	}
	

	private void melee() {}
	
	public void begin() {
		if (isAlly) {
			System.out.println(
				String.format(BattleStringConstant.TURN_START_MSG.getValue(), 
				this.ally.getName(), this.ally.getHealth(), this.ally.getMaxHealth(), this.ally.getMana(), this.ally.getMaxMana()
				));
			
			String selectedOption = Battle.allyOptions.get();
			switch (selectedOption) {
				case "MELEE":
					melee();
					break;
			}
		}
		else {
			
		}
	}
}
