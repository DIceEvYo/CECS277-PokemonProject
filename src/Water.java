/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @interface Water
 * @reference CECS 277 – Project 1 Guidelines PDF
 */
public interface Water{
	String specialMenu = "1. Water Gun\n2. Bubble Beam\n3. Waterfall";
	int numSpecialMenuItems = 3;
	
	/**
	 * To be Implemented By a Pokemon of Type: Water
	 * 
	 * Initiates move Water Gun (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Water Gun
	 */
	public String waterGun(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Water
	 * 
	 * Initiates move Bubble Beam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Bubble Beam
	 */
	public String bubbleBeam(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Water
	 * 
	 * Initiates move Water Fall (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Water Fall
	 */
	public String waterfall(Pokemon p);

}
