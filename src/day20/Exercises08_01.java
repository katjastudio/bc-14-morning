package day20;

public class Exercises08_01 {
    public static void main(String[] args) {
/*        1. Заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
                Для генерации случайного числа используйте метод Math.random(),
                который возвращает значение в промежутке [0, 1].*/
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = new int[10];
        int max;
        int min;
        double avg;
        int sum;


        for (int i = 0; i < arr.length; i++) {
            // int myRandomTemp = (int) ((max - min) * Math.random() + 1) + min;
            int myRandomTemp = (int) ((100 - 0) * Math.random() + 1) + 0;//0-100 slu4. cislo
            arr[i] = myRandomTemp;

        }
        //System.out.println(arr);
        myPrintIntArray(arr);

        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("AVG: " + avg);
    }

    public static void myPrintIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ",");
        }
        System.out.println();
    }
}

