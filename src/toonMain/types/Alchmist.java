package toonMain.types;


import tools.ConsoleColors;
import toonMain.Heros;

public class Alchmist extends Heros {


    public String battleCry() {
    return ConsoleColors.CYAN_BOLD_BRIGHT +
                "------------------------> " +
                "'a' for Alchemist" + "\n" +
                "                           The elixer is the the real gold,\n" +
                "                           but gold is gold." + "\n" +
                ConsoleColors.RESET;
    }
}
