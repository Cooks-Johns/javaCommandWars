package ten_java_programs;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner bill = new Scanner(System.in);
        System.out.println("Welcome to Number Checker!!\n" +
                           " Whats your Anounted mage name");
        String mage = bill.nextLine();

        System.out.println("Welcome" + mage);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number which you want to check \n" +
                           " whether that it is odd or even! ");
        int n = in.nextInt();

        if(n%2 == 0){
            System.out.println(n+ " is an even number.");
        }else {
            System.out.println(n+ " is an odd number.");
            new EvenOdd();
        }

    }

}
