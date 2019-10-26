package rpg_test;



public abstract class Toons {




    private static int maxLevel();
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


    public Toons(  String charclass,
                   int hp, double armor,
                   int mana, int meleeDmg,
                   int speed, int luck,
                   int classAbility, int xp,
                   int level) {

       
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



    public static int getMaxLevel() {
		return maxLevel;
	}


	public static void setMaxLevel(int maxLevel) {
		Toons.maxLevel = maxLevel;
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


	public static double getArmor() {
		return armor;
	}


	public static void setArmor(double armor) {
		Toons.armor = armor;
	}


	public static int getMana() {
		return mana;
	}


	public static void setMana(int mana) {
		Toons.mana = mana;
	}


	public static int getMeleeDmg() {
		return meleeDmg;
	}


	public static void setMeleeDmg(int meleeDmg) {
		Toons.meleeDmg = meleeDmg;
	}


	public static int getSpeed() {
		return speed;
	}


	public static void setSpeed(int speed) {
		Toons.speed = speed;
	}


	public static int getLuck() {
		return luck;
	}


	public static void setLuck(int luck) {
		Toons.luck = luck;
	}


	public static int getClassAbility() {
		return classAbility;
	}


	public static void setClassAbility(int classAbility) {
		Toons.classAbility = classAbility;
	}


	public static int getXp() {
		return xp;
	}


	public static void setXp(int xp) {
		Toons.xp = xp;
	}


	public static int getLevel() {
		return level;
	}


	public static void setLevel(int level) {
		Toons.level = level;
	}





}
