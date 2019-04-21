import tools.ConsoleColors;
import rpg_test.Stats;

import java.util.Scanner;

import static rpg_test.Toons.charclass;
import static rpg_test.Toons.hp;
import static rpg_test.Toons.meleeDmg;
import static test.driver.mana;
import static test.driver.playerName;
import static test.driver.xp;

public class Players {


    static Scanner scan = new Scanner(System.in);



// ---------------      THE KEYS TO THIS BUS

    public static void printStats() {
        if (charclass.equals("Alchemist")) {
            System.out.println(playerName + "\nhp: " + hp +
                    "\nmana: " + mana + "\ndamage: " +
                    meleeDmg + "\nxp: " + xp + "\n");
        } else {
            System.out.println(playerName + "\nhp: " +
                    hp + "\ndamage: " + meleeDmg +
                    "\nxp: " + xp + "\n");
        }
    }


//--      PC  ADD A FEW MORE CLASSESS

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            String charclass;
            int num = 2;
            while (num > 1) {
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.BLACK +
                        "                  <---------------> " + "\n" +
                        "              Enter your Name, and press " + "\n" +
                        "                 return to start your quest   " + " \n" +
                        "              <--------------------------> " + ConsoleColors.RESET );


                playerName = scan.nextLine();


                System.out.println("Hello," + ConsoleColors.PURPLE + playerName + ConsoleColors.RESET +
                        " Choose your class: ");

                System.out.println(ConsoleColors.WHITE_BOLD + "------------------------> "  +
                        "                           'n' is for Nomad" + "\n" +
                        "                           I might not be fast but I'll keep it moving" + "\n" +
                        "                           <------------------------> " +
                        ConsoleColors.RESET);


                System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +
                        "------------------------> " +
                        "'a' for Alchemist" + "\n" +
                        "                           The elixer is the the real gold,\n" +
                        "                           but gold is gold." + "\n" +
                        ConsoleColors.RESET);


                System.out.println(ConsoleColors.RED_BOLD + "------------------------> " + "'b' for Berserker" + "\n" +
                        "                           So this might be a good time to run....\n " +
                        "                           but if I see you it's already to late." + "\n" +
                        "                           <------------------------> " +
                        ConsoleColors.RESET);


                charclass = scan.nextLine().toLowerCase();

                if (charclass.charAt(0) == 'n') {
                    Stats.pathOfTheNomad();
                }
                if (charclass.charAt(0) == 'a') {
                    Stats.pathOfTheAlchemist();
                }
                if (charclass.charAt(0) == 'b') {
                    Stats.pathOfTheBerserker();
                }/// give user a option to exit
                printStats();


            }




    }

}
