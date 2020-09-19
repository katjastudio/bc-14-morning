package day6;

public class HelloString2 {
    public static void main(String[] args) {
        String poema = "Ja pamjatnik vozdvig sebe nerukotvornij.";
        int dlina = poema.length();
        System.out.println(dlina); //"Ja" - "0", scitaet ot Ja, probeli do tocki vkluc.!!!

        String preview = poema.substring(0,12);//ot 0 do 12 hocu pos4itatj simboli
        System.out.println(preview + "...");

        String endPOema = poema.substring(dlina - 12);///!!!
        System.out.println(endPOema);

        char test = poema.charAt(0); //daem INDEX "0". peredali 0
        System.out.println(test);

        //char test2 = poema.charAt(dlina);
        //System.out.println(test2); v etom bloke vidaet owibku!!!

        char test2 = poema.charAt(dlina-1);
        System.out.println(test2);


    }

}
