public class little {
    public static void main(String[] args) {
        String name = "SCHNUPPERTRAINING ";
        System.out.println(writeLittleWord(name));

    }

    private static String writeLittleWord(String name) {
        String result = name.substring(0, 1).toUpperCase()+name.toLowerCase();
        return (result);
    }
}