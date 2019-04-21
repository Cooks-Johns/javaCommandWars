package java_programs;

import java.util.Scanner;

public class NumberSwapNo3rdVariable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st int: ");
        int numOne = in.nextInt();
        System.out.println("Enter the 2nd int: ");
        int numTwo = in.nextInt();

        System.out.println("Initial value of x:: " +
                    numOne + " and the second one is " + numTwo);

        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        System.out.println(
                "After swapping here are the new values for the 1st and 2nd int "
                + "(" + numOne + ", " + numTwo + ")");



    }
}
