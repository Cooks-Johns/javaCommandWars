package toonMain;

public abstract class Heros {

// ----------->       fields


    protected static String charName;
    protected int armor;
    protected int attack;



// ----------->     constructor


  public String getCharName() { return charName; }
  public String setCharName() { return charName; }

  public int getArmor() {
      return armor;
  }
  public int setArmor(){
      return armor;
  }

  public int getAttack() { return attack; }
  public int setAttack() { return attack; }

  public abstract String battleCry();



// ----------->      METHODS





}
