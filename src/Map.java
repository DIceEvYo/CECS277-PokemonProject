import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
	char[][] map = new char[5][5];
	private boolean [][] revealed = new boolean[5][5];
	
	/**
	 * Initializes Map
	 */
	public Map() {
		
	}
	
	/**
	 * First checks if provided input is valid, then attempts to load one of the map text files.
	 * 		Next, the method scans through the file, appending each letter to their appropriate spot
	 * 		on the char list, x to column, y to row. 
	 * @param mapNum - provided map input, for which map index to be selected
	 */
	public void loadMap(int mapNum) {
		if(!((1<=mapNum) && (mapNum<3))) {
			CheckInput chk = new CheckInput();
			chk.getIntRange(1, 3);	
		}
		File map;
		if (mapNum == 1) {
			map = new File("Area1.txt");	
		} else if (mapNum == 2) {
			map = new File("Area2.txt");			
		} else {
			map = new File("Area3.txt");			
		}
		try {
			Scanner inputMap = new Scanner(map);
			int y = 0;
			while(inputMap.hasNextLine()) {
				String temp = inputMap.nextLine();
				for (int x = 0; x < temp.length(); x++) {
					this.map[x][y] = temp.charAt(x);
					this.revealed[x][y] = false;
				}
				y += 1;
		}
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Retrieves char data at provided location, P
	 * @param p - provided location, x and y
	 * @return this.map[p.x][p.y] - character of provided location 
	 */
	public char getCharAtLoc(Point p) {
			return this.map[p.x][p.y];	
	}
	
	/**
	 * Creates a string of the map. If reveal value of location is true,
	 * 		the character will reveal, if reveal value of location is false, 
	 * 		the map will represent this location marker with an 'X'. If any of
	 * 		the x and y values both relate to the provided point p (most likely
	 * 		being the location of the trainer) a star '*' will represent this
	 * 		location.
	 * @param p
	 * @return
	 */
	public String mapToString(Point p) {
		String mapS = "";
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 5; x++) {
				if((p.x == x) && (p.y == y)) {
					mapS = mapS + "* ";
				}else if (this.revealed[x][y]) {
					mapS = mapS + this.map[x][y] + " ";
				} else {
					mapS = mapS + "X ";
				}
			}
			mapS = mapS + "\n";
		}
		return mapS;
	}
	
	/**
	 * Method searches for character 's' to find the starting location and then
	 * 		sets returnable point location pt to the x and y values of that of the 
	 * 		starting location's
	 * @return pt - point containing an x and y value that tells the location of starting
	 * 				point 's'.
	 */
	public Point findStart() {
		Point pt = null;
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 5; x++) {
				if (Character.toString(this.map[x][y]).equalsIgnoreCase("s")) {
					pt.setLocation(x, y);
				} 
			}	
		}
		return pt;
	}
	
	/**
	 * At provided point p (x, y), the character, when the print statement runs,
	 * 		can be revealed, as its reveal location value will be set to True.
	 * @param p - Provided point p
	 */
	public void reveal(Point p) {
		this.revealed[p.x][p.y] = true;
	}

	/**
	 * At provided point p (x, y), the character, when the print statement runs,
	 * 		will be printed as n, as this location won't have anything else for the
	 * 		player to do anymore...
	 * @param p - Provided point p
	 */
	public void removeCharAtLoc(Point p) {
		this.map[p.x][p.y] = 'n';
	}
	
}
