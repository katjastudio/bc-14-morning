package day16;

public class ReallyGreatLoops {
    public static void main(String[] args) {
        //loopForI();
        //whileLoop();
        doWhileLoop();


    }

    private static void doWhileLoop() {//3.
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 9);
    }

    private static void whileLoop() {//2.
        System.out.println("-------");
        int i = 10;
        while (i < 20) {//WHILE proverjaet uslovie, i vhodit v telo CIKLa
            System.out.println(i);//do teh por, poka. Poka ne polu4ili otvet, poka ne gdostig...
            i++;
        }

    }

    private static void loopForI() {//1.
        System.out.println("-------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);


        }

        for (int j = 20; j > 15; j--) {
            System.out.println(j);
        }

    }
}
