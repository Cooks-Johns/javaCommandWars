package ranking;

import java.util.ArrayList;





public class Ranking {


    private ArrayList<Integer> ranks;
    private int allScores;
    private int accepted;
    private int count0;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;

    public Ranking(){
        this.ranks = new ArrayList<>();
        this.allScores = 0;
        this.accepted = 0;
    }

    public void add(int rank){
        if(rank <= 60 && rank >= 0){
            this.ranks.add(rank);
            this.allScores++;

            if(rank >= 30){
                this.accepted++;
            }
        }
    }

    public double percentage (){
        if(this.allScores != 0){
            return 100.0 * this.accepted/this.allScores;
        }
        else{
            return 0.0;
        }
    }

    public void printStars(int times) {
        for(int i = times; i > 0; i --){
            System.out.print("*");
        }

        System.out.println("");

    }

    public void count () {

        for(int rank : this.ranks){

            if(rank >= 50){
                this.count5++;
            }

            if(rank >= 45 && rank <= 49){
                this.count4++;
            }


            if(rank >= 40 && rank <= 44){
                this.count3++;
            }

            if(rank >= 35 && rank <= 39){
                this.count2++;
            }

            if(rank >= 30 && rank <= 34){
                this.count1++;
            }

            if(rank >= 0 && rank <= 29){
                this.count0++;
            }

        }
    }

    public void print () {
        count();

        System.out.println("rank distribution:");

        System.out.print("5: ");
        printStars(this.count5);

        System.out.print("4: ");
        printStars(this.count4);

        System.out.print("3: ");
        printStars(this.count3);

        System.out.print("2: ");
        printStars(this.count2);

        System.out.print("1: ");
        printStars(this.count1);

        System.out.print("0: ");
        printStars(this.count0);
        System.out.println("Acceptance percentage: " + percentage());
    }
}
