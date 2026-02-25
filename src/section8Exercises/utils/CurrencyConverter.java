package section8Exercises.utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarExchange(double currentPrice, double amount){
        return currentPrice * amount * (1 + IOF);
    }

}
