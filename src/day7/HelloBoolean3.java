package day7;

public class HelloBoolean3 {
    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = false;
        c = a & b;
        System.out.println("1. " + c);//smotretj tabl.istinnosti

        int d = 1, f = 2;
        boolean bool = d <= f;
        System.out.println("2." + bool);

        int i = 10;
        int j = 9;
        System.out.println("3. " + (i > j));
        System.out.println("4. " + (10 == 15));

        int x = 10;
        System.out.println("5. " + (x == 10));
    }
}
