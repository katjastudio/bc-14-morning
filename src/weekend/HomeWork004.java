package weekend;

import java.sql.SQLOutput;

public class HomeWork004 {
    public static void main(String[] args) {
        //1. Find funny characters
        System.out.println("");
        System.out.println("Task 1, find funny character:");
        char smile = '\u263A';// U+263A bilo
        System.out.println("  smile " + smile);

        char phone = '\u2706';
        System.out.println("  phone " + phone);

        char chess = '\u2654';
        System.out.println("  chess " + chess);

        char copyright = '\u00A9';
        System.out.println("  copyright " + copyright);

        System.out.println("");
        System.out.println("Task 2, charmap is not avaliable on MAC. ");

        System.out.println("");
        System.out.println("Task 3");
        System.out.println("UNICODE\nASCII\nUTF\n - got it");

        System.out.println("");
        System.out.println("Task 4");//
        String myString = "kate";
        System.out.println(myString + myString); //Konkotenation is avaliable.
       // System.out.println(myString * myString); // Multiplication does not exist.

        System.out.println("");
        System.out.println("Task 5");
        System.out.println("Kate is a \"software developer\". ");

        System.out.println("");
        System.out.println("Task 6");
        System.out.println("Firstname: Kate\nLastname: Meinarte\nAddress: Palmkernzeile 9, 10245, Berlin\nPhone: 0177_425_80**");




    }
}
