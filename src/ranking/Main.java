package ranking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter


        Ranking rank = new Ranking();
        int score = 0;
        System.out.println("Just a test");

        while(score != -1){
            score = Integer.parseInt(scan.nextLine());
            if(score >= 0 && score <= 60) {
                rank.add(score);
            }


        }

        rank.print();
    }


}