/*
package day21;

import day20.FillAndPrintIntArray;

public class ClassWork2 {
    public static void main(String[] args) {
        // 1 .Даны два целых числа,
        // создайте массив с чётными числами в этом диапазоне.
        // создайте массив с простыми числами в этом диапазоне.
        //  int[] arr = new int[]{30, 50};
        int a = 1;
        int b = 10;
        int[] arr = createEvenArray(a, b);
    }

    private static int[] createEvenArray(int a, int b) {
        //int size = ((b - a) % 2 == 0) ? (b - a) / 2 : (b - a + 1) / 2;
        System.out.println("Razm. massiva: " + size);
        // int[] output = new int[b - a];
        //int[] output = new int[size];
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {//na 2 bez ostatka //RAZMER MASSIVa
              count++;//RAZMER MASSIVa
            }

        }

        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {//na 2 bez ostatka //RAZMER MASSIVa
                output[count] = i;
                count++;
            }
        }
    }
}*/
