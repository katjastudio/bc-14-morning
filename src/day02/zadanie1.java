package day02;

public class zadanie1 {
        public static void main(String[] args) {
            // найти площадь и периметр квадрата
            int squareSide = 8;
            square(squareSide);
            perimeter(squareSide);
        }

        public static void square(int a) {
            System.out.println("Площадь квадрата равна: " + a * a);
        }

        public static void perimeter(int a) {
            System.out.println("Периметр квадрата равен : " + 4 * a);
        }
    }