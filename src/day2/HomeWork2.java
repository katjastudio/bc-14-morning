package day2;

import java.math.*;

public class HomeWork2 {
    public static void main(String[] args) {
        byte se = 5;
        System.out.println("Square space is " + squareSpace(se) + " m2. for a square with an edge eq. " + se + "m.");
        System.out.println("Square perimeter is " + squarePerimeter(se) + "m. for a square with an edge eq. " + se + "m.");
        System.out.println("");

        short ra = 5;
        short rb = 10;
        System.out.println("Rect. space is " + rectangeSpace(ra, rb) + " m2. for a rect. with  " + ra + " and " + rb + "m long edges");
        System.out.println("Rect. perimeter is " + rectangePerimeter(ra, rb) + "m. for a rect. with " + ra + " and "+ rb + "m long edges");
        System.out.println("");

        byte ca = 27;
        System.out.println("Cube space is " + cubeSpace(ca) + "m2. for a cube with an edge eq. 5m.");
        System.out.println("Cube perimeter is " + cubeSpace(ca) + "m. for a cube with an edge eq. 5m.");
        System.out.println("");

        System.out.println("Total count of corns on a chess board is " + cornCount());
        System.out.println("");
    }

    public static byte squarePerimeter(byte a) {
        return (byte) (a * 4);
    }

    public static byte squareSpace(byte a) {
        return (byte) (a * a);
    }

    public static short rectangePerimeter(short a, short b) {
        return (short) (a * 2 + b * 2);
    }

    public static short rectangeSpace(short a, short b) {
        return (short) (a * b);
    }

    public static int cubePerimeter(int a) {
        return 8 * a;
    }

    public static int cubeSpace(int a) {
        return a * a * 6;
    }

    public static BigInteger cornCount() {
        // summa budet:
        //   1 + 2 + 4 + 8 .. (64 raza vsego)
        // formula iz wikipedii: 2^64 -1
        // no 2^64 ne vlezaet v long.
        // poetomu ispolzuem booolshoj int: https://www.tutorialspoint.com/java/math/biginteger_pow.htm

        BigInteger b1, b2, b3, one;
        int exponent = 64;
        b1 = new BigInteger("2");
        b2 = b1.pow(exponent);

        one  = new BigInteger("1");
        b3 = b2.subtract(one);

        return b3;
    }
}
