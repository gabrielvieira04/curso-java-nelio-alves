package section8Exercises.application;
import section8Exercises.utils.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Qual o preço atual do dólar ? ");
        double currentPrice = sc.nextDouble();

        System.out.println("Qual a quantidade que deseja comprar ? ");
        double amount = sc.nextDouble();

        System.out.printf("Total a pagar %.2f%n", CurrencyConverter.dollarExchange(currentPrice, amount));

        sc.close();
    }   

}
