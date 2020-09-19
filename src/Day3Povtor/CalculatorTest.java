package Day3Povtor;

public class CalculatorTest {
    public static void main(String[] args) {
        intIntroduction();
    }

    public static void intIntroduction() {
        System.out.println(2 * 5);
        System.out.println(2 + 5);
        int a = 2;
        int b = 6;
        int c = a + b;
        System.out.println("Znachenie c - " + c);
        System.out.println("\n");

        int money = 900;
        int iphoneCost = 1000;
        //System.out.println(900 / 1000);
        System.out.println("Количество айфонов, которые я могу купить " + money / iphoneCost);

    }
}