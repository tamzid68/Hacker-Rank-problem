import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount = scan.nextDouble();

        // US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(amount));

        // India
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indiaCurrency = indiaFormat.format(amount).replace("₹", "Rs.");
        System.out.println("India: " + indiaCurrency);

        // China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + chinaFormat.format(amount));

        // France
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + franceFormat.format(amount));
    }
}
