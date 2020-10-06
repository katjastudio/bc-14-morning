package day19;

public class HelloArray {
    public static void main(String[] args) {
        //array - spisok, mnozhestvo...
        // helloMyFirstArray();
        // oldDeclaration();
        // arrayInitialisation();
         germanCities();
        intArrayGame();


    }

    private static void intArrayGame() {
        int[] field = new int[]{5, 15, 3, 67, 90};
        System.out.println(field[3]);//->67
        System.out.println(field[3] + " " + field[4]);
        System.out.println("[" + field[3] + ", " + field[4] + "]");//v literature
        // System.out.println(field[10]);//->OSHIBKA
    }

    private static void germanCities() {
        String[] germanCity = new String[]{"Berlin", "Muenchen", "Frankfurt", "Dresden", "Leipzig", "Hamburg"};
        int size = germanCity.length;
        System.out.println("Kol-vo elementov v massive nemeckih gorodov: " + size); //0,1,2,3,4,5

        int countLetter = 0;
        for (int i = 0; i < size; i++) {
            countLetter = countLetter + germanCity[i].length();
            System.out.println(countLetter);
        }
        System.out.println("Kol-vo vseh bukv: " + countLetter);
    }

    private static void arrayInitialisation() {
        int[] field;
        field = new int[10];// vMASSIVe 10 jaceel kameri hranenija


        String[] fourSeasons = new String[]{"Vivaldi", "Tchaikowski", "Astor Piazolla", "Steffano Edwin King"};

        int[] numberFibonacci = new int[]{0, 1, 2, 4, 5, 6, 7, 21, 23, 55};
        String[] germanCity = new String[]{"Berlin", "Muenchen", "Dresden", "Leipzig", "Hamburg"};

    }

    private static void oldDeclaration() {
        int myArray[];
        String users[];
        long variable = 54546563;
    }

    private static void helloMyFirstArray() {
        int[] myFirstArray; //INTOVij MASSIV
        // zadeklarirovali(prodifinirovali NOVUJU PEREMENNUJU s NOVIM TIPOM DANNIH)

        //dataType[] arrayName; //nazvanie peremennoj
        String[] myFirstArrayString;
        double[] gpsPoints;
        boolean[] permissions;
        char[] symbols;

    }

}
