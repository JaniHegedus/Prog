package gimesi_second.Second_zh.Exception;

import static java.lang.System.err;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Scanner;

public class F4_Exception
{
    public static void main(String[] args)
    {
        Scanner bill = new Scanner(System.in);
        String Egeszleszek = bill.next();
        try
        {
            int Egeszvagyok = Integer.parseInt(Egeszleszek);
            out.printf("Az érték %d\n", Egeszvagyok);
        }
        catch (NumberFormatException error)
        {
            err.println("Nem számot adtunk meg! - " + error.getMessage());
        }
        finally
        {
            out.println("Ez a finally rész");
        }
    }
}
/*
Készítsen programot, amelyben egy sztringbe beolvasott adatot, átkonvertál egésszé.
Ha nem szám karaktert adtunk meg, akkor írjon ki a hibának megfelelő hibaüzenetet.
Használja a try, catch és finally kulcsszavakat.
*/