package day7;

public class HelloBoolean2 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        boolean bool = a <= b;// ->true
        System.out.println("Owidaem true, poluchaem: " + bool);
        findBool(7,4);
    }

    private static void findBool(int c, int d) {
        boolean bool = c <= d;// -> false
        System.out.println("Owidaem false, poluchaem: "+ bool);
    }
}

