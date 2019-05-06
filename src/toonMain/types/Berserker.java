package toonMain.types;

import tools.ConsoleColors;
import toonMain.Heros;

public class Berserker extends Heros {




    public Berserker(int baseArmor, int baseSpeed, int baseAttack, int baseLevel) {
        super(baseArmor, baseSpeed, baseAttack, baseLevel);
    }


    public String battleCry() {
        return ConsoleColors.RED_BOLD + "------------------------> " + "'b' for Berserker" + "\n" +
                "                           So this might be a good time to run....\n " +
                "                           but if I see you it's already to late." + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }


}
