package day8;

public class HelloSwitch {
    public static void main(String[] args) {
        int schollNote = 2;
        System.out.println(schollNote);
        System.out.println(bonus(schollNote));

        bonus(schollNote);//2.
    }

    private static String bonus(int note) {//1. //3.String
        String output = "";
        switch (note) {// OPERATOR VIBORa, konstrukt
            case 5:
            output = "Velik"; //case -  slu4aj
                break;
            case 4:
            output = "GoPro7";
            break;
            case 3:
                output = "Nagradi ne budet";
                break;
            case 2:
                output = "Poterjannij cas i plohoe nastroenie";
                break;
            case 1:
                output = "Ne sprawivajte";
                break;

            default:
                output = "Takoj ocenki ne suwestv-et";
        }

        return output;
    }
}
