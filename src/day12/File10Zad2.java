package day12;

public class File10Zad2 {
    public static void main(String[] args) {
        //2. Given an int n, return the absolute difference between n and 21,
        // except return double the absolute difference if n is over 21.

        System.out.println(diff21(19));//→ 2
        System.out.println(diff21(10)); //→ 11
        System.out.println(diff21(21)); //→ 0

        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90)); //→ true
        System.out.println(nearHundred(89)); //→ false
    }

    private static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10);
    }

    //3. Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.


    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }

    }
}
