package weekend;

public class MetodiString {
    public static void main(String[] args) {
      /*  contains(CharSequence s)
        endsWith(String suffix)
        equals(Object anObject)
        startsWith(String prefix)
        substring(int beginIndex)
        toLowerCase()
        toUpperCase()
        trim()*/

        String name = "AllaFelixovna ";
        System.out.println(name.contains("xlkj"));
        System.out.println(name.endsWith("off"));
        System.out.println(name.endsWith("na"));
        System.out.println(name.equals("AllaFelixovna"));//=> true, srvnenie s objektom
        System.out.println(name.equals("AllaFelixovn"));//=> false, srvnenie s objektom
        System.out.println(name.startsWith("All"));//=>true, nacinaetsa AllaFelixovna na All
        System.out.println(name.substring(6));//=>lixovna (0-6) lixovna
        System.out.println(name.substring(3));//=>lixovna (0-3) aFelixovna
        System.out.println(name.toLowerCase());//=>allafelixovna
        System.out.println(name.toUpperCase());//=>ALLAFELIXOVNA
        System.out.println(name.trim());

    }
}
