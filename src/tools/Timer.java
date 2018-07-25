package tools;

import java.util.Scanner;

public abstract class Timer {


    static int i, j;

    public static void hurryUp() {
        System.out.println("go");
        System.out.println(" goooo");
        System.out.println("its going");
        System.out.println(" its gone");

    }

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        for (j = 0; j >= 0; j++) {
            for (i = 0; i < 10; i++) {
                System.out.println(j + ":" + i);

                if (j >= 1) {
                    hurryUp();
                } else {


                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException ie) {
                        System.out.println(ie.getMessage());
                    }
                }

            }
        }
    }
}