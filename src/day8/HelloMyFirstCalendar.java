package day8;

public class HelloMyFirstCalendar {
    public static void main(String[] args) {
        String myVeryLovelyMonth = "mAY";
        System.out.println("Peredan " + myVeryLovelyMonth + "polu4eno" + getMeMonthNumber(myVeryLovelyMonth));
    }

    private static int getMeMonthNumber(String month) {
        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
        int result = 0;

        switch (month){
            case "January":
                result = 1;
                break;

            case "Fabruary":
                result = 2;
                break;

            case "March":
                result = 3;
                break;

            case "April":
                result = 4;
                break;

            case "May":
                result = 5;
                break;

            case "June":
                result = 6;
                break;

            case "July":
                result = 7;
                break;

            case "August":
                result = 8;
                break;

            case "September":
                result = 9;
                break;

            case "October":
                result = 10;
                break;

            case "November":
                result = 11;
                break;

            case "Dezember":
                result = 12;
                break;

            default:
                result = -1;
                break;

        }




        return result;//poka ne rewili, NE GOTOV. DEFOLTNIE ZNA$ENIE, "false" (boolean), "" (pustoe zna4enie) !!!
    }
}
