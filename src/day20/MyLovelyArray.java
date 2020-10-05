package day20;

public class MyLovelyArray {
    public static void main(String[] args) {
        // myOldTypeInt();
        //myNewTyperArrayInt();
        int[] source = new int[]{1, 2, 3};
        int[] copy = getMeArrayCopy(source);
        System.out.println(copy[2]);
    }

    private static int[] getMeArrayCopy(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i]=input[i];

        }
        return output;
    }

    private static void myNewTyperArrayInt() {
        int a = 10;
        int b = 50;
        int[] myNewArray = new int[]{a, b};//videli mne pod eti simboli 2 MESTA!
        int[] anotherArray = new int[10]; //default zancenoie = 0!!!! boolean = false
        // int[] thirdArray = {1, 2, 3, 4, 5}//NADO zau4itj pravilno!!! Tek ne prinimajut!
        int[] secondArray = myNewArray;
        System.out.println(myNewArray[0]);
        System.out.println(myNewArray[1]);
        System.out.println(myNewArray[myNewArray.length - 1]);
        secondArray[1] = secondArray[1] + 100;
        System.out.println(secondArray[1]);
        System.out.println(myNewArray[1]);//MASSIV odin, na nego pojavilisj 2 ssilki!!!

    }

    private static void myOldTypeInt() {
        //32bit
        int a = 10;
        int b = a;
        b += 5;
        System.out.println(b);
        System.out.println(a);

    }
}
