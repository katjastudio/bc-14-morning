package weekend;

public class TestRound {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        myLovelyRound(pi);
    }
    private static void myLovelyRound(double number) {
        double result = 0.0;
        int k = 100;
        double temp = number * k;
        System.out.println(temp);
        int temp2 = (int) temp;
        System.out.println(temp2);
        result = temp2;
        result = result / k;
        System.out.println(result);
    }
}
