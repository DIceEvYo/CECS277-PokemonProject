/**
 * 
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokedex: https://www.pokemon.com/us/pokedex/
 */
public class Bulbasaur extends Pokemon implements Grass{
	
	public Bulbasaur() {
		//HP ranging from 50 to 60 to 70 on the cards.		
		super("Bulbasaur", 60);
	}

	@Override
	String getSpecialMenu() {
		return specialMenu;
	}

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
		int maxD = 3;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses vine whip on " + p.getName();
	}
	
	/**
	 * Initiates move Razor Leaf (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Razor Leaf
	 */
	public String razorLeaf(Pokemon p) {
		int minD = 2;
		int maxD = 4;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses razor leaf on " + p.getName();
	}
	
	/**
	 * Initiates move Solar Beam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Solar Beam
	 */
	public String solarBeam(Pokemon p) {
		int minD = 0;
		int maxD = 5;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses solar beam on " + p.getName();
	}
	
	/**
	 * Receives the provided input choice (int) and provides dialogue.
	 * @param Pokemon - provided Pokemon
	 * @param move - selection provided from the user
	 */
	@Override
	String specialAttack(Pokemon p, int move) {
		String attack;
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
