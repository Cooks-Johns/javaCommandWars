package toonMain.types;

import tools.ConsoleColors;
import toonMain.Heros;


class Nomad extends Heros {

    public String battleCry;




    public Nomad(String baseBattleCry,
                 int baseArmor,
                 int baseSpeed,
                 int baseAttack,
                 int baseLevel) {
     super(baseArmor, baseSpeed, baseAttack, baseLevel);
     battleCry = baseBattleCry;
    }

    public String baseBattleCry() {

        return ConsoleColors.WHITE_BOLD + "------------------------> "  +
                "                           'n' is for Nomad" + "\n" +
                "                           I might not be fast but I'll keep it moving" + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }


}
