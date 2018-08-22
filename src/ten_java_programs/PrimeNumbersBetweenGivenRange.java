package ten_java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersBetweenGivenRange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("  .---------------------------------------------------.\n" +
                           "  |  Hi! Lets find the Primes between a given range.  |\n" +
                           "  |  What's your name?                                |\n" +
                           "  '---------------------------------------------------'\n" +
                           "      ^      (\\_/)  \n" +
                           "      '----- (O.o)   \n" +
                           "             (> <)     "
        );
        String user = input.next();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(".------------.\n" +
                           "|  Hi " + user+"  |\n" +
                           "'------------'" +
                "" +
                ""+
                "--.----------------.\n" +
                           "  |  Enter your the first range  |\n" +
                           "  '------------------------------'\n" +
                           "      ^      (\\_/)  \n" +
                           "      '----- (O.o)   \n" +
                           "             (> <)     "
        );
        int primeOne = input.nextInt();


        System.out.println("  .--------------------------------.\n" +
                           "  |  Enter your the second range  |\n" +
                           "  '---------------------------------'\n" +
                           "      ^      (\\_/)  \n" +
                           "      '----- (O.o)   \n" +
                           "             (> <)     "
        );
        int primeTwo = input.nextInt();


        ArrayList<Integer> prime = new ArrayList<Integer>();

        // usrNum = i;
        int usrNum = 2;
        // primNum = p;
        for(int primNum = primeOne; primNum <= primeTwo; primNum++) {
            usrNum = 2;
            for(;usrNum < 10; usrNum++) {
                if(primNum % usrNum == 0 && primNum != usrNum)  {
                    break;
                }
            }
            if(usrNum == 10) {
                prime.add(primNum);
            }
        }


        System.out.println("Prime numbers between "
                + primeOne + " and " + primeTwo + " are "
                );
        for(int newInt = 0; newInt < prime.size(); newInt++) {
            System.out.println(prime.get(newInt).toString() + ", ");

        }


    }
}
