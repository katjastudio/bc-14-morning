package weekend;

public class NestedLoop {
    public static void main(String[] args) {
        rectangle(8, 4);
        System.out.println("-------------------");
        multitable();
        System.out.println("-------------------");
        triangle();
    }

    private static void triangle() {
        for (int i = 10; i >+ 1; i--) {//rows
            for (int j=1; j<=i; j++){//kolonka, "j<=i"-kolonka
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void multitable() {
        String x;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                x = "" + (i * j);
                if (x.length() == 1) {
                    System.out.print(" " + x + " ");
                } else {
                    System.out.print(x + " ");
                }

            }
            System.out.println();

        }
    }

    private static void rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i % 2 == 0) {
                    System.out.print("-*");
                } else {
                    System.out.print("*-");
                }
            }
            System.out.println();
        }
    }
}

