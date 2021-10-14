import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
	private char[][] map = new char[5][5];
	private boolean [][] revealed = new boolean[5][5];
	
	public Map() {
		
	}
	
	public void loadMap(int mapNum) {
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
				}
				y += 1;
		}
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public char getCharAtLoc(Point p) {
		return 0;
		
	}
	
	public String mapToString(Point p) {
		String mapS = "";
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 5; x++) {
				if (this.revealed[x][y]) {
					mapS = mapS + this.map[x][y] + " ";
				} else {
					mapS = mapS + "X ";
				}
			}
			mapS = mapS + "\n";
		}
		return mapS;
		
	}
	
	public Point findStart() {
		return null;
		
	}
	
	public void reveal(Point p) {
		
	}
	
	public void removeCharAtLoc(Point p) {
		
	}
	
}
