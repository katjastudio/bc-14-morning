package day8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SwitchAlkoholHomeWork {
    public static void main(String[] args) {
        //Напишите программу действий кассира магазина,
        // если у него пытаются купить алкоголь следующие 5 покупателей:
        //10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
        int alter = 21;
        String verkaeufer;
        switch(alter) {

            case 10:
                verkaeufer = "Entschuldigen Sie, dürfte ich bitte ihren Ausweis sehen?" + '\n' +
                        "Laut Jugendgesetzt, sind Kauf und Konsum von Spirituosen ab 18 Jahren erlaubt. ";
                break;

            case 17:
                verkaeufer = "Entschuldigen Sie, dürfte ich bitte ihren Ausweis sehen?" + '\n' +
                        "Laut Jugendgesetzt, sind Kauf und Konsum von Spirituosen ab 18 Jahren erlaubt. ";
                break;

            case 18://чтобы меньше кода писать, идет ссылка на след. "case".
            case 20:
            case 30:
                verkaeufer = "Entschuldigen Sie, dürfte ich bitte ihren Ausweis sehen?" ;
                break;

            default:
                verkaeufer = "Der Besucher dieser Altersgruppen war heute noch nicht im Einkaufszentrum.";
                break;
        }
        System.out.println(verkaeufer);
        System.out.println(" ");
        System.out.println("Dankeschön und schönes Wochenende!");
    }
}
