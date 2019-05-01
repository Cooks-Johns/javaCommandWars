package toons.types;

import toons.Heros;

public class Berserker extends Heros {


    public String battleCry;

    public Berserker(String baseBattleCry,
                     int baseArmor,
                     int baseSpeed,
                     int baseAttack,
                     int baseLevel) {
        super(baseBattleCry, baseArmor, baseSpeed, baseAttack, baseLevel);
        battleCry = baseBattleCry;
    }
}
