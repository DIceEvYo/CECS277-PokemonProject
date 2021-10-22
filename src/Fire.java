/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @interface Fire
 * @reference CECS 277 – Project 1 Guidelines PDF
 */
public interface Fire{
	String specialMenu = "1. Ember\n2. Fire Blast\n3. Fire Punch";
	int numSpecialMenuItems = 3;
	
	/**
	 * To be Implemented By a Pokemon of Type: Fire
	 * 
	 * Initiates move Ember (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Ember
	 */
	public String ember(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Fire
	 * 
	 * Initiates move Fire Blast (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Blast
	 */
	public String fireBlast(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Fire
	 * 
	 * Initiates move Fire Punch (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Fire Punch
	 */
	public String firePunch(Pokemon p);

}
