
public interface Grass{
	String specialMenu = "1. Vine Whip\n2. Razor Leaf\n3. Solar Beam";
	int numSpecialMenuItems = 3;
	
	/**
	 * To be Implemented By a Pokemon of Type: Grass
	 * 
	 * Initiates move Vine Whip (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Vine Whip
	 */
	public String vineWhip(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Grass
	 * 
	 * Initiates move Razor Leaf (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Razor Leaf
	 */
	public String razorLeaf(Pokemon p);
	
	/**
	 * To be Implemented By a Pokemon of Type: Grass
	 * 
	 * Initiates move Solar Beam (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Solar Beam
	 */
	public String solarBeam(Pokemon p);

}
