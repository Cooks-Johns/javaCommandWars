package rpg_test;

import tools.ConsoleColors;
import toonMain.Heros;
import toonMain.types.Berserker;

import java.util.Scanner;

import static rpg_test.Stats.pathOfTheAlchemist;
import static rpg_test.Stats.pathOfTheBerserker;
import static rpg_test.Toons.playerName;


public class StartMeUp {


    private static Scanner scan;
    Heros b = new Berserker();

    public static void main(String[] args) {
        String charclass;
        int num = 2;
        while (num > 1) {

            System.out.println();
            System.out.println("              <--------------->" + "\n" +
                    "            > Enter your Name, and press" +
                    "               to start your quest < " + " \n" +
                    "              <----------------> " );
            playerName = scan.nextLine();
            System.out.println("Hello," + playerName + " Choose your class: ");
            System.out.println(ConsoleColors.WHITE_BOLD  + "'n'--> for Nomad"+ "\n" +
                    "So " + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ "'a' for Alchemist" + "\n" +
                    "The elixer is the the real gold,\n" +
                    "but gold is gold." + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED_BOLD + "'b' for Berserker" + "\n" +
                    "So this might be a good time to run....\n " +
                    "but if I it's already to late." + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            charclass = scan.nextLine().toLowerCase();

            if (charclass.charAt(0) == 'n') {
//                Toons.pathOfTheNomad();
            }
            if (charclass.charAt(0) == 'a') {
                pathOfTheAlchemist();
            }
            if (charclass.charAt(0) == 'b') {
                pathOfTheBerserker();
            }
//            Players.printStats();


        }
    }
}
