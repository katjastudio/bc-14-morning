package day21;

public class ClassWork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 10, 4};
        int[] newMassiv = arr;
        System.out.println(arr);
        myPrint(arr);
    }

    private static void myPrint(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(" " + input[i]);

        }
    }
}
