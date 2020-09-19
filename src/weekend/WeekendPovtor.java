package weekend;

public class WeekendPovtor {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println("Chislo PI: " + pi);
        double pi2 = Math.round(pi);
        System.out.println("Math.round: " + pi2);
        int pi3 = (int) Math.round(pi);// bilo "int pi3 = Math.round(pi);", Cast to 'int'. Avtomaticheskoe kastovanie!
        System.out.println(pi3);

        double pi4 = Math.ceil(pi);//Math.ceil
        System.out.println("Math.ceil: " + pi4);

        double pi5 = Math.floor(pi);
        System.out.println("Math.floor: " + pi5);
    }
}
