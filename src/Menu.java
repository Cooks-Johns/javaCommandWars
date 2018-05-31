import java.util.Random;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class Menu {


    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        String charclass;
        int num = 2;
        while (num > 1) {
            System.out.println(ConsoleColors.BLACK_BOLD + "                 <--------------->" + "\n" +
                    "        > Enter your Name, and press return <" + "\n" +
                    "              > to start your quest < " + " \n" +
                    "           <--------------------------->                                                     " + ConsoleColors.RESET);
            String playerName = scan.nextLine();
            System.out.println(ConsoleColors.PURPLE_UNDERLINED + "Welcome ," +
                    ConsoleColors.BLACK_BACKGROUND_BRIGHT + playerName +
                    ConsoleColors.PURPLE_UNDERLINED + " Choose your class: " + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BRIGHT + "'n'--> for Nkomad" + "\n" +
                    "So they are the people who are said to never die " + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "'a' for Alchemist" + "\n" +
                    "The elixer is the the real gold,\n" +
                    "but gold is gold." + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED_BOLD + "'b' for Berserker" + "\n" +
                    "So this might be a good time to run....\n " +
                    "but if I it's already to late." + "\n" + "<------------------------> " +
                    ConsoleColors.RESET);
            charclass = scan.nextLine().toLowerCase();

            if (charclass.charAt(0) == 'n') {
                players.pathOfTheNomad();
            }
            if (charclass.charAt(0) == 'a') {
                players.pathOfTheAlchemist();
            }
            if (charclass.charAt(0) == 'b') {
                players.pathOfTheBerserker();


            }
            players.printStats();


        }

    }
}