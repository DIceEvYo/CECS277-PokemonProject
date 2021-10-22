/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @class Bulbasaur
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokedex: https://www.pokemon.com/us/pokedex/
 */
public class Bulbasaur extends Pokemon implements Grass{
	
	public Bulbasaur() {
		//HP ranging from 50 to 60 to 70 on the cards.		
		super("Bulbasaur", 60);
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
	 * Initiates move Vine Whip (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Vine Whip
	 */
	public String vineWhip(Pokemon p) {
		int minD = 1;
		int maxD = 4;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses vine whip on " + p.getName();
	}
	
	/**
	 * Initiates move Razor Leaf (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Razor Leaf
	 */
	public String razorLeaf(Pokemon p) {
		int minD = 2;
		int maxD = 5;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses razor leaf on " + p.getName();
	}
	
	/**
	 * Initiates move Solar Beam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Solar Beam
	 */
	public String solarBeam(Pokemon p) {
		int minD = 0;
		int maxD = 6;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses solar beam on " + p.getName();
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
			return this.vineWhip(p);
		case 2:
			return this.razorLeaf(p);
		case 3:
			return this.solarBeam(p);
		default:
			//This part of the code should never happen.
			return "You yelled a move, but nothing happened...";
		}
			
	}

}
