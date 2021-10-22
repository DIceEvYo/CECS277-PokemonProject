/**
 * @project Pokemon CECS 277
 * @author dpaul
 * @class Main
 * @disclaimer Do not own any of the characters
 * @reference CECS 277 – Project 1 Guidelines PDF
 * @reference Math.Random() Code: https://www.geeksforgeeks.org/java-math-random-method-examples/
 * @reference Pokemon Anime
 * @reference https://touhou.fandom.com/wiki/Highly_Responsive_to_Quotes
 * @reference Touhou LostWord
 */
import java.awt.Point;

public class main {
	
	public static Map m = new Map();
	public static Point pos;
	public static boolean journeyRunning = true;
	
	/**
	 * Main Method, Main code of the game
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("You are dreaming...");
		System.out.println("As you dream, a man in a lab coat approaches you...");
		System.out.println("He greets you and then asks...");
		System.out.println("Prof Oak: What is your name?");
		CheckInput in = new CheckInput();
		String name = in.getString();
		String nameC = name.toUpperCase();
		System.out.println("Prof Oak: Great to meet you " + name);
		System.out.println("Prof Oak: Please! Choose your first pokemon-");
		/* [PLOT]
		 * Scene 1: Waking Up
		 * What time will the trainer wake up!?
		 */
		int iC = 0;
		CheckInput chk = new CheckInput();
		System.out.println("Your alarm goes off.");
		System.out.println("It's 6 am. Would you like to wake up?\n1. Yeah, let's go!!\n2. M-maybe a little later..");
		iC = chk.getIntRange(1, 2);
		int wUT = 0; //wakeUpTime
		if(iC == 2) {
			wUT++; //wut = 1
			System.out.println("You toss your blanket over yourself and go back to sleep...");
			System.out.println("It's now 10 am. Would you like to wake up?\n1. Yeah!\n2. Ehhh...");
			iC = chk.getIntRange(1, 2);
			if(iC == 2) {
				wUT++; //wut = 2
				System.out.println("Once again, you toss your blanket over yourself and go back to sleep...");
				System.out.println("It's now 3 pm. Would you like to wake up?\n1. Okay, I guess..\n2. mehhhh...");
				iC = chk.getIntRange(1, 2);
				if(iC == 2) {
					wUT++; //wut = 3
					System.out.println("Annoyed from being asked the same question three times, you decide to sleep outside in hopes that this code won't ask you if you would like to wake up again...");
					System.out.println("Your mother walks up to you...");
					System.out.println("MOM: Do you want to get a Pokemon or not!? It's 12 AM for goodnesssake! Stop being lazy and go to professor OAK!!");
					System.out.println(nameC + ": ...");
					System.out.println(nameC + ": Fine...");
				}
			}
		}
		
		/* [PLOT]
		 * Scene 2: Heading to Professor Oak's Lab~!
		 * Disclaimer: Some of the following lines (specifically Gary's) were derived from the first episode of Pokemon, hence I do not own any of them.
		 */
		if(wUT == 0) {
			System.out.println("Excited, you hurry to Professor Oak's Laboratory!\nYou can already feel it, that today's going to be a start, of a magnificient journey!");	
			System.out.println("As you make your way over to the lab, it is peacefully quiet.. For a brief moment, you admire the view of the environment that surrounds you..\n You then enter the laboratory.");
		} else if (wUT == 1) {
			System.out.println("Energized, you hurry to Professor Oak's Laboratory!\nYou can already feel it, that today's going to be a start, of a magnificient journey!");
			
		}else if (wUT == 2) {
			System.out.println("Still a bit drowsy, you walk your way to Professor Oak's Laboratory..\nI mean what's the rush anyway? It's just a Pokemon!");
		}else if (wUT == 3) {
			System.out.println("Because MOOOOM said so, now you have to WALK all the way to some OLD geezer's Laboratory...\n" + nameC +": Ugh... What a pain...");
		}
		
		if((wUT == 2) || (wUT == 1)) {
			System.out.println("As you make your way over to the lab, you hear from cheering in the distance...");
			System.out.println("CHEERLEADERS: GARY GARY! HE'S OUR MAN! IF HE CAN'T DO IT, NO ONE CAN!!");
			System.out.println("CHEERLEADERS: GARY GARY-");
			System.out.println("You push through the crowd and the cheerleaders and-");
			System.out.println("B-UMP!!");
			System.out.println("GARY: Hey, watch where you're going!");
			System.out.println("GARY: Well, you must be " + name + "! Better late than never, I guess!");
			System.out.println("Gary smirks");
			System.out.println("GARY: At least you get the chance to meet me~!");
			System.out.println(nameC + ": G-Gary..?");
			System.out.println("GARY: Mr.Gary to you! Show some respect!");
			System.out.println("GARY: Well " + ", you snooze you lose I guess! You were way behind right from the start!");
			System.out.println("GARY: I've got a Pokemon and YOUUUU Don't!");
			System.out.println("Determined to prove Gary wrong, you head into the lab!");
		} else if(wUT == 3) {
			System.out.println("As you make your way over to the lab, you hear an annoyingly AWFUL noise in the distance...");
			System.out.println("CHEERLEADERS: GARY GARY! HE'S OUR MAN! IF HE CAN'T DO IT, NO ONE CAN!!");
			System.out.println("CHEERLEADERS: GARY GARY-");
			System.out.println(nameC + ": Shut up.");
			System.out.println("You push through the crowd and the cheerleaders with such a force that they started falling like dominos and-");
			System.out.println("B-UMP!!");
			System.out.println(nameC + ": Y-you...!");
			System.out.println("GARY: Hey, watch where you're going!");
			System.out.println("GARY: Well, you must be " + name + "! Better late than never, I guess!");
			System.out.println(nameC + ": Shut up. I'm just here to go home. Now move it or lose it!");
			System.out.println("Gary smirks");
			System.out.println("GARY: At least you get the chance to meet me~!");
			System.out.println(nameC + ": Hmph. And what makes you think I want to see you?  Get out of my way..!");
			System.out.println("You savagely push Gary to the ground and march into the laboratory, even more enraged than before...");
		}
		
		/* [PLOT]
		 * Scene 3: Meeting the Professor!
		 */
		System.out.println("PROF OAK: Why hello there! You must be " + name + "! It's a pleasure to meet you!");
		if(wUT == 0) {
			System.out.print("Seems that you've arrived early! Guess someone's excited to receive their new Pokemon~!");
		}
		if(wUT > 1) {
			System.out.print("Although it seems that you've arrived a little late...\n");
			if(wUT == 3) {
				System.out.println("PROF OAK: A little too late one might add..");
				System.out.println(nameC + ": Tch.. Whatever..");
			}
		}
		System.out.println("PROF OAK: Anyhoo~! Please select a Pokemon!");
		/* [PLOT]
		 * Scene 4: Choosing a Pokemon!
		 */
		Trainer t = null;
		Pokemon p = null;
		int mapNum = 1;
		m.loadMap(mapNum);
		if(wUT == 0) {
			System.out.println("1: Charmander");
			System.out.println("2: Bulbasaur");
			System.out.println("3. Squirtle");
			int choice = in.getIntRange(1, 3);
			switch(choice) {
			case 1:
				System.out.println(nameC + ": Charmander! I choose you buddy!");
				p = new Charmander();
				t = new Trainer(name, p, m);
				break;
			case 2:
				System.out.println(nameC + ": Bulbasaur! I choose you buddy!");
				p = new Bulbasaur();
				t = new Trainer(name, p, m);
				break;
			case 3:
				System.out.println(nameC + ": Squirtle! I choose you buddy!");
				p = new Squirtle();
				t = new Trainer(name, p, m);
				break;
			}
		} else if(wUT == 1) {
			System.out.println("1: Charmander");
			System.out.println("2: Bulbasaur");
			System.out.println("PROF OAK: There was a Squirtle, but it seems that a trainer has already selected this Pokemon!");
			int choice = in.getIntRange(1, 2);
			switch(choice) {
			case 1:
				System.out.println(nameC + ": Charmander! I choose you!");
				p = new Charmander();
				t = new Trainer(name, p, m);
				break;
			case 2:
				System.out.println(nameC + ": Bulbasaur! I choose you!");
				p = new Bulbasaur();
				t = new Trainer(name, p, m);
				break;
			}
		} else if(wUT == 2) {
			System.out.println("1: Charmander");
			System.out.println("PROF OAK: There was a Bulbasaur, but it seems that a trainer has already selected this Pokemon!");
			System.out.println("PROF OAK: There was a Squirtle, but it seems that a trainer has already selected this Pokemon!");
			System.out.println("PROF OAK: Charmander it is, I suppose!");
				p = new Charmander();
				t = new Trainer(name, p, m);
		} else {
			System.out.println("PROF OAK: There was a Charmander, but it seems that a trainer has already selected this Pokemon!");
			System.out.println("PROF OAK: There was a Bulbasaur, but it seems that a trainer has already selected this Pokemon!");
			System.out.println("PROF OAK: There was a Squirtle, but it seems that a trainer has already selected this Pokemon!");
			System.out.println(nameC + ": OKAY! OKAY! I GET IT! NOW WHAT CAN YOU OFFER ME YOU OLD BUFFOON!?");
			System.out.println("PROF OAK: Hmm.. I was saving this for a salad, but I suppose you can have it!");
			System.out.println("In the palm of your hands, Professor Oak places a pokemon that looks like a berry. It looks traumatized...");
			System.out.println(nameC + ": W - w u t . . ?");
			System.out.println("Questioning the life choices that have led you to this moment...\n You quickly accept the Oddish, feeling deep sorrow for its poor soul and rush out before the professor could say another word.");
			System.out.println(nameC + ": Alright you odd little pokemon! It's just you and me now! But I already know, that we're going to make a great team!");
			System.out.println("You also secretly vowed to yourself that you would never sleep in this late again...");
			p = new Oddish();
			t = new Trainer(name, p, m);
		}
		System.out.println("Would you like to name your new Pokemon?");
		if(chk.getYesNo()) {
			System.out.println("Please enter what you would like to name your Pokemon: ");
			t.getPokemon(0).name = chk.getString();
		}
		System.out.println("You start on your journey: ");
		
		/* [PLOT]
		 * Scene 5: Game Begins Here:
		 */
		t.toString();
		pos = t.getLocation();
		int choice = 0;
		char event = 0;
		while(journeyRunning) {
			m.reveal(pos);
			//System.out.println(pos + "||||");
			System.out.println(t.toString());
			System.out.println(m.mapToString(pos));
			choice = mainMenu();
			//Player goes somewhere...
			if(choice==1) {	
				event = t.goNorth();
			}
			if(choice==2) {	
				event = t.goSouth();
			}if(choice==3) {	
				event = t.goEast();
			}if(choice==4) {	
				event = t.goWest();
			}
			if(choice==5) {	
				journeyRunning = false;
				break;	
			}
			
			//Update position
			pos = t.getLocation();
			m.reveal(pos);
			//Character spaces on the map
			
			//z is for Dragon Ball- Oh..nevermind its for sensing if a move's invalid.. Aww man...
			if((Character.compare(event, 'z')) == 0) {
				System.out.println("You cannot go that way.");
			}
			
			//f is for FINIIIIIISH!! And a map update too! If the player's already on the third map, the map resets to 1, creating a map loop
			if((Character.compare(event, 'f')) == 0) {
				if(mapNum == 3) {
					mapNum = 1;
				} else {
					mapNum++;
				}
				m.loadMap(mapNum);
			}
			
			//n is for ... Nothing.. Well..uhm...
			if((Character.compare(event, 'n')) == 0) {
				System.out.println("There's nothing here.");
			}
			
			//i is for item! Oooh! What's the prize going to be!?
			if((Character.compare(event, 'i')) == 0) {
				int min = 1;
				int max = 3;
				int r = max - min + 1;
				int chance = (int)(Math.random() * r) + min;
				if(chance==1) {
					t.receivePotion();
					System.out.println("You found a Potion!");
				}else {
					t.receivePokeball();
					System.out.println("You found a Poke Ball!");	
				}
				
				m.removeCharAtLoc(pos);
			}
			
			/*
			 * w is for a WILD POKEMON! - Player engages in a battle sequence with randomly selected Pokemon. 
			 * If all Player's Pokemon are defeated, gameover.
			 * Player also has a chance to gain a new Pokemon.
			 */
			if((Character.compare(event, 'w')) == 0) {
				trainerAttack(t, chooseRandomPokemon());
			}
			
			//p is for Person
			if((Character.compare(event, 'p')) == 0) {
				int min = 1;
				int max = 5;
				int r = max - min + 1;
				int chance = (int)(Math.random() * r) + min;
				switch(chance) {
				case 1:
					//Do not own any of the following lines from Team Rocket
					if(wUT < 3) {
						System.out.println("JESSIE: Prepare for trouble~");
						System.out.println("JAMES: Prepare for double~");
						System.out.println("JESSIE: To protect the world from devastation~");
						System.out.println("JAMES: To unite all peoples within our nation~");
						System.out.println("JESSIE: To denounce the evils of truth and love~");
						System.out.println("JAMES: To extend our reach to the stars above~");
						System.out.println("JESSIE: Jessie~!");
						System.out.println("JAMES: James~!");
						System.out.println("JESSIE: Team Rocket Blast off at the speed of light~!");
						System.out.println("JAMES: Surrender now or prepare to fight~!");
						System.out.println("MEOWTH: Meowth that's right~!");
						if(t.getMoney() > 4) {
							t.takeDamage(5);
							t.spendMoney(4);							
						} else {
							System.out.println("Out of pity, Team Rocket decided to leave you alone.");
						}
					} else {
						System.out.println("JESSIE: Prepare for trouble~");
						System.out.println("JAMES: Prepare for double~");
						System.out.println(nameC + ": Good grief...Ugh...");
						System.out.println("JESSIE: To protect the world from devastation~");
						System.out.println("JAMES: To unite all peoples within our nation~");
						System.out.println("JESSIE: To denounce the evils of truth and love~");
						System.out.println("JAMES: To extend our reach to the stars above~");
						System.out.println("JESSIE: Jessie~!");
						System.out.println("JAMES: James~!");
						System.out.println("JESSIE: Team Rocket Blast off at the speed of light~!");
						System.out.println("JAMES: Surrender now or prepare to fight~!");
						System.out.println("MEOWTH: Meowth that's right~!");
						System.out.println(nameC + ": You know..I'm still enraged from the fact I have to keep wandering around here without a bed to sleep...");
						System.out.println(nameC + ": Maybe bullying some teenagers and their pet cat can help me take some of this stress of my mind...");
						System.out.println("TEAM ROCKET: E-eh..!?");
						System.out.println("You and " + t.getPokemon(0).getName() + " bullied Team Rocket.");
						System.out.println("You sto- I mean earned 20 pokebucks and 3 pokeballs!");
						t.receivePokeball();
						t.receivePokeball();
						t.receivePokeball();
						t.receiveMoney(20);
					}
					break;
				case 2:
					if(wUT < 3) {
						System.out.println("Oh, look who it is! It's mom! And she's here to give you some allowance! Isn't she kind?");
						t.receiveMoney(20);
					}else {
						System.out.println("Oh look who it is... The ol' granny who kicked you out of the house when you were tryin to earn some beauty sleep.");
						System.out.println("What's worse... She comes up to you, and slaps you!");
						t.takeDamage(3);
						System.out.println("MOM: You LEFT YOUR ROOM LIGHTS ON AND YOU MADE A BIG MESS! What do you have to say for yourself!?");
						System.out.println(nameC + ": UGH...SHUTUP!");
						t.takeDamage(3);
						System.out.println("You receive additional damage for talking back to Mom..");
						}
					break;
				case 3:
					System.out.println("You feel sudden cold breeze...");
					System.out.println("All of a sudden-");
					bakaAttack(t, new Cirno());
					break;
				case 4:
					if(wUT < 3) {
						System.out.println("Oh look! It's Professor Oak! And he's giving you 3 potions and 2 pokeballs! How kind of him!");
						t.receivePotion();
						t.receivePotion();
						t.receivePotion();
						t.receivePokeball();
						t.receivePokeball();
					} else {
						System.out.println("In the distance you recognize a familiar, yet scary looking figure...");
						System.out.println("Oh no... It's him... It's Professor Oak..");
						System.out.println("HIDE YOUR ODDISH AND RUUUUUUUUUUUUUUUUN!!!!");
						System.out.println("While running you happen to trip and take 5 damage.");
						t.takeDamage(5);
					}
				}
				m.removeCharAtLoc(pos);
			}
			
			//c is for City! - Player has the option to purchase goods or heal their Pokemon!
			if((Character.compare(event, 'c')) == 0) {
				System.out.println("You've entered the city.\nWhere would you like to go?\n1. Store\n2. Pokemon Hospital");
				int choice2 = in.getIntRange(1, 2);
				switch(choice2) {
				case 1:
					store(t);
					break;
				case 2:
					//Disclaimer: I do not own any of Brock's lines!
					System.out.println("BROCK: JOY!! OH A JOYYY! A ONE WOMAN'S MAN IS WHAT I WANNA BE~ THERE'S TWO PERFEC-");
					System.out.println("SMACK! BONK! CRASSSSSH!!");
					System.out.println("A girl with orange hair along with a boy with a red cap and a Pikachu drag this strange individual away...");
					System.out.println("NURSE JOY: ...");
					System.out.println("NURSE JOY: Ehm.. I'll heal your poor Pokemon up in a jiffy...");
					t.healAllPokemon();
					System.out.println("Dun~ Dun~ DuDUDUUUUN~!");
					System.out.println("You've healed all your Pokemon!");
					System.out.println("NURSE JOY: There you go! See you again soon!");
					break;
				}
			}
			if(t.getHp()<=0) {
				System.out.println("You fainted...");
				journeyRunning = false;
			}
			
		}
		System.out.println("Game Over");
		
	}
	
	/**
	 * Provides a direction selection menu for the user
	 * @return the choice by the player
	 */
	public static int mainMenu() {
		int c = 0;
		CheckInput chk2 = new CheckInput();
		System.out.println("Main Menu:\n1. Go North\n2. Go South\n3. Go East\n4. Go West\n5. Quit");
		c = chk2.getIntRange(1, 5);
		return c;
	}
	
	/**
	 * Randomly selects Pokemon
	 * @return randomly chosen Pokemon
	 */
	public static Pokemon chooseRandomPokemon() {
		Pokemon pokemon;
		int min = 0;
		int max = 6;
		int r = max - min + 1;
		int c = (int)(Math.random() * r) + min;
		switch(c) {
		case 0:
			pokemon = new Charmander();
			break;
		case 1:
			pokemon = new Ponyta();
			break;
		case 2:
			pokemon = new Squirtle();
			break;
		case 3:
			pokemon = new Staryu();
			break;
		case 4:
			pokemon = new Bulbasaur();
			break;
		case 5:
			pokemon = new Oddish();
			break;
		default:
			//Eh!? That's odd... This part of the code should have never ran...
			pokemon = new Oddish();
			break;
		}
		return pokemon;
	}
	
	/**
	 * TrainerAttack - Pokemon Fighting Sequence
	 * Trainer battles until pokemon is caught, trainer runs away, or all Pokemon of trainer are defeated
	 * @param t - trainer
	 * @param wild - randomly selected pokemon
	 */
	public static void trainerAttack(Trainer t, Pokemon wild) {
		Pokemon p = null;
		int c = 0;
		CheckInput chk = new CheckInput();
		System.out.println("A wild " + wild.getName() + " has appeared!");
		boolean selected = false;
		boolean fight = false;
		boolean gameRunning = true;
		while(gameRunning) {
			System.out.println(wild.toString());
			System.out.println("What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away");
			c = chk.getIntRange(1, 4);
			switch(c) {
			case 1: //Fight Selection
				fight = true;
				while(fight) {
					if(!selected) {
						//If Pokemon has not been selected yet...
						int pokeI = 0;
						System.out.println("Choose a Pokemon: \n" + t.getPokemonList());
						pokeI = chk.getIntRange(1, t.getNumPokemon());
						p = t.getPokemon(pokeI-1);
						if(p.getHp() <= 0) {
							System.out.println(p.getName() + "is unable to fight. Please select a different Pokemon.");
						}else {
							selected = true;
							System.out.println(p.getName() + ", I choose you!");	
						}
					}
					if(selected) {
						System.out.println(p.toString());
						//Basic Menu
						System.out.println(p.getBasicMenu() + "\n3. Select a different Pokemon");
						int c1 = chk.getIntRange(1, p.getNumBasicMenuItems()+1);
						int c2 = 0;
						switch(c1) {
						case 1: //Basic Attack
							System.out.println(p.getAttackMenu());
							c2 = chk.getIntRange(1, p.getNumAttackItems());
							System.out.println(p.basicAttack(wild, c2));
							fight = false;
							break;
						case 2: //Special Attack
							System.out.println(p.getSpecialMenu());
							c2 = chk.getIntRange(1, p.getNumSpecialMenuItems());
							System.out.println(p.specialAttack(wild, c2));
							fight = false;
							break;
						case 3: //Select a different Pokemon
							int pokeI = 0;
							System.out.println("Choose a Pokemon: \n" + t.getPokemonList());
							pokeI = chk.getIntRange(1, t.getNumPokemon());
							p = t.getPokemon(pokeI-1);
							selected = true;
							System.out.println(p.getName() + ", I choose you!");
						}
						int min = 1;
						int max = 7;
						int r = max - min + 1;
						int chance = (int)(Math.random() * r) + min;
						if(selected == false) {
							p = p = t.getPokemon(0);
						}
						switch(chance) {
						case 1:
							System.out.println(wild.basicAttack(p, 1));
							break;
						case 2:
							System.out.println(wild.basicAttack(p, 2));
							break;
						case 3:
							System.out.println(wild.basicAttack(p, 3));
							break;
						case 4:
							System.out.println(wild.specialAttack(p, 1));
							break;
						case 5:
							System.out.println(wild.specialAttack(p, 2));
							break;
						case 6:
							System.out.println(wild.specialAttack(p, 3));
							break;
						}
						if(p.getHp() <= 0) {
							System.out.println(p.getName()+ " has fainted.");
							selected = false;
							fight = false;
						}
					}
					
				}
				break;
			case 2: //Use a Potion
				if(t.hasPotion()) {
					int pokeI = 0;
					System.out.println("Choose a Pokemon to Heal: \n" + t.getPokemonList());
					pokeI = chk.getIntRange(1, t.getNumPokemon());
					t.usePotion(pokeI-1);
				}else {
					System.out.println("You don't have any Potions.");
				}
				break;
			case 3: //Use a Pokeball
				if(t.hasPokeball()) {
					System.out.println("Shake...Shake...Shake...");
					if(t.catchPokemon(wild)) {
						m.removeCharAtLoc(pos);
						gameRunning = false;
					} else {
						System.out.println("Oh! So close! " + wild.getName() + " has escaped!");
					}
				}else {
					System.out.println("You don't have any Poke Balls.");
				}
				break;
			case 4: //"Ruuuuuuun AWAAAYYYYYYYYY" - Joseph JoeStar
				int min1 = 0;
				int max1 = 4;
				int r1 = max1 - min1 + 1;
				int c1 = (int)(Math.random() * r1) + min1;
				switch(c1) {
				case 0:
					t.goEast();
					break;
				case 1:
					t.goWest();
					break;
				case 2:
					t.goNorth();
					break;
				case 3:
					t.goSouth();
					break;
				}
				gameRunning = false;
				break;
			}
			if(wild.getHp() <= 0) {
				System.out.println(wild.getName() + " has fainted!");
				m.removeCharAtLoc(pos);
				gameRunning = false;
			}
			//trainers pokemon run out of health
			int f = 0; //f for fainted
			for(int i = 0; i < t.getNumPokemon(); i++) {
				if(t.getPokemon(i).getHp() <= 0) {
					f++;
				}
			}
			if(f == t.getNumPokemon()) {
				journeyRunning = false;
			}
		}
		
	}
	
	/**
	 * Store, sells items to trainer
	 * @param t - trainer
	 */
	public static void store(Trainer t) {
		int c = 0;
		CheckInput chk = new CheckInput();
		boolean occupyStore = true;
		while(occupyStore) {
			System.out.println("CLERK: Why, hello there! What may I help you with on this fine day~?\n1. Buy Potions - $5\n2. Buy Pokeballs - $3\n3. Exit");
			c = chk.getIntRange(1, 3);
			switch(c) {
			case 1:
				if(t.spendMoney(5)) {
					System.out.println("CLERK: Here's your potion! Pleasure doing business with you~!\nYou have received a Potion!");
					t.receivePotion();	
				}else {
					System.out.println("CLERK: Ehm...Appologies my good customer, but it seems that you may not have the sufficient funds to purchase this good.\nCLERK: Please consider purchasing something else!");
				}
				break;
			case 2:
				if(t.spendMoney(3)) {
					System.out.println("CLERK: Here's your Poke ball! Pleasure doing business with you~!\nYou have received a Poke Ball!");
					t.receivePokeball();	
				}else {
					System.out.println("CLERK: Ehm...Appologies my good customer, but it seems that you may not have the sufficient funds to purchase this good.\nCLERK: Please consider purchasing something else!");
				}
				break;
			case 3:
				occupyStore = false;
				break;
			}			
		}
	}
	
	/**
	 * BakaAttack (baka baaaaaaakaa~!!)- Danmaku Fighting Sequence
	 * Trainer battles Cirno until caught (but, HOW!?), trainer runs away, or all Pokemon of trainer are defeated
	 * @param t - trainer
	 * @param baka - baka danmaku fairy
	 */
	public static void bakaAttack(Trainer t, Pokemon baka) {
		Pokemon p = null;
		int c = 0;
		CheckInput chk = new CheckInput();
		System.out.println("CIRNO: I'm going to FREEZE you!");
		System.out.println("An idiot ice fairy has appeared.");
		System.out.println("CIRNO: I'm not an IDIOT!!");
		boolean selected = false;
		boolean fight = false;
		boolean gameRunning = true;
		while(gameRunning) {
			System.out.println(baka.toString());
			System.out.println("What do you want to do?\n1. Fight\n2. Use Potion\n3. Throw Poke Ball\n4. Run Away");
			c = chk.getIntRange(1, 4);
			switch(c) {
			case 1: //Fight Selection
				fight = true;
				while(fight) {
					if(!selected) {
						//If Pokemon has not been selected yet...
						int pokeI = 0;
						System.out.println("Choose a Pokemon: \n" + t.getPokemonList());
						pokeI = chk.getIntRange(1, t.getNumPokemon());
						p = t.getPokemon(pokeI-1);
						if(p.getHp() <= 0) {
							System.out.println(p.getName() + "is unable to fight. Please select a different Pokemon.");
						}else {
							selected = true;
							System.out.println(p.getName() + ", I choose you!");	
						}
					}
					if(selected) {
						System.out.println(p.toString());
						//Basic Menu
						System.out.println(p.getBasicMenu() + "\n3. Select a different Pokemon");
						int c1 = chk.getIntRange(1, p.getNumBasicMenuItems()+1);
						int c2 = 0;
						switch(c1) {
						case 1: //Basic Attack
							System.out.println(p.getAttackMenu());
							c2 = chk.getIntRange(1, p.getNumAttackItems());
							System.out.println(p.basicAttack(baka, c2));
							fight = false;
							break;
						case 2: //Special Attack
							System.out.println(p.getSpecialMenu());
							c2 = chk.getIntRange(1, p.getNumSpecialMenuItems());
							System.out.println(p.specialAttack(baka, c2));
							fight = false;
							break;
						case 3: //Select a different Pokemon
							int pokeI = 0;
							System.out.println("Choose a Pokemon: \n" + t.getPokemonList());
							pokeI = chk.getIntRange(1, t.getNumPokemon());
							p = t.getPokemon(pokeI-1);
							selected = true;
							System.out.println(p.getName() + ", I choose you!");
						}
						int min = 1;
						int max = 4;
						int r = max - min + 1;
						if(selected == false) {
							p = p = t.getPokemon(0);
						}
						System.out.println("CIRNO: Now let the STRONGEST fairy show you how its REALLY DONE!!");
						switch((int)(Math.random() * r) + min) {
						case 1:
							System.out.println("CIRNO: I'M THE STRONGEST!!");
							System.out.println(baka.specialAttack(p, 1));
							break;
						case 2:
							System.out.println("CIRNO: YOUR DESTINATION IS IN ICE!!");
							System.out.println(baka.specialAttack(p, 2));
							break;
						case 3:
							System.out.println("CIRNO: EVERYTHING! EVERYTHING!! I'M GOING TO FREEEEZE EVERYTHING!!");
							System.out.println(baka.specialAttack(p, 3));
							break;
						}
						if(p.getHp() <= 0) {
							System.out.println(p.getName()+ " has fainted.");
							selected = false;
							fight = false;
						}
					}
					
				}
				break;
			case 2: //Use a Potion
				if(t.hasPotion()) {
					int pokeI = 0;
					System.out.println("Choose a Pokemon to Heal: \n" + t.getPokemonList());
					pokeI = chk.getIntRange(1, t.getNumPokemon());
					t.usePotion(pokeI-1);
				}else {
					System.out.println("You don't have any Potions.");
				}
				break;
			case 3: //Use a Pokeball
				if(t.hasPokeball()) {
					System.out.println("Shake...Shake...Shake...");
					if(t.catchPokemon(baka)) {
						m.removeCharAtLoc(pos);
						gameRunning = false;
					} else {
						System.out.println("Oh! So close! " + baka.getName() + " has escaped!");
					}
				}else {
					System.out.println("You don't have any Poke Balls.");
				}
				break;
			case 4: //"Ruuuuuuun AWAAAYYYYYYYYY" - Joseph JoeStar
				int min1 = 0;
				int max1 = 4;
				int r1 = max1 - min1 + 1;
				int c1 = (int)(Math.random() * r1) + min1;
				switch(c1) {
				case 0:
					t.goEast();
					break;
				case 1:
					t.goWest();
					break;
				case 2:
					t.goNorth();
					break;
				case 3:
					t.goSouth();
					break;
				}
				gameRunning = false;
				break;
			}
			if(baka.getHp() <= 0) {
				System.out.println(baka.getName() + " has fainted!");
				m.removeCharAtLoc(pos);
				gameRunning = false;
			}
			//trainers pokemon run out of health
			int f = 0; //f for fainted
			for(int i = 0; i < t.getNumPokemon(); i++) {
				if(t.getPokemon(i).getHp() <= 0) {
					f++;
				}
			}
			if(f == t.getNumPokemon()) {
				journeyRunning = false;
			}
		}
		
	}
	
}
