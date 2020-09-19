package day2;

public class HomeWork01 {
    public static void main(String[] args) {
        //Najti S i Perimetr kvadrata
        int squareSide = 15;
        square(squareSide);
        perimeter(squareSide);
    }

    public static void square(int a ) {
        System.out.println("S kvadrata ravna: " + a * a);

    }

    public static void perimeter(int a) {
        System.out.println("P kv raven: " + 4 * a);

    }


}
