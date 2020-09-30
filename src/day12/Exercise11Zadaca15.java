package day12;

public class Exercise11Zadaca15 {
    public static void main(String[] args) {
        //  15. Given 2 ints, a and b, return their sum.
        //  However, "teen" values in the range 13..19 inclusive,
        //  are extra lucky. So if either value is a teen, just return 19.
        System.out.println(teenSum(3, 4)); //→ 7
        System.out.println(teenSum(10, 13)); //→ 19
        System.out.println(teenSum(13, 2)); //→ 19

        //16. Given a string str, if the string starts with "f" return "Fizz".
        // If the string ends with "b" return "Buzz".
        // If both the "f" and "b" conditions are true, return "FizzBuzz".
        // In all other cases, return the string unchanged. (See also: FizzBuzz Code)

        System.out.println(fizzString("fig")); //→"Fizz"
        System.out.println(fizzString("dib")); //→"Buzz"
        System.out.println(fizzString("fib")); //→"FizzBuzz"


    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {

            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";

        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    private static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }
}
//Posle skobki ostavljaem pustuju strochku ROW (dlja githuba)