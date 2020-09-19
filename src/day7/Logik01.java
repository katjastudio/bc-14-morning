package day7;

public class Logik01 {
    public static void main(String[] args) {
        /* 1. Родители Васи Сидорова купили умный сейф и
         запрограммировали его на выдачу денег по
         отпечатку пальцев одного из родителей.

         */
        System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));
    }

    private static boolean smartDepositBox(boolean b1, boolean b2) {
        return b1 || b2;
    }
}
