package day3.hm3;

public class MyLovelyBank {
    public static void main(String[] args) {// mne nuwni dannie, kol-vo deneg, double money-denjgi mogut bitj drobnie,
        // int, goda-celie cisla!
        //peremnie s tipom double...
        //Если клиент положил в банк 1000€ под 3,5%,
        // какая сумма будет его ждать через семь лет?

        bankAccount(1000, 7, 3.5);//2. //bankAccout(zdesj RU4KAMI vvoditj "1000", "7", "3.5");

    }


    private static void bankAccount(double money, int year, double interest) { //1.
        double result = interest * year * money / 100 + money;
        System.out.println("Summa v konce vklada " + result);
    }
}
