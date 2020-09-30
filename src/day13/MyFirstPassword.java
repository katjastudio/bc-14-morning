package day13;

public class MyFirstPassword {
    public static void main(String[] args) {
        String myLittlePassword = "osidfosaifasodifuwoe";
        generatePassword(8);
        //generatePassword(8);
       // generatePassword(8);
    }

    private static void generatePassword(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 65;
            int max = 90;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            result += c; //a=a+b
        }
        System.out.println(result.toLowerCase());
    }
}