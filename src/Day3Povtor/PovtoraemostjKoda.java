package Day3Povtor;

public class PovtoraemostjKoda {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        multiplication(a, b);
        addition(a, b);

    }
     public static void multiplication(int a, int b) {
        System.out.println("Proizvedenie " + a * b);
    }
    public static void addition(int a, int b) {
        System.out.println("Slozhenie " + (a + b));
    }
}