import java.util.Scanner;

public class JavaStudying {


    public void move(){
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("jump");

            case 2:
                System.out.println("dodge");
                break;
            case 3:
                System.out.println("skip");
                break;
            case 4:
                System.out.println("run");
                break;
            case 5:
                System.out.println("poke");
                break;
            case 6:
                System.out.println("hide");
                break;

        }
    }

    public static void main(String[] args) {

        String name = "coder";

        System.out.format("hello there, %s. Nice to see you. \n", name);

        //-------------

        String greeting = "Hey! ";

        String name1 = "Coder";

        System.out.format("%s%s!", greeting, name1);


        //---------------

        Scanner sc = new Scanner(System.in);
        System.out.print("You want to play a game? [y/N] ");
        String userInput = sc.next();

// Don't do this!
        boolean confirmation = userInput.equals("y");

            if(confirmation) {


                System.out.println("thank whats your name");
                String userInput1 = sc.next();
                System.out.format("Hello %s so how are you doing\n", userInput1);

            } else if (confirmation){
                System.out.println("So how deep is the who ");

                } else if (confirmation){


        }

    }
}