package toons.types;

import tools.ConsoleColors;
import toons.Heros;

public class Nomad extends Heros {

    public String battleCry;



    public Nomad(String baseBattleCry,
                 int baseArmor,
                 int baseSpeed,
                 int baseAttack,
                 int baseLevel) {
     super(baseBattleCry, baseArmor, baseSpeed, baseAttack, baseLevel);
     battleCry = baseBattleCry;
    }

    public void setBattleCry(String cry) {

        battleCry = ConsoleColors.WHITE_BOLD +

                "------------------------> "  +
                "                           I might not be fast but I'll keep it moving" + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }
}
