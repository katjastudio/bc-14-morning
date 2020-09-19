package day4;

public class CurrencyCalculator {
    public static void main(String[] args) {
        int money;
        double rate;

        money = 10;
        rate = 1.1;

        calculate(money, rate);
        calculate(1000, 1.5);

    }

    public static void calculate(int mny, double rte) {
        System.out.println(mny * rte);

    }

}