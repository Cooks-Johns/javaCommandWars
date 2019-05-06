package rpg_test;



public abstract class Toons {




    private static int maxLevel;


    public static String playerName;
    public static String charclass;
    public static int hp;
    public static double armor;
    public static int mana;
    public static int meleeDmg;
    public static int speed;
    public static int luck;
    public static int classAbility;
    public static int xp;
    public static int level;
    public static String battleCry;


    public Toons(  String playerName,
                   String charclass,
                   int hp, double armor,
                   int mana, int meleeDmg,
                   int speed, int luck,
                   int classAbility, int xp,
                   int level,
                   String battleCry) {

        this.playerName = playerName;
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
        this.battleCry = battleCry;
    }




}
