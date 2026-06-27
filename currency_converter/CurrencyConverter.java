import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> rates = new HashMap<>();

        // Exchange rates with respect to USD
        rates.put("USD", 1.0);
        rates.put("INR", 86.0);
        rates.put("EUR", 0.85);
        rates.put("GBP", 0.74);
        rates.put("JPY", 147.0);

        System.out.println("================================");
        System.out.println("      CURRENCY CONVERTER");
        System.out.println("================================");

        System.out.println("Available Currencies:");
        System.out.println("USD");
        System.out.println("INR");
        System.out.println("EUR");
        System.out.println("GBP");
        System.out.println("JPY");

        System.out.print("\nEnter Base Currency: ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter Target Currency: ");
        String to = sc.next().toUpperCase();

        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            System.out.println("Invalid Currency!");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double usd = amount / rates.get(from);
        double converted = usd * rates.get(to);

        System.out.println("\n========== RESULT ==========");
        System.out.printf("%.2f %s = %.2f %s%n",
                amount, from, converted, to);

        sc.close();
    }
}
