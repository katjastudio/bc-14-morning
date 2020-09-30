package day13;

public class DomawneeZadanieDay13 {
    public static void main(String[] args) {
        myContains();
        myEquals();//sootv.
        myTrim();
    }

    private static void myTrim() {
        String test = "  Ja pamjatnik vozdvig sebe nerukotvornij  ";
        System.out.println(test);
        System.out.println(test.trim());
    }

    private static void myEquals() {
        String test1 = "Vasilij";
        String test2 = "Василий";
        System.out.println(test1.equals(test2));
    }

    private static void myContains() {
        String hm = "Vasilij";
        String etalon = "w";//zakancivaetsa li eto slovo
        System.out.println(hm.contains("w"));


    }
}
