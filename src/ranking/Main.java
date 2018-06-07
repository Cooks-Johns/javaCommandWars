package ranking;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        Ranking rank = new Ranking();
        int score = 0;
        System.out.println("Just a test");

        while(score != -1){
            score = Integer.parseInt(scan.nextLine());
            if(score >= 0 && score <= 60) {
                rank.add(score);
            }



            /////---------------> work with moving between files with your code


        }

        rank.print();
    }


}