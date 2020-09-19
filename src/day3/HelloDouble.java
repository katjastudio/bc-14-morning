package day3;

public class HelloDouble {
    public static void main(String[] args) {
        double a, b, c, d; //inizializacia v "double" i v "float"  mowno hranitj desaticnie dannie
        a = 5.0;// drobniecisla
        b = 3.0;//drobnie
        c = 7.0;//drobnie
        d = a / c;//5.0 / 7.0 = 0.714...
        System.out.println(d);

        int var1 = 3;// var1 = peremennaja
        int var2 = 5;
        double var3 = var1 / var2;//3 / 5 = 0.6
        System.out.println(var3); // 3/5 polucaetsa 0.0 o celih, o desatih,  o zapisalsa v doublr 3/5=celoe cislo, delenie
        // delenie celoe cislo, zapisalsa v drobnoe, int vhodit v double!!! Avtomaticeskij casting!!!
    }
}