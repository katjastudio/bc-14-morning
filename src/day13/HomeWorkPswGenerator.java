package day13;

public class HomeWorkPswGenerator {
    public static void main(String[] args) {
        //Давайте напишем генератор паролей.
        // Методу передаётся длина пароля.
        // И метод генерирует пароль используя латиницу, цифры и некоторые спецсимволы(на ваш выбор).

        final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`" +
                "!@#$%^&*()-_=+[{]}\\\\|;:\\'\\\",<.>/?";
        System.out.println(generatePassword(12, ABC));


    }

    private static String generatePassword(int pswLenght, String abc) {
        String result = "";

        for (int i = 0; i < pswLenght; i++) {
            int min = 0;
            int max = abc.length() - 1;//index s 0
            int index = (int) ((Math.random() * (max - min) + 1) + min);// KASTOVANIE! //ODNO sluchajnoje chislo
            char c = abc.charAt(index);//ODIN simbol
            result += c;
        }
        return result;
    }
}
