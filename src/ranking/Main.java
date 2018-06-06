package ranking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Ranking rank = new Ranking();
        int score = 0;
        System.out.println("Type exam scores, -1 completes:");

        while(score != -1){
            score = Integer.parseInt(lukija.nextLine());
            if(score >= 0 && score <= 60){
                rank.add(score);
            }


        }

        rank.print();
    }


}