package day16;

public class TernaryOperatorHomeWork {
    public static void main(String[] args) {
       /* 11. Даны два числа, a и b.
        Верните большее из них.
        Не используйте никаких методов из библиотеки Math.
        Покажите работу тернарного оператора.*/

        System.out.println(getMeMax(15, 5)); //->15
        System.out.println(getMeMax(4, 16)); //->16
        System.out.println(getMeMax(20, 100));//->100

      /*  12.Даны два числа, a и b.
        Верните меньшее из них.
        Не используйте никаких методов из библиотеки Math.
                Покажите работу тернарного оператора.*/
        System.out.println();
        System.out.println(getMeMin(15, 45)); //→ 15
        System.out.println(getMeMin(44, 16)); //→ 16
        System.out.println(getMeMin(200, 100)); //→ 100

       /* 13.Даны два строковых значения.
        Верните идущее по алфавиту раньше.*/

        System.out.println();
        System.out.println(myFirstCompareTo("Berlin", "Moscow")); // → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
    }

    private static String myFirstCompareTo(String a, String b) {
        return a.compareTo(b) < 0 ? a : b;//a<b (lexographycal) =>Berlin<Moscow =>otricat.chislo, result <0

    }

    private static int getMeMin(int a, int b) {
        return a < b ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return a > b ? a : b;//if a>b => true => vipolnjaetsa "a", if a>b =>false=>vipolnjaetsa "b"
    }


}
