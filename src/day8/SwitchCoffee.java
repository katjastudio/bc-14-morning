package day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int a = 2; //nomer knopki v kof.avtomate
        switch (a) {

            case 1:
                System.out.println("Kofe AMERICANO gotovitsa");
                break;

            case 2:
                System.out.println("Kipjatok sejchas budet");
                break;

            case 3:
                System.out.println("Kakao uzhe v puti");
                break;

            case 4:
                System.out.println("Voda kipjatitsa");
                System.out.println("Kofe melets");
                System.out.println("Slivki dobavljajutsa");
                break;

            default:
                System.out.println("Povtorite svoj vibor, napitok pod nomerom: " + a + " Vremenno ne dostupen");
                break;

        }
        System.out.println("Programma otrabotana bez owibok");
    }
}