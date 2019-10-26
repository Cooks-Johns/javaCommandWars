package rpg_test;

import tools.ConsoleColors;

public class Stats extends Toons {

    public Stats(String charclass, int hp, double armor, int mana, int meleeDmg, int speed, int luck,
			int classAbility, int xp, int level) {
		super(charclass, hp, armor, mana, meleeDmg, speed, luck, classAbility, xp, level);
		// TODO Auto-generated constructor stub
	}

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
