package rpg_test;

import java.util.Scanner;

public class Actions {

private Scanner input = new Scanner(System.in);

public void display() {

// This is the main menu for the the user
	System.out.prinntln(" Player Actions");
	System.out.println(
		"Select an option: \n" +
		"  1) Run \n " +
		" 2) Jump \n" +
		" 3) Dodge \n" +
		" 4) Exit \n" +
		);
	int selection = input.nextInt();
	input.nextLine();
}

public static void main(String [] args) {
	Menu menu = new Menu();
	while (true)
		menu.display();
}


}
