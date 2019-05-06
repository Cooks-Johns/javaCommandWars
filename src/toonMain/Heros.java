package toonMain;

public abstract class Heros {

// ----------->       fields

    public int armor;
    public int speed;
    public int attack;
    public int level;


// ----------->     constructor

  public Heros(int baseArmor, int baseSpeed,
               int baseAttack, int baseLevel) {

      this.armor = baseArmor;
      this.speed = baseSpeed;
      this.attack = baseAttack;
      this.level = baseLevel;

  }

  public int getArmor() {
      return armor;
  }

  public int setArmor(){
      return armor;
  }

  public int getSpeed(){
      return speed;
  }

  public int setSpeed(){
      return speed;
  }

// ----------->      METHODS





}
