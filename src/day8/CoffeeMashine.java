package day8;

public class CoffeeMashine {
    public static void latte() {
        System.out.println("-------");
        System.out.println("We are creating latte for you");
        milk (30);
        coffee (40);
        watter(20);
        System.out.println("---------");

    }

    public static void cappucino() {
    }

    public static void americano() {
    }

    public static void watter(int ml) {
        System.out.printf("Added %d ml of coffe \n", ml);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of coffe \n", ml);

    }
    public static void coffee(int ml){
        System.out.printf("Added %d ml of coffe \n", ml);


    }
}

