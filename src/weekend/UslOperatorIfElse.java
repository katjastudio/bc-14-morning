package weekend;

public class UslOperatorIfElse {
    public static void main(String[] args) {
        if (15 > 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (17 >= 7) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean deti_spjat = true;
        if (deti_spjat) {
            System.out.println("postavj puljt na volume 3");
        } else {
            System.out.println("pustj igraet gromoko TV");
        }


        int a = 5;
        final int SUPERCONSTANT_G = 10;
        if (a > SUPERCONSTANT_G) {
            System.out.println("Pervonacaljnoe uskorenie nedotstocno");
            System.out.println("Raketa ne mowet startovatj");
            System.out.println("Podgotovitj avarijnoe sluzhbi");
        } else {
            System.out.println("Raketa uletaet v kosmos");
            System.out.println("Vipustit press-reliz ob uspewnom zapuske");
            System.out.println("Podgtovitj programmistov k gos.nagradam");

        }

        int vozrastPokupatelja = 17;
        if (vozrastPokupatelja < 16) {
            System.out.println("Alkogolj i sigareti prodavatj NELJZJA!");
        } else if (vozrastPokupatelja >= 18) {
            System.out.println("MOZHNO pordavatj alkogolj i sigareti");
        } else {
            System.out.println("Vodku prodavatj nelza, pivo i sigareti mowno");

        }



    }


}

