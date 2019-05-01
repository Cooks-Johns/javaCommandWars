package toons.types;

import tools.ConsoleColors;
import toons.Heros;

public class Berserker extends Heros {


    public String battleCry;

    public Berserker(String baseBattleCry,
                     int baseArmor,
                     int baseSpeed,
                     int baseAttack,
                     int baseLevel) {
        super(baseArmor, baseSpeed, baseAttack, baseLevel);
        battleCry = baseBattleCry;
    }

    public void setBattleCry(String cry) {
        battleCry = ConsoleColors.RED_BOLD + "------------------------> " + "'b' for Berserker" + "\n" +
                "                           So this might be a good time to run....\n " +
                "                           but if I see you it's already to late." + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }
}
