package weekend;

public class TestUslOperator {
    public static void main(String[] args) {

/*        1. Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        -при езде до 50 км/час нарушений нет;
        -за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        -за превышение скорости от 16 км/час — 40 евро штрафа;
        -за езду от 100 км/час до 130 км/час — штраф 500 евро;
        -и за езду свыше 130 км/час — штраф в 1000 евро,
        конфискация прав на 3 года и конфискация транспортного средства.*/

        int speed = 131;

        if (speed < 50) {
            System.out.println("net strafov");// net strafov
        } else if (speed >= 50 && speed < 66) {
            System.out.println("poricanie");//poricanije
        } else if (speed >= 66 && speed < 100) { // ot 16 km chas
            System.out.println("straf 40€"); // 40 evro
        } else if (speed >= 100 && speed <130) {
            System.out.println("straf 500€");// 500 evro
        } else if (speed >= 130){
            System.out.println("straf 1000€");// 1000 evro
        }else{
            System.out.println("unknown");
        }
    }
}


