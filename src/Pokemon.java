/**
 * 
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
	static final double[][] battleTable = {{1,.5,2},{2,1,.5},{.5,2,1}};
	
	
	public Pokemon(String n, int mHP) {
		super(n, mHP);

	}

	abstract String getSpecialMenu();
	abstract int getNumSpecialMenuItems();
	abstract String specialAttack(Pokemon p, int move);
	
	/*TODO
	public String getBasicMenu(){
		return null;	
	}
	
	public int getNumBasicMenuItems(){
		return null;	
	}
	
	public String basicAttack(Pokemon p, int move){
		return null;	
	}
	
	public String getAttackMenu(){
		return null;	
	}
	
	public int getNumAttackItems(){
		return null;	
	}
	*/
	
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
		String type = null;
		Class[] intf = this.getClass().getInterfaces();
		for(int i = 0; i < intf.length; i++) {
			type = intf[i].getName();
			if (type.equals("Fire")) {
				return 0;
			} else if (type.equals("Water")) {
				return 1;
			} else if (type.equals("Grass")) {
				return 2;	
			}
		}
		//This should NEVER run
		return 0;	
	}
}
