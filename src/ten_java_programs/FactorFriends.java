package ten_java_programs;

import java.util.Scanner;

public class FactorFriends {


    private static Scanner factor;


    public static void main(String[] args) {

        int Number, i;
        factor = new Scanner(System.in);
        System.out.println("Enter your number so I can find its friends!");
        Number = factor.nextInt();

        System.out.println("Here are your factors");
        for(i = 1; i <= Number; i++) {
            if(Number%i == 0) {
                System.out.format("  %d ", i);

            }
        }
    }
}
