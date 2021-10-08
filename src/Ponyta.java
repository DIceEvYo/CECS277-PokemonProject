/**
 * 
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokedex: https://www.pokemon.com/us/pokedex/
 */
public class Ponyta extends Pokemon implements Fire{
	
	public Ponyta() {
		//HP is typically 60 on the fire type cards.		
		super("Ponyta", 60);
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
	 * Initiates move Ember (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Ember
	 */
	public String ember(Pokemon p) {
		int minD = 0;
		int maxD = 4;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses ember on " + p.getName();
	}
	
	/**
	 * Initiates move Fire Blast (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Blast
	 */
	public String fireBlast(Pokemon p) {
		int minD = 2;
		int maxD = 5;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses fire blast on " + p.getName();
	}
	
	/**
	 * Initiates move Fire Punch (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Punch
	 */
	public String firePunch(Pokemon p) {
		int minD = 1;
		int maxD = 4;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses fire punch on " + p.getName();
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
