package toonMain.types;

import tools.ConsoleColors;
import toonMain.Heros;


class Nomad extends Heros {



    public String battleCry() {

        return ConsoleColors.WHITE_BOLD + "------------------------> "  +
                "                           'n' is for Nomad" + "\n" +
                "                           I might not be fast but I'll keep it moving" + "\n" +
                "                           <------------------------> " +
                ConsoleColors.RESET;
    }





}
