/*
package day12;

public class Exercise17 {
    public static void main(String[] args) {
        //17. Given three ints, a b c, return true if b is greater than a,
        // and c is greater than b. However,
        // with the exception that if "bOk" is true,
        // b does not need to be greater than a.
        //a, b, c, bOk (true false).

        System.out.println(inOrder(1, 2, 4, false));//→ true
        System.out.println(inOrder(1, 2, 1, false)); //→ false
        System.out.println(inOrder(1, 1, 2, true));  //→ true
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        //return bOk && c>b || b> a && c>b
        if (b > a && c > b) {

            return true;

        } else if (bOk && b <= a) {

            return false;
        }
    }
}*/
