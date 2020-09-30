package day14;

public class HomeWorkMetodiString {

  /*  Разобраться с методами String:
    contains(CharSequence s)
    endsWith(String suffix)
    equals(Object anObject)
    startsWith(String prefix)
    substring(int beginIndex)
    toLowerCase()
    toUpperCase()
    trim()
    Это значит показать мне пример работы метода и короткое пояснение,
    что метод делает на самом деле.*/

    public static void main(String[] args) {
        System.out.println("FelixBaumgartner".contains("gart"));//Поиск подстроки в строке
        System.out.println("FelixBaumgartner".contains("abc"));

        System.out.println("FelixBaumgartner".endsWith("er"));// Заканчивается ли слово нв "er"
        System.out.println("FelixBaumgartner".contains("a"));// Не заканчивается => false

        System.out.println("FelixBaumgartner".equals("FelixBaumgartner")); //Сравнение -> true
        System.out.println("FelixBaumgartner".equals("Felix"));// ->false

        System.out.println("FelixBaumgartner".startsWith("Fel"));// Начинается ли слово с такого заданного слова
        System.out.println("FelixBaumgartner".startsWith("abc"));

        System.out.println("FelixBaumgartner".substring(5));//возвращает String , начиная с 5ого символа до конца
        System.out.println("FelixBaumgartner".substring(0)); //возврат всей строки "FelixBaumgartner"
        //System.out.println("FelixBaumgartner".substring(999)); //нельзя выходить за диапазон заданного, 16

        System.out.println("FelixBaumgartner".toLowerCase());//заданный String в выдает в НИЖНИЙ регистр букв
        System.out.println("FelixBaumgartner".toUpperCase());//заданный String в выдает в ВЕРХНИЙ регистр букв

        System.out.println("INFOS UND TRAINING".trim());
        //обрезает невидимые символы в начале и в конце строки, чтобы не было "кучи мусора"
        System.out.println("   \n \t INFOS UND TRAINING   \n\n  ");
    }
}
