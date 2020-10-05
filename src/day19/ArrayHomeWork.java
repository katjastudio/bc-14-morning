package day19;

public class ArrayHomeWork {
    public static void main(String[] args) {

        //1. Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random(),
        // который возвращает значение в промежутке [0, 1].

        System.out.println(homeWork18_01());// RUN pokazal [D@610455d6 - pamjatj,
        // gde hranitsa massiv, SSILKA na peremennuju, SLOZHNIE tipi dannih, oni tjawelie.
        myFirstArrayDoublePrint(homeWork18_01());
    }

    private static void myFirstArrayDoublePrint(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]); //elementov 0

        }
    }

    private static double[] homeWork18_01() {
        double[] output;
        output = new double[10]; // v nem 10 elementov
        // output[1] = 25.85;
        output[1] = 25.85;
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random();
        }
        //return new double[0]; //-> " return output;"
        return output; //printed 10 elementov 0.0x10

    }
}
