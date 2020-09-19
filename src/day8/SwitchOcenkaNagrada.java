package day8;

public class SwitchOcenkaNagrada {
    public static void main(String[] args) {
        int ocenkaVChetverti = 5;
        String reakcijaNaOcenku;

        switch (ocenkaVChetverti){
            case 5:
                reakcijaNaOcenku = "велосипед";
                break;

            case 4:
                reakcijaNaOcenku = "GoPro4";
                break;

            case 3:
                reakcijaNaOcenku = "наверное, не будут ругать";
                break;

            case 2:
                reakcijaNaOcenku = "отругают";
                break;

            case 1:
                reakcijaNaOcenku = "убьют";
                break;

            default:
                reakcijaNaOcenku = "Такой оценки не существует";
                break;
        }
        System.out.println(reakcijaNaOcenku);
    }
}
