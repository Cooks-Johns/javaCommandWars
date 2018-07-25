package tools;

import java.util.*;
import java.util.Random;

public class dice {

    public static int roll6(){
        Random rand = new Random();
        int n = rand.nextInt(7);
        while(n == 0){
            n = rand.nextInt(7);
        }//1-6
        return n;
    }
    public static int roll10(){
        Random rand = new Random();
        int n = rand.nextInt(11);
        while(n == 0){
            n = rand.nextInt(11);
        }
        return n;
    }//1-10
    public static int roll20(){
        Random rand = new Random();
        int n = rand.nextInt(21);
        while(n == 0){
            n = rand.nextInt(21);
        }//1-20
        return n;
    }

    public dice(Integer now) {

//        int x = 2; // wait 2 seconds at most
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        long startTime = System.currentTimeMillis();
//        while ((System.currentTimeMillis() - startTime) < x * 1000
//                && !in.ready()) {
//        }
//
//        if (in.ready()) {
//            System.out.println("You entered: " + in.readLine());
//        } else {
//            System.out.println("You did not enter data");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Random.Int());
    }

}