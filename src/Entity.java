
abstract class Entity {
	
	private String name;
	private int hp;
	private int maxHP;
	
	/**
	 * Generates a new Entity
	 * @param n - Takes in a string input regarding name
	 * @param mHP - Takes in an integer input regarding max HP
	 */
	public Entity(String n, int mHP) {
		this.name = n;
		this.maxHP = mHP;
		this.hp = mHP;
	}
	
	/**
	 * Obtains data of the provided entity regarding hp
	 * @return hp - Health Point Value of Entity
	 */
	public int getHp(){
		return this.hp;
	}
	
	/**
	 * Obtains data of the provided entity regarding maxHP
	 * @return maxHP - Max Health Point Value of Entity
	 */
	public int getMaxHp(){
		return this.maxHP;
	}
	
	/**
	 * Subtracts Health Points
	 * @param d - Damage, value to be subtracted from provided Entity's hp
	 */
	public void takeDamage(int d){
		this.hp -= d;
	}
	
	/**
	 * Default Heal
	 * Restores given Entity's hp to maxHp.
	 */
	public void heal(){
		this.hp = this.maxHP;
	}
	
	/**
	 * Specified Heal
	 * @param h - Heal, value to be added to provided Entity's hp
	 */
	public void heal(int h){
		if(h>this.maxHP) {
			this.hp = this.maxHP;
		} else {
			this.hp += h;	
		}
	}
	
	/**
	 * Obtains data of the provided entity regarding name
	 * @return name - Name Value of Entity
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * ...
	 * @return s - String Value
	 */
	public String toString() {
		//TODO
		String s = "Name: " + this.name + "\nCurrent Hp: " + this.hp + "\nMax Hp: " + this.maxHP;
		return s;
	}
}
