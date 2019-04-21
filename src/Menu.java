import java.util.Scanner;

public class Menu {



    public static Scanner in = new Scanner(System.in);
    public static String dialog;


    public static void main(String[] args) {

        dialog = "0";

        while(true) {

            switch(dialog) {

//                intro
                case "0":
                System.out.println(" This is going to be the first intro for your game"
                        + "Add a part of the story here. \n\n" +
                        " User is prompt to enter their name!");   // \n\n this is used to print on the next line
                dialog = "1";
                break;

//              NAME SELECTIONS
                case "1":
                    in.next();
                dialog = "1Alpha";
                break;

//                confirm

                case "1Alpha":
                    System.out.println("\n\nAre you sure this is the name you want to use?" +
                            "\n(1)Yes\n(2)No");
                    dialog = "2";
                    break;



                case "2":
                    switch(in.next()) {
                        case "1":
                        System.out.println("\n\nSo do you want to play a game");

                        dialog = "2Alpha";
                        break;

                        case "2":

                    }






            }
        }

    }
}