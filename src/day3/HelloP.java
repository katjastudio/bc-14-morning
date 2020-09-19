package day3;

public class HelloP {
    public static void main(String[] args) {
        double p = 3.14;
        double radius = 5.5;

        System.out.println(p * radius * radius);

        final double P2 = 3.14; // konstanta
        p = p + 1;
        System.out.println(p); //"flissComa Fehler, plavajuwaja zapjataja"

        //P2 = P2 + 1; tak delatj ne vozmozhno!

        double var1 = 1_000_000.0; // ne 1000000, a 1000000.0

        //1,0E + 6 //1 * 10^6 (10 v 6oj stepeni, exponicialnaja zapisj, MANTISSA? Nado umetj citatj cuzoj kod)

        double p3 = Math.PI;
        double var2 = Math.pow(2,3);// vozvedenie v stepenj 2 (...^2)
        System.out.println(var2);


    }
}
