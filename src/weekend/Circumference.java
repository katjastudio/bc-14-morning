package weekend;

public class Circumference {
    public static void main(String[] args) {
        double radius = 10; //4. propisatj double radius = 10

        System.out.println(roundTo(findCF(radius), 1));
        //7. "findCF(radius);" postavitj to4ku => findCF(radius).sout => System.out.println(findCF(radius));

    }

    private static double findCF(double myRadius) {//3. "void" zemenitj na "double" 6. prinimaju radius ("double myRadius")
        return 2 * Math.PI * myRadius;

    }

    private static double roundTo(double value, int digits) {
        double k = Math.pow(10.0, digits);
        return Math.round(value * k) / k;
    }
}
