package day7;

public class HelloAntivalencXor {
    public static void main(String[] args) {
        boolean a = false, b = true, c;
        System.out.println(c = a ^ b);
        System.out.println(c = a & b);
        findBool(a, b);
        System.out.println(findBool2(a, b));
        System.out.println("a = " + findBool3());

        System.out.println("b= " + findBool4());
        System.out.println("c= " + findBool5());
        System.out.println("d= " + findBool6());
        System.out.println("e " + findBool7());
    }

    private static boolean findBool7() {
        return !(3 * 4 < 7 + 8);
    }

    private static boolean findBool6() {
        return 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
    }

    private static boolean findBool5() {
        return 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
    }

    private static boolean findBool4() {
        return (7 + 8) * 4 != 7 + 4 * 5;
    }

    private static boolean findBool3() {
        return (7 + 8) * 5 > 7 + 8 * 5;
    }

    private static boolean findBool2(boolean a, boolean b) {
        return a ^ b;
    }

    public static void findBool(boolean a, boolean b) {
        System.out.println(!a);
    }
}
