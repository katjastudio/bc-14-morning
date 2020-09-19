package weekend;

public class Cf {
    public static void main(String[] args) {
        //C = 2 * PI * r
        double r = 10;
        double cf = calcCF(r);
        System.out.println(calcCF(r));

        System.out.println(roundCF(cf));


    }
    private static double calcCF(double r) {
        return 2 * Math.PI * r;
    }

    private static double roundCF(double x) {
        return Math.round(x * 100) / 100.0;
    }


}
