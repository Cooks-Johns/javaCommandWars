package toons.types;

import tools.ConsoleColors;
import toons.Heros;

public class Alchmist extends Heros {


    public String battleCry;

    public Alchmist(String baseBattleCry,
                    int baseArmor,
                    int baseSpeed,
                    int baseAttack,
                    int baseLevel) {
        super(baseArmor, baseSpeed, baseAttack, baseLevel);
        battleCry = baseBattleCry;
    }

    public void setBattleCry(String cry) {
        battleCry = ConsoleColors.CYAN_BOLD_BRIGHT +
                "------------------------> " +
                "'a' for Alchemist" + "\n" +
                "                           The elixer is the the real gold,\n" +
                "                           but gold is gold." + "\n" +
                ConsoleColors.RESET;
    }
}
