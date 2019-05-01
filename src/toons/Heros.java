package toons;

public class Heros {

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


// ----------->      METHODS



    public void setArmor(int armorSpawn){
      armor = armorSpawn;
    }


    public void setSpeed(int speedSpawn) {
      armor = speedSpawn;
    }


    public void setAttack(int toonAttack) {
      attack = toonAttack;
    }


    public void setLevel(int levelUp) { level += levelUp;}


}
