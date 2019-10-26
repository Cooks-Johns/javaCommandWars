import tools.ConsoleColors;
import rpg_test.Stats;

// ---------------->          Polymorphism Examples       <--------------


public class Polymorphism {

	
// This is going to be the Toon class


	// public abstract class Shape {
	// 	protected int x, y;
	// 	public abstract double computeArea();
	// }



// PlayerStats
	public abstract class Toons {
		
		public int health, // 1 - 500
					melee, // 1 - 50
					speed, // 1 - 75
					mana,  // 25 - 400
					power, // 1 - 250 
					luck,  // 1 - 20
					lvl;   // 1 - 100
		public abstract String characterMenu();

		public abstract int weaponAttack(),
							armor(),
							characterBuff();

	}


// WeaponStats
public abstract class Weapons {

	public int 
}



// ----------------------------------------------------------------
// This is where you will introduce the 
	// different subclass's


	// public class Rectangle extends Shape {
	// 	double width, height;
	// 	public double computeArea() {
	// 		return width * height;
	// 	}
	// }

// Nomad
public class Nomad extends Toon {
	int health = 10;
	int melee = 2;
	int speed = 6;
	int luck = 11; 
	int power = 6;
	int mana = 14;
	// int level = ;
	public String characterMenu() {
		return ConsoleColors.WHITE_BOLD + "'n'--> for Nomad __________________________________" + "\n" +
                        "                          		They have walked the path alone so    |" + "\n" +
                        "              			   		make sure thier on your team          |" + "\n" +
                        "						<---------------------------------------------> " +
                        ConsoleColors.RESET);
		}
	}


// Alchemist
	public class Alchemist extends Toon {
	int health = 6;
	int melee = 2;
	int speed = 6;
	int luck = 18;
	int power = 7;
	int mana = 18;
	// int level = ;
	public String characterMenu() {
		return ConsoleColors.CYAN_BOLD_BRIGHT + "'a' for Alchemist______________________________" + "\n" +
                        "									The elixer is the the real gold,    |" + "\n" +
                        "									but gold is gold.                   |" + "\n" + 
                        "						<-----------------------------------------------> " +
                       ConsoleColors.RESET);
		}
	}


// Berserker
	public class Berserker extends Toon {
	int health = 15;
	int melee = 11;
	int speed = 4;
	int luck = 9;
	int power = 12;
	int mana = 10;
	// int level = ;
	public String characterMenu() {
		return ConsoleColors.RED_BOLD + "'b' for Berserker______________________________________" + "\n" +
                        "							So this might be a good time to run....     |" + "\n" +
                        "							but if I it's already to late.              |" + "\n" + 
                        "						<-----------------------------------------------> " +
                        ConsoleColors.RESET);

	}
}



















	
}