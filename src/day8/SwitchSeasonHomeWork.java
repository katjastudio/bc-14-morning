package day8;

public class SwitchSeasonHomeWork {
    public static void main(String[] args) {
        //Напишите программу, которая определяет сезон года. Месяца указаны int переменными.
        int monat = 9;
        String jahresZeit;
        switch (monat){

            case 12:
            case 1:
            case 2:
                jahresZeit = "Sie haben " + monat + " ausgewählt, dieser Monat gehört zur Jahreszeit: Winter ";
                break;

            case 3:
            case 4:
            case 5:
                jahresZeit = "Sie haben " + monat + " ausgewählt, dieser Monat gehört zur Jahreszeit: Frühling. ";
                break;

            case 6:
            case 7:
            case 8:
                jahresZeit = "Sie haben " + monat + " ausgewählt, dieser Monat gehört zur Jahreszeit: Sommer. ";
                break;

            case 9:
            case 10:
            case 11:
                jahresZeit = "Sie haben " + monat + " ausgewählt, dieser Monat gehört zur Jahreszeit: Herbst. ";
                break;

            default: jahresZeit  = "Haben Sie sich vertippt? \nDieser Monat existiert nicht.\nStarten Sie bitte erneut.";
            break;
        }
        System.out.println(jahresZeit);
    }
}
