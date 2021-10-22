/**
 * @project Touhou CECS 277
 * @author dpaul
 * @class Cirno (BAKA BAKAAAAAA!!!)
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference GamePress.GG: https://gamepress.gg/lostword/character/cirno
 * @reference Touhou LostWord
 */
public class Cirno extends Pokemon implements Ice_Fairy{
	
	public Cirno() {		
		super("Cirno", 100);
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
	 * Initiates move Icicle Fall (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Icicle Fall
	 */
	public String icicleFall(Pokemon p) {
		int minD = 5;
		int maxD = 10;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses ICICLE FAAAALL on " + p.getName();
	}
	
	/**
	 * Initiates move Perfect Freeze (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Perfect Freeze
	 */
	public String perfectFreeze(Pokemon p) {
		int minD = 5;
		int maxD = 10;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses PERFECT FREEEZE on " + p.getName();
	}
	
	/**
	 * Initiates move Snowball Earth (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Snowball Earth
	 */
	public String snowBallEarth(Pokemon p) {
		int minD = 5;
		int maxD = 10;
		int rD = maxD - minD + 1;
		int damage = (int)(Math.random() * rD) + minD;
		p.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses Snowball Earth on " + p.getName();
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
			return this.icicleFall(p);
		case 2:
			return this.perfectFreeze(p);
		case 3:
			return this.snowBallEarth(p);
		default:
			//This part of the code should never happen.
			return "You yelled a move, but nothing happened...";
		}
			
	}

}
