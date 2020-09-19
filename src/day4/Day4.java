package day4;

public class Day4 {
    public static void main(String[] args) {
        int r = 5;//2.Найти длину окружности. INT (tip dannih)
        findCircumferrence(r);//1. takogo METODa netu, ne hotite sozdatj?
        findCircumferrence(7);
        findCircumferrence(10);
        int radiusFromKonstantin = 100;
        findCircumferrence(radiusFromKonstantin);
        double moneyInEuro = 1000;//DOUBLE (tip dannih)
        currencyConverter(moneyInEuro, 1.1);//
    }

    public static void currencyConverter(double euro, double course) {
        System.out.println(euro * course );

    }


    public static void findCircumferrence(int radius) {
        //L = 2 * PI * r
        double l = 2 * Math.PI * radius;
        System.out.println(l + " - eto DLINA Okruwnosti, s radiusom " + radius);
    }
}
