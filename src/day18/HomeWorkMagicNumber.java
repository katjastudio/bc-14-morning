package day18;

import java.util.Scanner;

public class HomeWorkMagicNumber {
    public static void main(String[] args) {
/*        Компьютер загадывает число от 1 до n.
        У пользователя k попыток отгадать. После каждой неудачной попытки компьютер сообщает
        меньше или больше загаданное число.
                В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).*/
        // int index = (int) ((Math.random() * (max - min) + 1) + min);

        Scanner input = new Scanner(System.in);

        int n = 100; //sgenerirovali chislo
        int rand = (int) ((Math.random() * (n - 1) + 1) + 1);
        int tests = 7;

        System.out.println("Guess the number fom 1 to " + n);
        int x;
        while (true){
            System.out.println("You have " + tests + " tries");

            System.out.println("Enter number?");
            x = input.nextInt();
            if (x == rand) {
                System.out.println("You won");
                break;
            } else if (rand < x) {
                System.out.println("Less!");

            } else if (rand > x) {
                System.out.println("More!");
            }

            tests--;

            if (tests < 1) {
                System.out.println("You loose. Game over.");
                break;
            }
        }
    }
}
