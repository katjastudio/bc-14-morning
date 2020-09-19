package weekend;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circumference2 {
    public static void main(String[] args){
        double radius = 10;
       double cf = findCF(radius);
        double cf2 = round(cf);
        System.out.println(cf);
        System.out.println(cf2);




        //roundResult();
        Math.round(1235.9);
        System.out.println(Math.round(1235.9));
    }

    private static double findCF(double myRadius) {
        return 2 * Math.PI*myRadius;

    }

    public static double round(double x) {//x / value/ variable
        return Math.round(x * 100) / 100.0;

    }
    //public static double roundResult(String[] args) {

    //}


}