import java.awt.Point;
import java.util.ArrayList;

public class Trainer {

	private int money;
	private int potions;
	private int pokeballs;
	private Point loc;
	private Map map;
	private ArrayList<Pokemon> pokemon;
	
	public Trainer(String n, Pokemon p, Map m) {
		this.map = m;
		this.pokemon.add(p);
	}
	
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
	
	public void receivePotion() {
		
	}
	
	public void usePotion(int pokeIndex) {
		
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
	
	public void receivePokeball() {
		this.pokeballs += 1;
	}
	
	public boolean catchPokemon(Pokemon p) {
		
	}
	
	public Point getLocation() {
		
	}
	
	public char goNorth() {
		
	}
	
	public goSouth() {
		
	}
	
	public goEast() {
		
	}
	
	public goWest() {
		
	}
	
	public int getNumPokemon() {
		
	}
	
	public void healAllPokemon() {
		
	}
	
	public Pokemon getPokemon(int index) {
		
	}
	
	public String getPokemonList() {
		
	}
	
	public String toString() {
		
	}
	
}
