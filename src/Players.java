import java.util.Scanner;

public class Players {


    public static Object menu;
    static Scanner scan = new Scanner(System.in);

    public Players(Object menu,
                   String playerName, String charclass,
                   int hp, int maxHp,
                   double armor, double maxArmor,
                   int mana, int maxMana,
                   int meleeDmg, int maxMeleeDmg,
                   int speed, int maxSpeed,
                   int luck, int maxLuck,
                   int classAbility, int xp,
                   int level, int maxLevel) {

        this.menu = menu;
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

    public static void pathOfTheNomad() {
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

    protected static void pathOfTheAlchemist() {
        charclass = "Alchemist";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg = 34;

        speed = 12;
        maxSpeed = 25;

        mana = 15;
        maxMana = 47;

        luck = 1;

        xp = 0;
        level = 1;
    }

    public static void pathOfTheBerserker() {
        charclass = ConsoleColors.RED_BOLD + "Berserker";
        hp = 20;
        maxHp = 2000;

        armor = 20;
        maxArmor = 1000;

        meleeDmg = 4;
        maxMeleeDmg = 42;

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


    public static Object getMenu() {
        return menu;
    }

    public static void setMenu(Object menu) {
        Players.menu = menu;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void setScan(Scanner scan) {
        Players.scan = scan;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Players.playerName = playerName;
    }

    public static String getCharclass() {
        return charclass;
    }

    public static void setCharclass(String charclass) {
        Players.charclass = charclass;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Players.hp = hp;
    }

    public static int getMaxHp() {
        return maxHp;
    }

    public static void setMaxHp(int maxHp) {
        Players.maxHp = maxHp;
    }

    public static double getArmor() {
        return armor;
    }

    public static void setArmor(double armor) {
        Players.armor = armor;
    }

    public static double getMaxArmor() {
        return maxArmor;
    }

    public static void setMaxArmor(double maxArmor) {
        Players.maxArmor = maxArmor;
    }

    public static int getMana() {
        return mana;
    }

    public static void setMana(int mana) {
        Players.mana = mana;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static void setMaxMana(int maxMana) {
        Players.maxMana = maxMana;
    }

    public static int getMeleeDmg() {
        return meleeDmg;
    }

    public static void setMeleeDmg(int meleeDmg) {
        Players.meleeDmg = meleeDmg;
    }

    public static int getMaxMeleeDmg() {
        return maxMeleeDmg;
    }

    public static void setMaxMeleeDmg(int maxMeleeDmg) {
        Players.maxMeleeDmg = maxMeleeDmg;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Players.speed = speed;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static void setMaxSpeed(int maxSpeed) {
        Players.maxSpeed = maxSpeed;
    }

    public static int getLuck() {
        return luck;
    }

    public static void setLuck(int luck) {
        Players.luck = luck;
    }

    public static int getMaxLuck() {
        return maxLuck;
    }

    public static void setMaxLuck(int maxLuck) {
        Players.maxLuck = maxLuck;
    }

    public static int getClassAbility() {
        return classAbility;
    }

    public static void setClassAbility(int classAbility) {
        Players.classAbility = classAbility;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Players.level = level;
    }

    public static int getMaxLevel() {
        return maxLevel;
    }

    public static void setMaxLevel(int maxLevel) {
        Players.maxLevel = maxLevel;
    }

    public static int getXp() {
        return xp;
    }

    public static void setXp(int xp) {
        Players.xp = xp;
    }


    public static void menu() {
        Scanner scan = new Scanner(System.in);
        String charclass;
        int num = 2;
        while (num > 1) {
            System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.BLACK +
                    "                  <--------------->" + "\n" +
                    "              Enter your Name, and press " + "\n" +
                    "                 to start your quest   " + " \n" +
                    "              <--------------------------> ");
            playerName = scan.nextLine();
            System.out.println("Hello," + ConsoleColors.PURPLE + playerName + " Choose your class: " + ConsoleColors.RESET);
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
            }/// give user a option to exit
            printStats();


        }


    }


}
