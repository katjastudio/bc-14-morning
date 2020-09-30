package day16;

public class WhileDoWhileHomeW {
    public static void main(String[] args) {
/*        21. Даны целые числа A и B, где B > 0. Вывести B раз число A.
            .*/

        int a = 5;
        int b = 3;
        while (b > 0) {

            System.out.println(a);
            b--;
        }
        System.out.println();
        //22.Вывести в порядке возрастания все числа между А и B,где а=5,а B=17
        b = 17;
        do {
            a++;
            System.out.println(a);
        } while (a < b-1);

    }

}
