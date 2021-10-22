/**
 * @project Touhou CECS 277
 * @author dpaul
 * @interface Ice_Fairy
 * @reference CECS 277 – Project 1 Guidelines PDF
 */
public interface Ice_Fairy{
	String specialMenu = "1. Icicle Fall\n2. Perfect Freeze\n3. Snowball Earth";
	int numSpecialMenuItems = 3;
	
	/**
	 * To be Implemented By a Danmaku Fairy of Type: Ice
	 * 
	 * Initiates move Icicle Fall (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Icicle Fall
	 */
	public String icicleFall(Pokemon p);
	
	/**
	 * To be Implemented By a Danmaku Fairy of Type: Ice
	 * 
	 * Initiates move Perfect Freeze (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Perfect Freeze
	 */
	public String perfectFreeze(Pokemon p);
	
	/**
	 * To be Implemented By a Danmaku Fairy of Type: Ice
	 * 
	 * Initiates move Snowball Earth (Damage Method + Return String)
	 * @param Defending Pokemon
	 * @return Dialogue for Snowball Earth
	 */
	public String snowBallEarth(Pokemon p);

}
