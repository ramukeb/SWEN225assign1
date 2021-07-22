package cards;

import game.Player;

public class WeaponCard extends Card {
	
	public WeaponCard(Player p, String s) {
		super(p, s);
	}
	
	public WeaponCard clone() {
		return new WeaponCard(this.player, this.value);
	}

}
