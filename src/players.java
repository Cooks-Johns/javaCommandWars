import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class players {


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


    public players(
            String playerName, String charclass,
            int hp, int maxHp,
            double armor, double maxArmor,
            int mana, int maxMana,
            int meleeDmg, int maxMeleeDmg,
            int speed, int maxSpeed,
            int luck, int maxLuck,
            int classAbility, int xp,
            int level, int maxLevel) {


        this.playerName = playerName;
        this.charclass = charclass;
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.maxArmor = maxArmor;
        this.mana = mana;
        this.maxMana = maxMana;
        this.meleeDmg = meleeDmg;
        this.maxMeleeDmg = maxMeleeDmg;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.luck = luck;
        this.maxLuck = maxLuck;
        this.classAbility = classAbility;
        this.level = level;
        this.maxLevel = maxLevel;
        this.xp = xp;

    }

    public static String playerName;

    public static String charclass;

    public static int hp;
    public static int maxHp;

    public static double armor;
    public static double maxArmor;

    public static int mana;
    public static int maxMana;

    public static int meleeDmg;
    public static int maxMeleeDmg;

    public static int speed;
    public static int maxSpeed;

    public static int luck;
    public static int maxLuck;

    public static int classAbility;

    public static int level;
    public static int maxLevel;
    public static int xp;


// ---------------      THE KEYS TO THIS BUS

    private static void printStats() {
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

    private static void pathOfTheNomad() {
        charclass = "Nomad";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg =

                speed = 12;
        maxSpeed = 25;

        mana = 15;
        maxMana = 47;

        luck = 1;


        xp = 0;
        level = 1;
    }

    private static void pathOfTheAlchemist() {
        charclass = "Alchemist";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg =

                speed = 12;
        maxSpeed = 25;

        mana = 15;
        maxMana = 47;

        luck = 1;

        xp = 0;
        level = 1;
    }

    private static void pathOfTheBerserker() {
        charclass = "Berserker";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg =

                speed = 12;
        maxSpeed = 25;

        mana = 15;
        maxMana = 47;

        luck = 1;

        xp = 0;
        level = 1;
    }

    private static void pathOfThe1() {
        charclass = "1";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg =

                speed = 12;
        maxSpeed = 25;

        mana = 15;
        maxMana = 47;

        luck = 1;

        xp = 0;
        level = 1;
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


    }
}
