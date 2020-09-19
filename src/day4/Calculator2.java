package day4;

public class Calculator2 {
    public static void main(String[] args) {
        aadition();
        int a = 100;
        int b = 200;
        additional2(a, b);
        int ergebnis = additional3(a, b);
        System.out.println(ergebnis);
        additional4(a, b);
    }

    private static int additional4(int a, int b) {
        return a + b;
    }

    private static int additional3(int a, int b) {
        int c = a + b;
        return c;
    }

    private static void additional2(int a, int b) {
        int result = a + b;
        System.out.println("Rezultat raboti metoda " + result);
    }

    public static void aadition() {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Rezultat slowenie dvih peremennih - " + c);

    }
}
