import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class PlayerList {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    //---- PLAYER TRAITS

    // make a method with math,randon math.floor to make a random roller
    // also think about the max luck each character gets
    public static String playerName;

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

    public static int enemyAbility;


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









    public static String charclass;

    private static void printStats() {
        if (charclass.equals("mage")) {
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
    private static void pathOfTheBerserker() {
        charclass = "Berserker";
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
            System.out.println("Enter your Name: ");
            playerName = scan.nextLine();
            System.out.println("Choose your class: ");
            System.out.println("'n' for Nomad"+ "\n" +
                    " No I'm not Mad!" + "\n" + "<------------------------> ");
            System.out.println("'a' for Alchemist");
            System.out.println("'b' for Berserker");
            charclass = scan.nextLine();


            if (charclass.charAt(0) == 'N') {
                pathOfTheNomad();
            }
            if (charclass.charAt(0) == 'A') {
                pathOfTheAlchemist();
            }
            if (charclass.charAt(0) == 'B') {
                pathOfTheBerserker();
            }
            printStats();


        }
    }
}


