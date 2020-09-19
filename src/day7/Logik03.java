package day7;

public class Logik03 {
    public static void main(String[] args) {
        boolean mamaPermission = true;
        boolean papaPermission = true;
        boolean omaPermission = false;

        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
    }

    private static boolean verySmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        return mamaPermission || papaPermission || omaPermission;


    }

}
