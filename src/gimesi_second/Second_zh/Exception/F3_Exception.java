package gimesi_second.Second_zh.Exception;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.err;
import static java.lang.System.out;

public class F3_Exception
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);
        try
        {
            System.out.println("Kérem a számolandó számot");
            int szam = be.nextInt();

            if(szam<=0) throw new HibásÉrték0();
            else
            {
                double ertek = Math.sqrt(szam);
                System.out.println(ertek);
            }

        }
        catch (NumberFormatException error)
        {
            err.println(error.getMessage());
        }
        catch (HibásÉrték0 error)
        {
            err.println("Hibás a szám!");
        }
        finally
        {
            out.println("Ez a finally rész");
        }
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