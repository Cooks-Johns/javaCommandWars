import java.util.Random;
import java.util.Scanner;

public class Menu {




    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static ConsoleColors blue = new ConsoleColors();
    static ConsoleColors red = new ConsoleColors();
    static ConsoleColors yellow = new ConsoleColors();
    static ConsoleColors green = new ConsoleColors();
    static ConsoleColors white = new ConsoleColors();
    static PlayerList nomad = new PlayerList();
    static PlayerList alchmist = new PlayerList();
    static PlayerList berserker = new PlayerList();
    static players playerName = new players();
    static players pathOfTheNomad = nomad();

    private static players nomad() {
    }


    public static void main(String[] args) {

        String charclass;
        int num = 2;
        while (num > 1) {
            System.out.println("              <--------------->" + "\n" +
                    "            > Enter your Name, and press" +
                    "               to start your quest < " + " \n" +
                    "              <----------------> ");
            playerName = scan.nextLine();
            System.out.println("Hello," + playerName + " Choose your class: ");
            System.out.println(ConsoleColors.WHITE_BOLD + "'n'--> for Nomad" + "\n" +
                    "So " + "\n" + "<------------------------> " +
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
                pathOfTheNomad();
            }
            if (charclass.charAt(0) == 'a') {
                pathOfTheAlchemist();
            }
            if (charclass.charAt(0) == 'b') {
                pathOfTheBerserker();
            }
            printStats();



        }

    private static void pathOfTheNomad() {
    }