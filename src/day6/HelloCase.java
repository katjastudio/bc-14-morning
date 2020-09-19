package day6;

public class HelloCase {
    public static void main(String[] args) {
        String source = "london is the capital of great britain";
        System.out.println(source);

        String phrase2 = source.toUpperCase();// tipa Caps lock
        System.out.println(phrase2);

        String phrase4 = source.substring(0, 1).toLowerCase()
               + source.substring(1);
        System.out.println(phrase4);

        String phrase3 = source.substring(0, 1).toUpperCase()
                + source.substring(1);
        System.out.println(phrase3);
    }
}
