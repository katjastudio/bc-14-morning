package day02;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //S kvadrata (S = a*a)
        int a = 16;
        System.out.println("Square area (S) = " + a * a);

        //P kvadrata (P = a * 4)
        square();

        System.out.println("");
        System.out.println("Task 2");
        rectangle();

        System.out.println("");
        System.out.println("Task 3");
        cube();

        System.out.println("");
        System.out.println("Task 4");
        //System.out.println("18446744073709551616");
        System.out.println("2^64-1 (Wikipedia) = 18_446_744_073_709_551_616 does not fit long )");
    }

    public static void square() {
        byte a = 16;
        System.out.println("Square Perimeter (P) = " + a * 4);
    }

    public static void rectangle() {
        short a = 5;
        short b = 11;
        System.out.println("Rectangle Perimeter (P) = "+ (a + b) * 2);
        System.out.println("Rectangle area (S) = " + a * b);

    }

    public static void cube() {
        int a = 3;
        System.out.println("Cube area (S) = " + a * 8);
        System.out.println("Cube perimeter (P) = " + 6 * (a * a));

    }

}
