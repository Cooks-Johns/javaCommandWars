import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class PlayerList {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static ConsoleColors blue = new ConsoleColors();
    static ConsoleColors yellow = new ConsoleColors();
    static ConsoleColors red = new ConsoleColors();


    //---- PLAYER TRAITS


    // must think of how to setUp abilities

    // make a method with math,randon math.floor to make a random roller
    // also think about the max luck each character gets


    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        PlayerList.playerName = playerName;
    }

    public static String getCharclass() {
        return charclass;
    }

    public static void setCharclass(String charclass) {
        PlayerList.charclass = charclass;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        PlayerList.hp = hp;
    }

    public static int getMaxHp() {
        return maxHp;
    }

    public static void setMaxHp(int maxHp) {
        PlayerList.maxHp = maxHp;
    }

    public static double getArmor() {
        return armor;
    }

    public static void setArmor(double armor) {
        PlayerList.armor = armor;
    }

    public static double getMaxArmor() {
        return maxArmor;
    }

    public static void setMaxArmor(double maxArmor) {
        PlayerList.maxArmor = maxArmor;
    }

    public static int getMana() {
        return mana;
    }

    public static void setMana(int mana) {
        PlayerList.mana = mana;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static void setMaxMana(int maxMana) {
        PlayerList.maxMana = maxMana;
    }

    public static int getMeleeDmg() {
        return meleeDmg;
    }

    public static void setMeleeDmg(int meleeDmg) {
        PlayerList.meleeDmg = meleeDmg;
    }

    public static int getMaxMeleeDmg() {
        return maxMeleeDmg;
    }

    public static void setMaxMeleeDmg(int maxMeleeDmg) {
        PlayerList.maxMeleeDmg = maxMeleeDmg;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        PlayerList.speed = speed;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static void setMaxSpeed(int maxSpeed) {
        PlayerList.maxSpeed = maxSpeed;
    }

    public static int getLuck() {
        return luck;
    }

    public static void setLuck(int luck) {
        PlayerList.luck = luck;
    }

    public static int getMaxLuck() {
        return maxLuck;
    }

    public static void setMaxLuck(int maxLuck) {
        PlayerList.maxLuck = maxLuck;
    }

    public static int getClassAbility() {
        return classAbility;
    }

    public static void setClassAbility(int classAbility) {
        PlayerList.classAbility = classAbility;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        PlayerList.level = level;
    }

    public static int getXp() {
        return xp;
    }

    public static void setXp(int xp) {
        PlayerList.xp = xp;
    }

    public static String getCompaionName() {
        return compaionName;
    }

    public static void setCompaionName(String compaionName) {
        PlayerList.compaionName = compaionName;
    }

    public static int getCompanionHp() {
        return companionHp;
    }

    public static void setCompanionHp(int companionHp) {
        PlayerList.companionHp = companionHp;
    }

    public static int getCompanionMaxHp() {
        return companionMaxHp;
    }

    public static void setCompanionMaxHp(int companionMaxHp) {
        PlayerList.companionMaxHp = companionMaxHp;
    }

    public static int getCompanionMana() {
        return companionMana;
    }

    public static void setCompanionMana(int companionMana) {
        PlayerList.companionMana = companionMana;
    }

    public static int getCompanionMaxMana() {
        return companionMaxMana;
    }

    public static void setCompanionMaxMana(int companionMaxMana) {
        PlayerList.companionMaxMana = companionMaxMana;
    }

    public static int getCompanionStrength() {
        return companionStrength;
    }

    public static void setCompanionStrength(int companionStrength) {
        PlayerList.companionStrength = companionStrength;
    }

    public static int getCompanionMaxStength() {
        return companionMaxStength;
    }

    public static void setCompanionMaxStength(int companionMaxStength) {
        PlayerList.companionMaxStength = companionMaxStength;
    }

    public static int getCompanionAbility() {
        return companionAbility;
    }

    public static void setCompanionAbility(int companionAbility) {
        PlayerList.companionAbility = companionAbility;
    }

    public static int getMountHp() {
        return mountHp;
    }

    public static void setMountHp(int mountHp) {
        PlayerList.mountHp = mountHp;
    }

    public static int getMountMaxHp() {
        return mountMaxHp;
    }

    public static void setMountMaxHp(int mountMaxHp) {
        PlayerList.mountMaxHp = mountMaxHp;
    }

    public static int getMountSpeed() {
        return mountSpeed;
    }

    public static void setMountSpeed(int mountSpeed) {
        PlayerList.mountSpeed = mountSpeed;
    }

    public static int getMountMaxSpeed() {
        return mountMaxSpeed;
    }

    public static void setMountMaxSpeed(int mountMaxSpeed) {
        PlayerList.mountMaxSpeed = mountMaxSpeed;
    }

    public static int getMountStrength() {
        return mountStrength;
    }

    public static void setMountStrength(int mountStrength) {
        PlayerList.mountStrength = mountStrength;
    }

    public static int getMountMaxStrength() {
        return mountMaxStrength;
    }

    public static void setMountMaxStrength(int mountMaxStrength) {
        PlayerList.mountMaxStrength = mountMaxStrength;
    }

    public static int getMountAbility() {
        return mountAbility;
    }

    public static void setMountAbility(int mountAbility) {
        PlayerList.mountAbility = mountAbility;
    }

    public static String getEnemyName() {
        return enemyName;
    }

    public static void setEnemyName(String enemyName) {
        PlayerList.enemyName = enemyName;
    }

    public static int getEnemyHp() {
        return enemyHp;
    }

    public static void setEnemyHp(int enemyHp) {
        PlayerList.enemyHp = enemyHp;
    }

    public static int getEnemyMaxHp() {
        return enemyMaxHp;
    }

    public static void setEnemyMaxHp(int enemyMaxHp) {
        PlayerList.enemyMaxHp = enemyMaxHp;
    }

    public static int getEnemyMana() {
        return enemyMana;
    }

    public static void setEnemyMana(int enemyMana) {
        PlayerList.enemyMana = enemyMana;
    }

    public static int getEnemyMaxMana() {
        return enemyMaxMana;
    }

    public static void setEnemyMaxMana(int enemyMaxMana) {
        PlayerList.enemyMaxMana = enemyMaxMana;
    }

    public static int getEnemyMeleeDmg() {
        return enemyMeleeDmg;
    }

    public static void setEnemyMeleeDmg(int enemyMeleeDmg) {
        PlayerList.enemyMeleeDmg = enemyMeleeDmg;
    }

    public static int getEnemyMaxMeleeDmg() {
        return enemyMaxMeleeDmg;
    }

    public static void setEnemyMaxMeleeDmg(int enemyMaxMeleeDmg) {
        PlayerList.enemyMaxMeleeDmg = enemyMaxMeleeDmg;
    }

    public static String getBossName() {
        return BossName;
    }

    public static void setBossName(String bossName) {
        BossName = bossName;
    }

    public static int getBossHp() {
        return BossHp;
    }

    public static void setBossHp(int bossHp) {
        BossHp = bossHp;
    }

    public static int getBossMaxHp() {
        return BossMaxHp;
    }

    public static void setBossMaxHp(int bossMaxHp) {
        BossMaxHp = bossMaxHp;
    }

    public static int getBossMana() {
        return BossMana;
    }

    public static void setBossMana(int bossMana) {
        BossMana = bossMana;
    }

    public static int getBossMaxMana() {
        return BossMaxMana;
    }

    public static void setBossMaxMana(int bossMaxMana) {
        BossMaxMana = bossMaxMana;
    }

    public static int getBossMeleeDmg() {
        return BossMeleeDmg;
    }

    public static void setBossMeleeDmg(int bossMeleeDmg) {
        BossMeleeDmg = bossMeleeDmg;
    }

    public static int getBossMaxMeleeDmg() {
        return BossMaxMeleeDmg;
    }

    public static void setBossMaxMeleeDmg(int bossMaxMeleeDmg) {
        BossMaxMeleeDmg = bossMaxMeleeDmg;
    }

    public static int getBossAbility() {
        return BossAbility;
    }

    public static void setBossAbility(int bossAbility) {
        BossAbility = bossAbility;
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
    public static int xp;

    //----------------          COMPANIONS

    public static String compaionName;

    public static int companionHp;
    public static int companionMaxHp;

    public static int companionMana;
    public static int companionMaxMana;

    public static int companionStrength;
    public static int companionMaxStength;

    public static int companionAbility;


    //----      MOUNTS

    public static int mountHp;
    public static int mountMaxHp;

    public static int mountSpeed;
    public static int mountMaxSpeed;

    public static int mountStrength;
    public static int mountMaxStrength;

    public static int mountAbility;


    //--------      ENEMY

    public static String enemyName;

    public static int enemyHp;
    public static int enemyMaxHp;

    public static int enemyMana;
    public static int enemyMaxMana;

    public static int enemyMeleeDmg;
    public static int enemyMaxMeleeDmg;

//    public static  enemyAbility;


    //--------      BOSS

    public static String BossName;

    public static int BossHp;
    public static int BossMaxHp;

    public static int BossMana;
    public static int BossMaxMana;

    public static int BossMeleeDmg;
    public static int BossMaxMeleeDmg;

    public static int BossAbility;


    //----------        ITEMS
    //









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



    private static void printEnemyStats() {
        System.out.println("Enemy " + "\nhp: " +
                enemyHp + "\ndmg: " + enemyMeleeDmg + "\n");
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


    // ----------  NPC

    private static void enemy1(){

         enemyName = " ";

         enemyHp = 10;
         enemyMaxHp = 23 ;

         enemyMana = 42;
         enemyMaxMana = 443;

         enemyMeleeDmg = 43;
         enemyMaxMeleeDmg = 24;

//         enemyAbility;


    }
//
//    // -----------  BOSS'S

    public static void boss1(){

     BossName = "boss1";

     BossHp = 100;
     BossMaxHp = 1000000000;

     BossMana = 23;
     BossMaxMana = 1000000000;

     BossMeleeDmg = 47;
     BossMaxMeleeDmg = 50009000;

//     BossAbility = ;

}

    //----------------          COMPANIONS

    public static void companions(){

     compaionName = "";

        companionHp = 2;
        companionMaxHp = 4;

        companionMana = 3;
        companionMaxMana = 4;

        companionStrength = 4;
        companionMaxStength = 3;

//        companionAbility;
}

//----      MOUNTS

    public static void mounts(){

         mountHp = 3;
         mountMaxHp = 4;

         mountSpeed = 4;
         mountMaxSpeed = 4;

         mountStrength = 4;
         mountMaxStrength = 4;

         mountAbility = 4;
}

    // this is going to use the players level to adjust the enemy level
    // in the future it will be based off the level or progression


    private static void buildEnemy() {
        switch (level) {
            case 1:
                int enemyHp = 9;
                enemyMeleeDmg = 1;
                break;
            case 2:
                enemyHp = 19;
                enemyMeleeDmg = 4;
                break;
            case 3:
                enemyHp = 24;
                enemyMeleeDmg = 6;
                break;
            case 4:
                enemyHp = 32;
                enemyMeleeDmg = 7;
                break;
            case 5:
                enemyHp = 40;
                enemyMeleeDmg = 9;
                break;
        }
    }


    public static void main(String[] args) {
        String charclass;
        int num = 2;
        while (num > 1) {
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


