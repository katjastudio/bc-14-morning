package day21;

public class Hw20 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(array);
        System.out.println("Sum elemenetika Massiva: " + sum);
        int min = findMin(array);
        System.out.println("Minimaljnij element massiva: " + min);
        int max = giveMax(array);
        System.out.println("Maximaljnij element massiva: " + max);

        double average = tellMeAverage(array);
        System.out.println("Average:" + average);

    }

    private static double tellMeAverage(int[] input) {
        return (double) getSum(input) / input.length;
    }

    private static int giveMax(int[] array) {
        int max = Integer.MIN_VALUE;
        max = array[0];
        //min = 0;//Owibka!!!
        for (int i = 0; i < array.length; i++) {
            // min = Math.min (min,array[i]);
            max = (max > array[i]) ? max : array[i]; //Ternary operator.
        }

        return max;
    }

    private static int findMin(int[] array) {
        int min = Integer.MIN_VALUE;
        min = array[0];
        //min = 0;//Owibka!!!
        for (int i = 0; i < array.length; i++) {
            // min = Math.min (min,array[i]);
            min = (min < array[i]) ? min : array[i]; //Ternary operator.
        }

        return min;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int elementik : array)
            sum = sum + elementik;
        {

        }
        return sum;

    }

}

