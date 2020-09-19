package day9;

public class ItsMyLife {
    public static void main(String[] args) {
       // loop();
        forIntroduction();

    }

    private static void forIntroduction() {
        int a =0;
        for (int i = 2; i < 10; i++){
            a++;
        }
        for (int i = 0; i < 20; i++){
            a++;
        }
        System.out.println(a);
    }

    private static void loop() {
        int workWeekDays = 5;
        int j = 0; //DEKLARIRUEM i nulem
        // poka i < workWeekDays

        j = j + 1;
        //nachalo uslovija
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("------------");
            System.out.println("Novij denj");
            System.out.println("Vstaju v 6 utra");
            System.out.println("Na zavod v 8 utra");
            System.out.println("Doma snova v 18");
            System.out.println("2 chasa dlja Netflix");
            System.out.println("Sigareta");
            System.out.println("Denj podhodit k koncu");
            System.out.println("Spatj");
            System.out.println("------------");

        }
    }
}
