
import java.util.Scanner;



public class ThizzBuzz {


        static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {

        int n = 1;
        for(int i = 1; scan.hasNext(); i++){
            System.out.println(i + " " + scan.nextLine());
//        for(int i = 1; i < n; i++) {
            // number divisible by 5, print 'Buzz'
            // in place of the number

            if (i % 5 == 0)
                System.out.println("Buzz" + "");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i % 3 == 0)
                System.out.println("Thizz"+" ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number
            else if (i % (3 * 5)== 0)
                System.out.println("ThizzBuzz"+" ");

            else  // print the numbers
                System.out.println(i+" ");
        }
    }


}
