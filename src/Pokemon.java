
public class Pokemon extends Entity{

	/**
	 * Battle Table
	 * Set - Each set represents which type is attacking (Fire, Water, or Grass..?)
	 * Set Values - Each value in the set represents which type is defending (In order of Fire, Water, and Grass per set)
	 * ---------------------------
	 * First set of table {1,.5,2}] Fire Attacking
	 * { (Fire) Normal Damage,	 (Water) Half Damage,	 (Grass) Double Damage}
	 * ---------------------------
	 * Second set of table {2,1,.5}] Water Attacking
	 * { (Fire) Double Damage,	 (Water) Normal Damage,	 (Grass) Half Damage}
	 * ---------------------------
	 * Third set of table {.5,2,1}] Grass Attacking
	 * { (Fire) Half Damage,	 (Water) Double Damage,	 (Grass) Normal Damage}
	 * ---------------------------
	 */
	static final double[][] battleTable = {{1,.5,2},{2,1,.5},{.5,2,1}};
	
	
	public Pokemon(String n) {
		super(n, mHP);
		// TODO Auto-generated constructor stub
	}

	
}
