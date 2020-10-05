package day20;

public class ReviewTernary {
    public static void main(String[] args) {
/*        myFirstCompareTo("Berlin", "Moscow"); → "Berlin"
        myFirstCompareTo("Minsk", "Moscow"); → "Minsk"
        myFirstCompareTo("Kyiv", "Paris"); → "Kyiv"
        myFirstCompareTo("Могилёв", "Потсдам"); → "Могилёв"*/

        // System.out.println(myFirstCompareTo(firstWord, secondWord));
        System.out.println(myFirstCompareTo("Berlin", "Moscowl"));
    }

    private static String myFirstCompareTo(String firstWord, String secondWord) {
        return (firstWord.compareTo(secondWord) < 0) ? firstWord : secondWord;
       /* if (firstWord.compareTo(secondWord) < 0) {
            return firstWord;
        } else {
            return secondWord;
        }
      //  return ""; //dlina 0-> v nej nicego netu*/
    }
}
