package toonMain.types;

import tools.ConsoleColors;
import toonMain.Heros;

class Berserker extends Heros {


    public String battleCry() {
        return ConsoleColors.RED_BOLD + "------------------------> " + "'b' for Berserker" + "\n" +
                "                           So this might be a good time to run....\n " +
                "                           but if I see you it's already to late." + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }


}
