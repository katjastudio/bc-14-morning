package day6;

public class HomeWorkDay06 {
    public static void main(String[] args) {
        String s1 = "last";
        String s2 = "chars";

        String s3 = "yo";
        String s4 = "java";

        System.out.println("\"" + firstLast(s1, s2) + "\"");
        System.out.println(firstLast2(s3, s4));

    }

    private static String firstLast2(String s3, String s4) {
        return s3.substring(0,1) + s4.substring(s4.length() -1);
    }

    private static String firstLast(String s1, String s2) {
        // return s1.substring(0,1) + s2.substring(4);
        return s1.substring(0, 1) + s2.substring(s2.length() - 1); //chars =>(01234)-1 = 5-1 =>4 (index poslednej bukvi)
    }
}
