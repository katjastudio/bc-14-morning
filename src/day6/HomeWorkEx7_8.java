package day6;

public class HomeWorkEx7_8 {
    public static void main(String[] args) {
        //7. Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
        // 8. Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
        String s1 = "Вход разрешён";
        String s2 = "воспрещён";
        System.out.println(replace(s1, s2));
        split();

        String s3 = "Осторожно, вход воспрещён";
        System.out.println(s3.toUpperCase());

    }

    private static void split() {
        System.out.println("-------");
    }


    private static String replace(String s1, String s2) {
        return s1.substring(0, s1.length() - 1 - 8) + " " + s2;
    }
}
