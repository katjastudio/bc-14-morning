package day6;

public class HelloString {
    public static void main(String[] args) {
        String student1, student2;//2.zdesj ZADEKLARIROVALA, ZADEFINIROVALI
        student1 = "Jelena Prekrasnaja";//3. mi proinizializirovali
        student2 = "Ivan Durak";//4. mi proinizializirovali
        //final double MY_PI = Math.PI;//konstanta "Math.PI"

        helloUser(student1);
        helloUser(student2);
        helloUser("Andrey");

        char c1 = 150;
        char c3 = (char) (c1 + 20);
        System.out.println(c1 + 10);//ne znak konkatenacii, a  plusuet

        char c2 = 150;
        System.out.println("" + c2 + 10);
        System.out.println("" + c3 + 10);


    }

    private static void helloUser(String username) {
        System.out.println("Hello, " + username + "!");
    }
}
