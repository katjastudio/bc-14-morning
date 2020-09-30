/*
package day12;

public class Exercise91011 {
    public static void main(String[] args) {

        //9. Given a string,
        // if the string begins with "red" or "blue"
        // return that color string, otherwise return the empty string.

        System.out.println(seeColor("redxx")); //→"red"
        System.out.println(seeColor("xxred")); //→""
        System.out.println(seeColor("blueTimes")); //→"blue"

        //10.Given a string, return a new string made of 3 copies
        // of the first 2 chars of the original string.
        // The string may be any length.
        // If there are fewer than 2 chars, use whatever is there.

       */
/* System.out.println(extraFront("Hello")); //→"HeHeHe"
        System.out.println(extraFront("ab")); // →"ababab"
        System.out.println(extraFront("H")); // →"HHH"*//*


        //   11. Given a string and a second "word" string,
        // we'll say that the word matches the string
        //if it appears at the front of the string, except its
        //first char does not need to match exactly. <----- !!!
        // On a match,return the front of the string, or otherwise return the empty string.
        // So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
        // The word will be at least length 1.

        startWord("hippo", "hi") →"hi"
        startWord("hippo", "xip") →"hip"
        startWord("hippo", "i") →"h"


    }

    private static String startWord(String str, String word) {
        if(str.startsWith(word)){
            return word;
        }else if(str.substring(1).startsWith(word.substring(1))){
            return str.substring(0,1) + word.substring(1);

            }else{
            return str.substring(0,1);
        }

        return "";
    }

   */
/* private static String extraFront(String str) {// OBLASTJ VIDIMOSTI (eng. Scope)!!!
        if (str.length() < 2) {
            return

        }

        return "";
    }*//*


    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) { //
            return "blue";
        } else {
            return "";
        }


    }
}
*/
