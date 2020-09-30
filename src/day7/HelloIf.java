package day7;

public class HelloIf {
    public static void main(String[] args) {
        boolean grant = true;
        String decision;
        if (grant) {
            decision = "Poedu v lagerj";

        } else {
            decision = "ostanusj doma";
        }
        System.out.println(decision);

        int a = 116;
        int b = 7;
        System.out.println(findModulo(a, b));
    }

    private static int findModulo(int a, int b) {
        return a % b;
    }


}

