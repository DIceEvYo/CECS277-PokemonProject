/**
 * 
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference BulbaGarden, Catch Rate Formula: https://bulbapedia.bulbagarden.net/wiki/Catch_rate
 */

import java.awt.Point;
import java.util.ArrayList;

public class Trainer {

	private String name;
	private int money;
	private int potions;
	private int pokeballs;
	private Point loc;
	private Map map;
	private ArrayList<Pokemon> pokemon;
	
	/**
	 * Initializes Trainer
	 * @param n - Name
	 * @param p - Starter Pokemon
	 * @param m - Map
	 */
	public Trainer(String n, Pokemon p, Map m) {
		this.map = m;
		this.pokemon.add(p);
		this.name = n;
	}
	
	/**
	 * Retrieves data on money held by trainer
	 * @return money - money held by trainer
	 */
	public int getMoney() {
		return this.money;
	}
	
	/**
	 * If the trainer can afford the good, pass true, if not, false
	 * @param amt - Possible amount to be spent
	 * @return True or False
	 */
	public boolean spendMoney(int amt) {
		if((this.money-amt) >= 0) {
			this.money = this.money-amt;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Money increments by amt, therefore the player 'receives' money
	 * @param amt - the amount of money the player receives
	 */
	public void receiveMoney(int amt) {
		this.money += amt;
	}
	
	/**
	 * Checks if trainer has 1 or more potions
	 * @return True or False
	 */
	public boolean hasPotion() {
		if (this.potions > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Increments trainer's number of potions, therefore the player 'receives' a potion
	 */
	public void receivePotion() {
		this.potions += 1;
	}
	
	/**
	 * Fully heals specified pokemon
	 * @param pokeIndex - Specifies which Pokemon the potion is used on
	 */
	public void usePotion(int pokeIndex) {
		this.getPokemon(pokeIndex).heal();
	}

	/**
	 * More specified version of usePotion. Specifies how much HP the Pokemon recovers
	 * @param pokeIndex - Specifies which Pokemon the potion is used on
	 * @param specHeal - Specifies how much HP the Pokemon recovers
	 */
	public void usePotion(int pokeIndex, int specHeal) {
		this.getPokemon(pokeIndex).heal(specHeal);
	}

	/**
	 * Checks if trainer has 1 or more pokeballs
	 * @return True or False
	 */
	public boolean hasPokeball() {
		if (this.pokeballs > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Pokeball amount increments by 1, therefore the trainer 'receives' an additional pokeball
	 */
	public void receivePokeball() {
		this.pokeballs += 1;
	}
	
	/**
	 * Uses pokeballs and determines if Pokemon is caught or not.
	 * 		Using the formula theorized by BulbaGarden of BulbaPedia,
	 * 		if calculated value f, based on the health of the pokemon,
	 * 		is greater than or equal to random selected value M, that
	 * 		ranges from 0 to 255, the pokemon is caught, else the Pokemon
	 * 		is not caught, and the player needs to try again. Please check
	 * 		references for more formula information (top of the code).
	 * @param p - Provided pokemon
	 * @return True or False value - Indicator if pokemon has been caught (or not)
	 */
	public boolean catchPokemon(Pokemon p) {
		if(this.hasPokeball()) {
			this.pokeballs = this.pokeballs -1;
		}
		int minC = 0;
		int maxC = 255;
		int rC = maxC - minC + 1;
		int M = (int)(Math.random() * rC) + minC;
		int f = (int)((p.getMaxHp()*255*4)/(p.getHp()*8));
		if(f>= M) {
			return true;
		}
		return false;
	}
	
	/**
	 * Retrieves location data
	 * @return loc - location of trainer on the map
	 */
	public Point getLocation() {
		return this.loc;
	}
	
	/**
	 * Player moves North
	 * Player moves up by 1, y direction. 
	 * @return character of the map at player's new location if valid move. 
	 * 		   Else, 'z' is returned prompting player to choose a different choice.
	 */
	public char goNorth() {
		if((((this.loc.y)+1) >= 0) && ((this.loc.y)+1) < this.map.map.length) {
			this.loc.setLocation(this.loc.x, this.loc.y+1);
		} else {
			//Indicator of invalid move
			return 'z';
		}
		return this.map.getCharAtLoc(this.loc);
	}
	
	/**
	 * Player moves South
	 * Player moves down by 1, y direction. 
	 * @return character of the map at player's new location if valid move. 
	 * 		   Else, 'z' is returned prompting player to choose a different choice.
	 */
	public char goSouth() {
		if((((this.loc.y)-1) >= 0) && ((this.loc.y)-1) < this.map.map.length) {
			this.loc.setLocation(this.loc.x, this.loc.y-1);
		} else {
			//Indicator of invalid move
			return 'z';
		}
		return this.map.getCharAtLoc(this.loc);
	}
	
	/**
	 * Player moves East
	 * Player moves right by 1, x direction. 
	 * @return character of the map at player's new location if valid move. 
	 * 		   Else, 'z' is returned prompting player to choose a different choice.
	 */
	public char goEast() {
		if((((this.loc.x)+1) >= 0) && ((this.loc.x)+1) < this.map.map.length) {
			this.loc.setLocation(this.loc.x+1, this.loc.y);
		} else {
			//Indicator of invalid move
			return 'z';
		}
		return this.map.getCharAtLoc(this.loc);
	}
	
	/**
	 * Player moves West
	 * Player moves left by 1, x direction. 
	 * @return character of the map at player's new location if valid move. 
	 * 		   Else, 'z' is returned prompting player to choose a different choice.
	 */
	public char goWest() {
		if((((this.loc.x)-1) >= 0) && ((this.loc.x)-1) < this.map.map.length) {
			this.loc.setLocation(this.loc.x-1, this.loc.y);
		} else {
			//Indicator of invalid move
			return 'z';
		}
		return this.map.getCharAtLoc(this.loc);
	}
	
	/**
	 * Retrieves data on how many Pokemon the trainer has
	 * @return pokemon.size() - The amount of Pokemon
	 */
	public int getNumPokemon() {
		return this.pokemon.size();
	}
	
	/**
	 * Heals All Pokemon:
	 * Goes through the list of Pokemon and utilizes the max heal command from entity.
	 */
	public void healAllPokemon() {
		for (int i = 0; i < this.pokemon.size(); i++) {
			this.pokemon.get(i).heal();
		}
	}
	
	/**
	 * Gets Pokemon of provided index
	 * @param index
	 * @return Pokemon of provided index. (If Invalid user should be prompted to adjust their choice)
	 */
	public Pokemon getPokemon(int index) {
		if(!((0<=index) && (index<this.pokemon.size()))) {
			CheckInput chk = new CheckInput();
			chk.getIntRange(0, this.pokemon.size()-1);	
		}
		if((0<=index) && (index<this.pokemon.size())) {
			return this.pokemon.get(index);
		}else {
			return null;
		}
	}
	
	/**
	 * Returns a string describing all pokemon the trainer holds
	 * @return pokeList - A string containing descriptions of all pokemon held by trainer
	 */
	public String getPokemonList() {
		String pokeList = "";
		for (int i = 0; i < this.pokemon.size(); i++) {
			pokeList = pokeList + "Pokemon " + i + ": " + this.pokemon.get(i).toString();
		}
		return pokeList;
	}
	
	/**
	 * Generates a String providing information about the provided trainer
	 * @return s - String Value
	 */
	public String toString() {
		String s = "Name: " + this.name + "\nMoney: " + this.money + "\nPotions: " + this.potions + "\nPokeballs: " + this.pokeballs;
		return s;
	}
	
}
