package day9;

public class ClassWorkDay9 {
    public static void main(String[] args) {

        //1. Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        //при езде до 50 км/час нарушений нет;
        //за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        //за превышение скорости от 16 км/час — 40 евро штрафа;
        //за езду от 100 км/час до 130 км/час — штраф 500 евро;
        //и за езду свыше

        int speed = 135;
        System.out.println("Vasha skorostj bila: " + speed + "km/h");
        if (speed <= 50) {
            System.out.println("нарушений нет.");
        } else if (speed <= 65){
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (speed <=100){
            System.out.println("40 евро штрафа");
        } else if (speed <=130){ //IZBITO4NOe USLOVIE imetj v vidu
            System.out.println("штраф 500 евро");
        } else {
            System.out.println("Vam wtraf 500€");
        }

    }
}
