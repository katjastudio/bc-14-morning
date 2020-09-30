package day12;

public class HomeWork13 {
    public static void main(String[] args) {

        //Given a number n, return true if n is in the range 1..10, inclusive.
        // Unless outsideMode is true,
        // in which case return true if the number is less or equal to 1, or greater or equal to 10.

        System.out.println(in1To10(5, false)); //→ true
        System.out.println(in1To10(11, false)); //→ false
        System.out.println(in1To10(11, true)); //→ true
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10) {
            return true;

        } else if (n <= 1 || n > 10 && outsideMode == true) {
            return true;

        } else {
            return false;
        }

    }
}
