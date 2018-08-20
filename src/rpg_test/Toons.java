package rpg_test;



public abstract class Toons {



    public Toons(Object menu,
                   String playerName,
                   String charclass,
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

    private static int maxLevel;


    public static Object menu;



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



    public static Object getMenu() {
        return menu;
    }

    public static void setMenu(Object menu) {
        Toons.menu = menu;
    }


    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Toons.playerName = playerName;
    }

    public static String getCharclass() {
        return charclass;
    }

    public static void setCharclass(String charclass) {
        Toons.charclass = charclass;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Toons.hp = hp;
    }

    public static int getMaxHp() {
        return maxHp;
    }

    public static void setMaxHp(int maxHp) {
        Toons.maxHp = maxHp;
    }

    public static double getArmor() {
        return armor;
    }

    public static void setArmor(double armor) {
        Toons.armor = armor;
    }

    public static double getMaxArmor() {
        return maxArmor;
    }

    public static void setMaxArmor(double maxArmor) {
        Toons.maxArmor = maxArmor;
    }

    public static int getMana() {
        return mana;
    }

    public static void setMana(int mana) {
        Toons.mana = mana;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static void setMaxMana(int maxMana) {
        Toons.maxMana = maxMana;
    }

    public static int getMeleeDmg() {
        return meleeDmg;
    }

    public static void setMeleeDmg(int meleeDmg) {
        Toons.meleeDmg = meleeDmg;
    }

    public static int getMaxMeleeDmg() {
        return maxMeleeDmg;
    }

    public static void setMaxMeleeDmg(int maxMeleeDmg) {
        Toons.maxMeleeDmg = maxMeleeDmg;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Toons.speed = speed;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static void setMaxSpeed(int maxSpeed) {
        Toons.maxSpeed = maxSpeed;
    }

    public static int getLuck() {
        return luck;
    }

    public static void setLuck(int luck) {
        Toons.luck = luck;
    }

    public static int getMaxLuck() {
        return maxLuck;
    }

    public static void setMaxLuck(int maxLuck) {
        Toons.maxLuck = maxLuck;
    }

    public static int getClassAbility() {
        return classAbility;
    }

    public static void setClassAbility(int classAbility) {
        Toons.classAbility = classAbility;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Toons.level = level;
    }

    public static int getMaxLevel() {
        return maxLevel;
    }

    public static void setMaxLevel(int maxLevel) {
        Toons.maxLevel = maxLevel;
    }

    public static int getXp() {
        return xp;
    }

    public static void setXp(int xp) {
        Toons.xp = xp;
    }

    public static void pathOfTheNomad() {
    }
}
