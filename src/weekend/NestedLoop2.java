package weekend;

public class NestedLoop2 {
        public static void main(String[] args) {
            //loop();
            //forIntroductionOne();
            forIntroductionTwo();

        }

        private static void forIntroductionTwo() {
            for (int i = 1; i < 10; i *= 2) {
                System.out.println("Шаги" + i);
            }
        }

        private static void forIntroductionOne() {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                a++;
            }
            for (int i = 0; i < 20; i++) {
                a++;
            }
            {
                int b = 5;
            }

            int i = 10;
            System.out.println(a);
            System.out.println(i);
        }
}
