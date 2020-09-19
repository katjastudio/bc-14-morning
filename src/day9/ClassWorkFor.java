package day9;

public class ClassWorkFor {
    public static void main(String[] args) {
        int lines = 10;
        //triangle(lines);
        simpleString();
    }

    private static void simpleString() {
        String text = "One word";
        text = text + " two";
        System.out.println(text);

    }

    private static void triangle(int number) {
        String star = "*";
        String line = " ";
        for (int i = 0; i < number; i++) {
            System.out.println(line);
          //  line = line + star;
            line +=star;
            System.out.println(line);

        }
    }
}
