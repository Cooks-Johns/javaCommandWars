package ten_java_programs;

import java.util.Scanner;

public class FactorFriends {

    public static void main(String[] args) {

        Scanner factor = new Scanner(System.in);

        System.out.println(" Enter the number of the number you want to factor: ");
        int num1 = factor.nextInt();
        int flex = factor.nextInt();

        for(int i = num1; i<0; i--){
            flex = flex * i;

        }
    }
}
