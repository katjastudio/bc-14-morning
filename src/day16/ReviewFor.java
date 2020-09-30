package day16;

public class ReviewFor {
    public static void main(String[] args) {
        String word1 = "Ja ljublju Jaroslavljj!";
        String word2 = "Ja ljublju Berlin!";
        String word3 = "Nikto ne ljubit teba";
        System.out.println(counJu(word1));//3
        System.out.println(counJu(word2));//2
        System.out.println(counJu(word3));//1

    }

    private static int counJu(String original) {
        String input = original.toLowerCase();//SOZDAKI promew.
        char ju = 'j';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ju) {
                count++;
            }

        }
        return count;
    }
}
