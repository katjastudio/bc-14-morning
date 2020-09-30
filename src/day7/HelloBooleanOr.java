package day7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HelloBooleanOr {
    public static void main(String[] args) {
        boolean a = false, b = true, c;
        System.out.println(c = a | b);// ->true
        System.out.println(c = a ^ b); //->true
        System.out.println(c = a != b); //->true

        boolean var1 = false, var2 = true, var3;
        findBool(var1, var2);
    }

    private static void findBool(boolean var1, boolean var2) {
        boolean var3  = var1 & var2;
        System.out.println(var3);


    }
}
