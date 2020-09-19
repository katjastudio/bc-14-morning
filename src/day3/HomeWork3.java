package day3;

import java.sql.SQLOutput;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println("Write a programm for area of a circle, r = 7 (S). "); //1.Написать программу
        // для вычисления площади круга.
        System.out.println("S = PI * r^2");

        final double PI = 3.14;
        double r = 7;
        System.out.println("S = " + PI * (r * r));
        System.out.println("\n");
        System.out.println("Task2");
        System.out.println("Find Circumference of a circle (C).");//2.Найти длину окружности.
        System.out.println("C = 2 * PI * r");
        System.out.println("C = " + 2 * PI * r);

        System.out.println();
        System.out.println("Task3");//3.Написать формулу вычисления стоимости Евро,
        // если курс Евро к Доллару 1,1.
        int money = 10;
        double rate = 1.1;
        System.out.println("10 Eur in USD, rate 1.1 = " + money * rate + " $");

        System.out.println();
        System.out.println("Task4");//4.Найти соотношение площади Беларуси
        // к площади Украины.
        double bel = 207_595;
        double ukr = 603_628;
        double ratio = bel / ukr; //Посчитала заранее.

        System.out.println("Area ratio BEL / UKR = " + ratio);


        System.out.println();
        System.out.println("Task5");//5.Найти, во сколько раз площадь
        // Москвы больше площади Берлина.
        double ber = 891.8;
        double msc = 2_511;
        double ratio2 = msc / ber;
        System.out.println("Area ratio MSC / BER " + ratio2);

        System.out.println();
        System.out.println("Task6");//6.Если клиент положил в банк 1000€ под 3,5%,
        // какая сумма будет его ждать через семь лет?
        int value = 1000;
        double interest = 3.5;
        int years = 7;
        double result = interest * years * value / 100 + value;
        System.out.println("The value after 7 Years is " + result);

    }

}
