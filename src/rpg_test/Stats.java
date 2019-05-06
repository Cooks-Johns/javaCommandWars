package rpg_test;

import tools.ConsoleColors;

public class Stats {

    public static void pathOfTheNomad() {
        Toons.charclass = "Nomad";
        Toons.hp = 20;

        Toons.armor = 20;

        Toons.meleeDmg = 4;

        Toons.speed = 12;

        Toons.mana = 15;

        Toons.luck = 1;


        Toons.xp = 0;
        Toons.level = 1;
        Toons.battleCry = ConsoleColors.RED_BOLD + "------------------------> " + "'b' for Berserker" + "\n" +
                    "                           So this might be a good time to run....\n " +
                    "                           but if I see you it's already to late." + "\n" +
                    "                           <------------------------> " +
                    ConsoleColors.RESET;

    }

    public static void pathOfTheAlchemist() {
        Toons.charclass = "Alchemist";
        Toons.hp = 20;

        Toons.armor = 20;

        Toons.meleeDmg = 4;

        Toons.speed = 12;

        Toons.mana = 15;

        Toons.luck = 1;

        Toons.xp = 0;
        Toons.level = 1;
    }

    public static void pathOfTheBerserker() {
        Toons.charclass = ConsoleColors.RED_BOLD + "Berserker";
        Toons.hp = 20;

        Toons.armor = 20;

        Toons.meleeDmg = 4;

        Toons.speed = 12;

        Toons.mana = 15;

        Toons.luck = 1;

        Toons.xp = 0;
        Toons.level = 1;
    }

    private static void pathofTheArcher() {
        Toons.charclass = "1";
        Toons.hp = 20;

        Toons.armor = 20;

        Toons.meleeDmg = 4;

        Toons.speed = 12;

        Toons.mana = 15;

        Toons.luck = 1;

        Toons.xp = 0;
        Toons.level = 1;
    }


}
