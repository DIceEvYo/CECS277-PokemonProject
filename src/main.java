

public class main {
	public static void main(String args[]) {
		intro();
	}
	public static void intro(){
		System.out.println("Prof Oak: Why hello there new trainer, welcome to the world of Pokemon");
		System.out.println("Prof Oak: What is your name?");
		CheckInput in = new CheckInput();
		String name = in.getString();
		System.out.println("Prof Oak: Great to meet you " + name);
		System.out.println("Prof Oak: Choose your first pokemon:");
		System.out.println("1: Charmander");
		System.out.println("2: Bulbasaur");
		System.out.println("3. Squirtle");
		int choice = in.getIntRange(1, 3);
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	
}
