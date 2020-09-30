package day16;

public class MagicLoop {
    public static void main(String[] args) {

        System.out.println(convertDecemalToBinary(78));//peredaem "78"
    }

    private static String convertDecemalToBinary(int decimal) {//rabotaem so Stringom //prinimaem "int decimal"
        String output = "";
        int reminder;
        while (decimal > 0) {
            reminder = decimal % 2;
            output = reminder + output;//perestanpvka mest slogaemih, hvost ili golova poezda!!!!!!!!!!!!!
            decimal = decimal / 2;// umenjwaetsa v 2 raza, poka on > 0!!!! Nawa proga zakancivaetsa
        }


        return output;//
    }
}
