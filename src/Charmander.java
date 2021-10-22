/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @class Charmander
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokedex: https://www.pokemon.com/us/pokedex/
 */
public class Charmander extends Pokemon implements Fire{
	
	public Charmander() {
		//HP is typically 70 on the cards.		
		super("Charmander", 70);
	}

	/**
	 * A String that provides a special menu of what attack types the user can choose based on the Pokemon's type
	 * @return a string providing the choices of special attack type
	 */
	@Override
	String getSpecialMenu() {
		return specialMenu;
	}

	/**
	 * An integer that provides information on the amount of special attack choice types the player can choose from
	 * @return the amount of choices the player can select from
	 */
	@Override
	int getNumSpecialMenuItems() {
		return numSpecialMenuItems;
	}

	/**
	 * Initiates move Ember (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Ember
	 */
	public String ember(Pokemon p) {
		int minD = 0;
		int maxD = 3;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses ember on " + p.getName();
	}
	
	/**
	 * Initiates move Fire Blast (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Blast
	 */
	public String fireBlast(Pokemon p) {
		int minD = 1;
		int maxD = 4;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses fire blast on " + p.getName();
	}
	
	/**
	 * Initiates move Fire Punch (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Punch
	 */
	public String firePunch(Pokemon p) {
		int minD = 1;
		int maxD = 3;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses fire punch on " + p.getName();
	}
	
	/**
	 * Receives the provided input choice (int) and provides dialogue.
	 * @param Pokemon - provided Pokemon
	 * @param move - selection provided from the user
	 */
	@Override
	String specialAttack(Pokemon p, int move) {
		switch(move) {
		case 1:
			return this.ember(p);
		case 2:
			return this.fireBlast(p);
		case 3:
			return this.firePunch(p);
		default:
			//This part of the code should never happen.
			return "You yelled a move, but nothing happened...";
		}
			
	}

}
