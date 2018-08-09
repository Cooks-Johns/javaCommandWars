
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


        // Create numberFormat using Locals

        NumberFormat us = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat india = NumberFormat.getNumberInstance(INDIA);
        NumberFormat france = NumberFormat.getNumberInstance(Locale.FRANCE);
        NumberFormat china = NumberFormat.getNumberInstance(Locale.CHINA);
        NumberFormat japan = NumberFormat.getNumberInstance(Locale.JAPAN);
        NumberFormat uk = NumberFormat.getNumberInstance(Locale.UK);
        NumberFormat bahamas = NumberFormat.getNumberInstance(BAHAMAS);
        NumberFormat belize = NumberFormat.getNumberInstance(BELIZE);
        NumberFormat nicaragua = NumberFormat.getNumberInstance(NICARAGUA);


//        Now its time to print these things out


        System.out.println("US: " + us.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("Japan:" + japan.format(payment));
        System.out.println("UK: " + uk.format(payment));
        System.out.println("Bahamas: " + bahamas.format(payment));
        System.out.println("Belize: " + belize.format(payment));
        System.out.println("Nicaragua: " + nicaragua.format(payment));


    }

}
