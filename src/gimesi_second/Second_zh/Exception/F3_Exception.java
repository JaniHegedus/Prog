package gimesi_second.Second_zh.Exception;

import java.util.Scanner;

public class F3_Exception
{
    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);
        System.out.println("Kérem a számolandó számot");
        int szam = be.nextInt();
        double ertek = Math.sqrt(szam);
        System.out.println(ertek);
    }
}
class HibásÉrték0 extends Exception
{
    //Gec ez üres
}
/*
Készítsen programot, amely kiszámítja egy szám négyzetgyökét (Math.sqrt()).
Írjon ki hibaüzenetet, ha a gyökvonás eredménytelen (pl. negatív számot adtunk meg) alkalmazza a Double.isNaN() metódust.
Használja a try, catch és finally kulcsszavakat.
 */