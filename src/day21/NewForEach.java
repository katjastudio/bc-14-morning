package day21;

import com.sun.codemodel.internal.JForEach;
import day20.FillAndPrintIntArray;

public class NewForEach {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        //forIMethode(arr);
        forEachMethode(arr);
    }

    private static void forEachMethode(int[] arr) {
        for (int element : arr) {
            // element = element + 1; //NE OBRAWAETSA NAPRJAMUJU k ELEMENTU!!!!!!
            //  element += 1;
            //   element++;
            System.out.println(element + " ");

        }
       // FillAndPrintIntArray.myPrintIntArray(arr);
    }

    private static void forIMethode(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;//Uvelicitj na 1!!!
            arr[i] += 1;//Uvelicitj na 1!!!
            arr[i]++;//Uvelicitj na 1!!!

        }
        FillAndPrintIntArray.myPrintIntArray(arr);
    }
}
