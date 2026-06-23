import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdRate = 83.5;

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * usdRate;

        System.out.println("INR = ₹" + inr);

        sc.close();
    }
}