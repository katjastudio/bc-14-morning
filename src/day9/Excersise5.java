package day9;

public class Excersise5 {
    public static void main(String[] args) {
        //1. Счастливый пельмень
        //Существует такая традиция: при приготовлении пельменей в один из них кладут монетку на счастье.
        // Считается, что тому, кому попадется пельмень с монеткой, улыбнется удача.
        //Представим, что у нас есть кастрюля, в которой лежит 10 пельменей.
        // Один из них счастливый — а именно пятый пельмень.
        //Давайте напишем программу, которая ищет счастливый пельмень. Программа перебирает пельмени в кастрюле по одному,
        //и когда доходит до пятого пельменя — напишет "Вот счастливый пельмень!" и выходит из цикла.

      //4. Последовательность (1000)
       // Необходимо вывести на консоль такую последовательность чисел:
      //  mySecondLine(1000) ->
     //   1 2 4 8 16 32 64 128 256 512


      // happyPelmenj();
       // moduloThree();
       // myLine();
        mySecondLine();
    }
    private static void mySecondLine() {
        for (int k = 1; k < 1000; k *= 2) {
            System.out.print(k + " ");
        }
    }

    //3. Последовательность (100)
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    // myLine(100) ->
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98

    private static void myLine() {
        for (int j = 7; j < 100; j = j + 7) { //i +=7
            System.out.print(j + " ");

        }

    }

    private static void moduloThree() {
        for (int i = 0; i < 100; i++) {
            //System.out.println(i);
            if (i % 3 == 0) ;
            System.out.print(" " + i);
        }

        }

    private static void happyPelmenj() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                System.out.println("Mi pojmali Scastlivij pelmenj");
                break;//zakancivaem BREAKom
            }
            System.out.println("Schag cikla ");

        }
    }
}
