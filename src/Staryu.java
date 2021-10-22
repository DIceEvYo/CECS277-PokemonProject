/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @class Staryu
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokedex: https://www.pokemon.com/us/pokedex/
 */
public class Staryu extends Pokemon implements Water{
	
	public Staryu() {
		//HP ranging from 50 to 60 on the cards.		
		super("Staryu", 55);
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
	 * Initiates move Water Gun (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Water Gun
	 */
	public String waterGun(Pokemon p) {
		int minD = 1;
		int maxD = 6;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses water gun on " + p.getName();
	}
	
	/**
	 * Initiates move Bubble Beam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Bubble Beam
	 */
	public String bubbleBeam(Pokemon p) {
		int minD = 1;
		int maxD = 3;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses bubble beam on " + p.getName();
	}
	
	/**
	 * Initiates move Water Fall (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Water Fall
	 */
	public String waterfall(Pokemon p) {
		int minD = 1;
		int maxD = 5;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses waterfall on " + p.getName();
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
			return this.waterGun(p);
		case 2:
			return this.bubbleBeam(p);
		case 3:
			return this.waterfall(p);
		default:
			//This part of the code should never happen.
			return "You yelled a move, but nothing happened...";
		}
			
	}

}
