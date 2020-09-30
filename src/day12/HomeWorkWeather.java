package day12;

public class HomeWorkWeather {
    public static void main(String[] args) {
        //1. Всю неделю в Европе держится одна погода. Увеличивая всего на один градус ежедневно.
        //Нам известно, что в Берлине в понедельник было 20 градусов тепла,
        //в Лондоне 17 градустов тепла,
        //в Лиссабоне 25 градусов тепла,
        //в Париже 23 градуса тепла,
        //в Москве 19 градусов тепла,
        //в Минске 18 градусов тепла,
        //в Саратове 15 градусов тепла.
        //Напишите программу, которая принимает название города и возвращает температуру в воскресение.
        //Пример:
        //citiWeather("Минск") -> 24.

        //2. Задача на звёздочку. Напишите программу, которая принимает название города и день недели и возвращает температуру.
        //Пример:
        //citiWeather("Минск", "Пятница") -> 22.

        String cityName = "Saratov";
        int sundayTemp = cityTemp(cityName, "Sunday");

        int fridayTemp = cityTemp("Minsk", "Friday");
        System.out.println("Your city: " + cityName + ", " + sundayTemp + " °C " + "temperature on Sunday.");
        System.out.println("Friday temperature in Minsk is " + fridayTemp + "°C.");

    }

    public static int dayNumber(String day) {//preobrazovali dni ned. v int.

        switch (day) {
            case "Monday":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Friday":
                return 5;
            case "Saturday":
                return 6;
            case "Sunday":
                return 7;
        }
        return 0;
    }

    private static int cityTemp(String cityName, String dayName) {//принимает название города и день недели

        int mondayTemp;
        int day = dayNumber(dayName);
        switch (cityName) {
            case "Berlin":
                mondayTemp = 20;
                break;
            case "London":
                mondayTemp = 17;
                break;
            case "Paris":
                mondayTemp = 23;
                break;
            case "Moscow":
                mondayTemp = 19;
                break;
            case "Minsk":
                mondayTemp = 18;
                break;
            case "Saratov":
                mondayTemp = 15;
                break;

            default:
                System.out.println("The City is unknown.");
                return 0;
        }
        return mondayTemp + 1 * (day - 1);// 7-1 => 6 days <= "Увеличивая всего на один градус ежедневно."
        //и возвращает температуру.
    }

}

