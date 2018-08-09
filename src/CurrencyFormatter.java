
//working a HackerRank Problem that I think would be cool to use in my game


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // making some custom tags for a few cliff hangers

        Locale INDIA = new Locale("en", "IN");
        Locale BAHAMAS = new Locale("en", "bah");
        Locale BELIZE = new Locale("en", "bzj");
        Locale NICARAGUA = new Locale("en", "bzk");


        // Create number form

        NumberFormat us = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat india = NumberFormat.getNumberInstance(INDIA);
        NumberFormat france = NumberFormat.getNumberInstance(Locale.FRANCE);
        NumberFormat japan = NumberFormat.getNumberInstance(Locale.JAPAN);
        NumberFormat uk = NumberFormat.getNumberInstance(Locale.UK);
        NumberFormat bahamas = NumberFormat.getNumberInstance(BAHAMAS);
        NumberFormat belize = NumberFormat.getNumberInstance(BELIZE);



    }

}
