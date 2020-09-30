package day16;

import java.sql.SQLOutput;

public class CaesarCipher {
    public static void main(String[] args) {
        /*Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
        Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
        Пример выполнения метода:
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
        "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."*/

        final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz .";
        final String cba = "mnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi .jkl";
        System.out.println("Encrypt: ");
        System.out.println(encrypt("The quick brown fox jumps over the lazy dog.", abc, cba));
        System.out.println("Decrypt: ");
        System.out.println(encrypt("FTQkcgUOWkNdaiZkRa kVgYbekahQdkfTQkXMj.kPaSl", cba, abc));

    }

    private static String encrypt(String text, String abc, String cba) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            int index = abc.indexOf(c);
            char c2 = cba.charAt(index);
            result += c2;

        }
        return result;
    }
}
