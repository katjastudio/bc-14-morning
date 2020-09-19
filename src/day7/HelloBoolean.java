package day7;

public class HelloBoolean {
    public static void main(String[] args) {
//introductionBoolean();
        boolean a = true;
        boolean b,c;
        b = false;
        c = a & b;
        System.out.println("a & b " + c);
        c = a | b;
        System.out.println("a | b " + c);
        c = a ^ b;
        System.out.println("a ^ b " + c);
        c = a != b;
        System.out.println("a != b " + c);
    }

    public static void introductionBoolean(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a >b);
        System.out.println(a<b );
        //&
        //|
        //^
        //!
        System.out.println(a !=b);
        System.out.println(a ==b);
    }

}
