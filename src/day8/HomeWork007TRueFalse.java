package day8;

public class HomeWork007TRueFalse {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
    }

    private static boolean love6(int a, int b) {
        boolean result = (a == b) || (a == 6) || (a + b ==6) || (Math.abs(a - b) == 6);
        return result;
    }
}
