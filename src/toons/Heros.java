package toons;

public class Heros {

// ----------->       fields

    public String battleCry;
    public int armor;
    public int speed;
    public int attack;
    public int level;


// ----------->     constructor

  public Heros(String baseBattleCry, int baseArmor, int baseSpeed,
               int baseAttack, int baseLevel) {

      this.battleCry = baseBattleCry;
      this.armor = baseArmor;
      this.speed = baseSpeed;
      this.attack = baseAttack;
      this.level = baseLevel;

  }


// ----------->      METHODS

//  public void setBattleCry(String nomadCry){
//    Heros nomadCry = "d";
//  }

    public void setArmor(int armorSpawn){
      armor = armorSpawn;
    }

    public void setSpeed(int speedSpawn) {
      armor = speedSpawn;
    }

    public void setAttack(int attackSpawn) {
      attack = attackSpawn;
    }

    public void setLevel(int levelSpawn) { level = levelSpawn;}


}
