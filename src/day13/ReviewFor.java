package day13;

public class ReviewFor {
    public static void main(String[] args) {
        // exampleOne();//ZAKOMENTIROVATJ chtobi ne mewal vidache SOUT
        //  exampleTwo();
        //exampleThree();
        //exampleFour();
        //exampleFive();


    }

    private static int exampleFive() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        if (true) return 0;
        else return 10;
    }

    private static void exampleFour() {
        int i = 0;
        for (; i < 10; ) {
            System.out.print(" " + i + "");
            i++;//rabotaet v CIKLe
        }
    }

    private static void exampleThree() {
        for (int i = 1; i < 100; i = i + 2) { //i*=2; i+=2
            System.out.println(i);
        }

    }

    private static void exampleTwo() {
        for (int i = 100; i > 0; i++) {
            System.out.println(i);
        }
    }

    private static void exampleOne() {
        for (int i = 0; i < 10; i--) { //i=i-1
            System.out.println(i);
        }
    }
}
