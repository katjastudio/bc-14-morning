public class Random {
    public static void main(String[] args) {
        //randomnie cisla, sgenerirovatj slucajne cislo, 0-100 PSEVDOrandom!
        /* double myRandom = Math.random();
        System.out.println(myRandom);// vidalo 0.6343831501546734

        double newResult = myRandom * 100;
        System.out.println(newResult);// vidalo 63.43831501546734

        int result = (int) newResult;
        System.out.println(result); */  // ...otsekli drobnuju castj

        int min = 30;
        int max = 100;
        int myDigit = (int) (Math.random () * (max - min) +1) + min;
        System.out.println(myDigit);// slu4ajnie cisla ot min (30) do max (100)

    }
}
