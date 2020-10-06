package day21;

import day20.FillAndPrintIntArray;

public class HomeWork_GermanCities {
    public static void main(String[] args) {
        //Напишите метод печати для строкового массива (String[] germanCites)

         printCities();



    }


        private static void printCities() {
        String[] name = new String[]{"Berlin", "Potsdam", "Erlangen", "Nuremberg", "Frankfurt-am-Main"};
        System.out.println("German cities: " + name[0] + ", " + name[1] + ", " + name[2] + ", " + name[3] + ", " + name[4] + ".");

    }
}

