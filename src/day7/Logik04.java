package day7;

public class Logik04 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(true, false));
    }

    private static boolean bigBadaBoom(boolean b, boolean b1) {
        return b & b1;
    }
}
