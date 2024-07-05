package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarConverter(double dollarPrice,double dollarAmount) {
        dollarAmount += dollarAmount*IOF;
        return dollarPrice * dollarAmount;//reais
    }

}
