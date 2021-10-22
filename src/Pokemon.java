/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @abstractClass Pokemon
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference "Identifying the Interfaces Implemented by a Class": https://www.eg.bucknell.edu/~mead/Java-tutorial/reflect/class/getInterfaces.html
 */
abstract class Pokemon extends Entity{

	/**
	 * Battle Table
	 * Set - Each set represents which type is attacking (Fire, Water, or Grass..?)
	 * Set Values - Each value in the set represents which type is defending 
	 * 				(In order of Fire, Water, and Grass per set)
	 * ---------------------------------------------------------------------------------
	 * First set of table {1,.5,2}] Fire Attacking
	 * { (Fire) Normal Damage,	 (Water) Half Damage,	 (Grass) Double Damage}
	 * ---------------------------------------------------------------------------------
	 * Second set of table {2,1,.5}] Water Attacking
	 * { (Fire) Double Damage,	 (Water) Normal Damage,	 (Grass) Half Damage}
	 * ---------------------------------------------------------------------------------
	 * Third set of table {.5,2,1}] Grass Attacking
	 * { (Fire) Half Damage,	 (Water) Double Damage,	 (Grass) Normal Damage}
	 * ---------------------------------------------------------------------------------
	 * {0	1	2}			{Fire	Water	Grass}
	 * {0	1	2}			{Fire	Water	Grass}
	 * {0	1	2}			{Fire	Water	Grass}
	 * ---------------------------------------------------------------------------------
	 */
	static final double[][] battleTable = {{1,.5,2,3},{2,1,.5,.75},{.5,2,1,.25},{.25,1.25,3,1}};
	
	/**
	 * Initializes abstract class Pokemon
	 * @param n - Name of the Pokemon
	 * @param mHP - Maximum HP of the Pokemon
	 */
	public Pokemon(String n, int mHP) {
		super(n, mHP);
	}

	abstract String getSpecialMenu();
	abstract int getNumSpecialMenuItems();
	abstract String specialAttack(Pokemon p, int move);
	
	/**
	 * A String that provides a basic menu of what attack types the user can choose
	 * @return a string providing the choices of attack type
	 */
	public String getBasicMenu(){
		return "1. Basic Attack\n2. Special Attack";
	}
	
	/**
	 * An integer that provides information on the amount of attack choice types the player can choose from
	 * @return the amount of choices the player can select from
	 */
	public int getNumBasicMenuItems(){
		return 2;	
	}
	
	/**
	 * Receives the provided input choice (int) and provides dialogue.
	 * @param Pokemon - provided Pokemon
	 * @param move - selection provided from the user
	 */
	public String basicAttack(Pokemon p, int move){
		switch(move) {
		case 1:
			return this.slam(p);
		case 2:
			return this.tackle(p);
		case 3:
			return this.punch(p);
		default:
			//This part of the code should never happen.
			return "You yelled a move, but nothing happened...";
		}
	}
	
	/**
	 * A String that provides a basic attack menu of what attacks the user can choose.
	 * @return a string providing the choices of attack
	 */
	public String getAttackMenu(){
		return "1. Slam\n2. Tackle\n3. Punch";	
	}
	
	/**
	 * An integer that provides information on the amount of attacks the player can choose from
	 * @return the amount of attacks the player can choose from
	 */
	public int getNumAttackItems(){
		return 3;	
	}

	/**
	 * Initiates move Slam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Slam
	 */
	public String slam(Pokemon p){
		//Feel Free to Adjust Damage
		int damage = 1;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses Slam on " + p.getName();	
	}
	
	/**
	 * Initiates move Tackle (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Tackle
	 */
	public String tackle(Pokemon p){
		//Feel Free to Adjust Damage
		int damage = 1;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses Tackle on " + p.getName();	
	}
	
	/**
	 * Initiates move Punch (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Punch
	 */
	public String punch(Pokemon p){
		//Feel Free to Adjust Damage
		int damage = 1;
		this.takeDamage((int)(damage * this.battleTable[this.getType()][p.getType()]));
		return this.getName() + " uses Punch on " + p.getName();	
	}
	
	/**
	 * Type Values:
	 * 0 - Fire
	 * 1 - Water
	 * 2 - Grass
	 * Each value correlates to the battleTable
	 * @return Pokemon Type Value
	 */
	public int getType(){
		String type = "";
		Class[] intf = this.getClass().getInterfaces();
		for(int i = 0; i < intf.length; i++) {
			type = intf[i].getName();
			if (type.equals("Fire")) {
				return 0;
			} else if (type.equals("Water")) {
				return 1;
			} else if (type.equals("Grass")) {
				return 2;	
			} else if (type.equals("Ice_Fairy")) {
				return 3;
			}
		}
		//This should NEVER run
		return 0;	
	}
}
