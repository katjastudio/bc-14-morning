package day11;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
    }

    private static int dateFashion(int you, int date) {
        if (you <= 2 ||date <= 2) {
            return 0;
        } else if (you >= 0 || date >= 0) {
            return 2;
        }
        return 1;


    }
}
