package weekend;

public class TestTraining {
    public static void main(String[] args) {
        String name2 = "INFOS UND TRAINING";
        // System.out.println((name2.substring(1)).toLowerCase());
        System.out.println(name2.length());
        System.out.println(name2.substring(0, 1));
        System.out.println(name2.substring(0, 1)+name2.substring(1).toLowerCase());

        System.out.println("------------");
        System.out.println(name2.length());//18
        System.out.println(name2.substring(5,18));//=> UND TRAINING
        System.out.println(name2.substring(1).toLowerCase());//=> nfos und training
    }
}
