package day4;

public class MyLovelyString {
    public static void main(String[] args) {
        String myFirstString = "Eto moe pervoe predloewenie.";
        System.out.println(myFirstString);
       String s1 = ""; // stakan, tam nicego net
       String s2 = " ";// net stakana

        String result =
                "Moe vtoroe predlowenie. "
                        + myFirstString
                        + " Moe tretje pred-ie. "
                        + s2;
        System.out.println(result);
    }
}
