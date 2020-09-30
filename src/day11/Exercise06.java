package day11;

public class Exercise06 {
    public static void main(String[] args) {
        //Трое неизвестных
        //нужно написать алгоритм вывода на экран всех возможных комбинаций
        // 3-х натуральных чисел до 36 с определенными условиями:
        //1. необходимо использовать вложенные циклы 2. x <= y <= z
        //3. xyz = 36
        //например:
        //1. x=1, y=1, z=36 2.
        // x=1; y=3; z=12
       // threeNumber();
        threeAngle(10);//sjuda dobavljaem 10
    }

    private static void threeAngle(int lines) {
        String star = "*";
        String myLine = "";
        for (int i = 0; i < lines; i++) {
            myLine = myLine + star;
            System.out.println(myLine);

        }
    }

    private static void threeNumber() {
        int count = 1;
        for (int x = 1; x <=36 ; x++) {
            for (int y = x; y <=36; y++) {
                for (int z = y; z <=36; z++) {
                    if(x*y*z ==36){
                        System.out.println(count + " Variant, gde " + "x=" + x + ", y = " + y + ", z ="+ z);
                        count++;
                    }
                }

            }

        }

    }
}
