import tools.ConsoleColors;

import java.util.Scanner;
import java.util.*;

public class PlayerList {


    //---- PLAYER TRAITS


    // must think of how to setUp abilities

    // make a method with math,randon math.floor to make a random roller
    // also think about the max luck each character gets


    private String playerName;
    private String charclass;
    private int hp;
    private double armor;
    private int mana;
    private int meleeDmg;
    private int speed;
    private int luck;
    private int classAbility;
    private int level;
    private int xp;


    Players Nomad = new Players();


    //----------------          COMPANIONS

    private String compaionName;


    private int companionHp;
    private int companionMana;
    private int companionStrength;
    private int companionAbility;


    //----      MOUNTS

    private static int mountHp;
    private static int mountSpeed;
    private static int mountStrength;
    private static int mountAbility;


    //--------      ENEMY

    private String enemyName;
    private int enemyHp;
    private int enemyMana;
    private int enemyMeleeDmg;


//    public static  enemyAbility;


    //--------      BOSS

    private String BossName;

    private int BossHp;
    private int BossMana;
    private int BossMeleeDmg;
    private int BossAbility;




    public PlayerList(
            String charclass,
            int hp, double armor, int mana, int meleeDmg, int speed,
            int luck, int classAbility, int level, int xp

            ) {

        this.charclass = charclass;
        this.hp = hp;
        this.armor = armor;
        this.mana = mana;
        this.meleeDmg = meleeDmg;
        this.speed = speed;
        this.luck = luck;
        this.classAbility = classAbility;
        this.level = level;
        this.xp = xp;


    }


// ---------------      THE KEYS TO THIS BUS

   private static void printStats() {
       if (charclass.equals("Alchemist")) {
           System.out.println(playerName + "\nhp: " + Players.hp +
                   "\nmana: " + mana + "\ndamage: " +
                   Players.meleeDmg + "\nxp: " + xp + "\n");
       } else {
           System.out.println(playerName + "\nhp: " +
                   Players.hp + "\ndamage: " + Players.meleeDmg +
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
   // -----------  BOSS'S

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

    // ----------------          COMPANIONS

   public static void companions(){

    compaionName = "";

       companionHp = 2;
       companionMaxHp = 4;

       companionMana = 3;
       companionMaxMana = 4;

       companionStrength = 4;
       companionMaxStength = 3;

       // companionAbility;
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

   // this is going to use the Players level to adjust the enemy level
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
           Players.printStats();


       }
   }






    public String getCharclass() {
        return charclass;
    }


}


