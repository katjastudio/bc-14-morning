package day55;

public class ClassWork {
    public static void main(String[] args) {
        //String s1 = " Andrej";
        //System.out.println(helloName(s1)); // ". vibratj SOUT"
        //System.out.println(helloName(" Sergej")); // "vpisatj Sergej
        //System.out.println(helloName(" Anna Sergeevna")); // "vpisatj Anna Sergeevna
        System.out.println("Brutto Preis " + pirogiPreis(3) + '€');
    }

    public static double pirogiPreis(double nettoPreis) {
        double mwst = 5;
        double result = nettoPreis * mwst / 100 + nettoPreis;
        return result;

    }

    private static String helloName(String userName) {//tip dannih vpisatj
        return "Hello" + userName; //otsutstvie stakana
    }

}
