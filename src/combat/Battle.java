package combat;

import java.util.ArrayList;

import output.*;
import entities.*;
import misc.OptionSelect;

public class Battle {
	private ArrayList <Ally> party;
	private ArrayList <Enemy> enemies;
	
	private BattleState state = BattleState.START;
	
	final public static OptionSelect allyOptions = new OptionSelect("MELEE", "MOVES", "CHARGE", "BAG");
	
	public Battle(Player player, Enemy enemy) { 
		this.party = new ArrayList <Ally> ();
		this.enemies = new ArrayList <Enemy> ();
		this.party.add(player);
		this.enemies.add(enemy);
	}
	
	public Battle(ArrayList <Ally> party, ArrayList <Enemy> enemies) {
		this.party = party;
		this.enemies = enemies;
	}
	
	
	private void allyTurn(Ally turnAlly) {
		assert (state != BattleState.PLAYER_TURN) : "Ally turn taken on ENEMY_TURN state!";
		
		new Turn(turnAlly).begin();
		
	}
	
	public static void main(String[] args) {
		Player plr = new Player("Ross", 100);
		Battle testBattle = new Battle(plr, new Enemy("Wolf", 20));
		testBattle.allyTurn(plr);
	}
	
}
