// Task 4: Currency Converter
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToInrRate = 83.537; //Rate of USD to INR on 23/06/2024
        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.next();
        System.out.print("Enter target currency (e.g., INR): ");
        String targetCurrency = scanner.next();
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = amount * usdToInrRate;
        System.out.println("Converted amount in " + targetCurrency + ": " + convertedAmount);
        scanner.close();
    }
}
