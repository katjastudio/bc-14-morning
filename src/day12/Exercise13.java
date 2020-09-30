package day12;

public class Exercise13 {
    public static void main(String[] args) {
        //6. Given a string, return true if it ends in "ly".
        System.out.println(endsLy("oddly"));//→true
        System.out.println(endsLy("y")); //→false
        System.out.println(endsLy("oddy")); //→false

        //8. Given 2 strings, a and b,
        // return a new string made of the first char of a and the last char of b,
        // so "yo" and "java" yields "ya".
        // If either string is length 0, use '@' for its missing char.

        System.out.println(lastChars("last", "chars")); //→"ls"
        System.out.println(lastChars("yo", "java")); // →"ya"
        System.out.println(lastChars("hi", "")); //→"h@"
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.charAt(0) + b.substring(b.length() - 1);

    }

    private static boolean endsLy(String str) {


        return str.endsWith("ly");//6. Given a string, return true if it ends in "ly".
    }
}
