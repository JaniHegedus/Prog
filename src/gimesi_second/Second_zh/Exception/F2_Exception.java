package gimesi_second.Second_zh.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F2_Exception
{
    public static void main(String[] args) throws InputMismatchException
    {
        try
        {
            Scanner bill = new Scanner(System.in);
            int input = bill.nextInt();
            out.println(input);
        }
        catch (InputMismatchException e)
        {
            err.println("Integer Overflow!");
        }
        finally
        {
            out.println("Ez a finally rész,arákoskurvaanyád");
        }
    }
}
class IntegerOverflowerror extends InputMismatchException
{
    //rák
}

/*
Készítsen programot, amely egy egész típusú változó túlcsordulása esetén keletkező hibát lekezeli.
Írjon ki a hibának megfelelő hibaüzenetet.
Használja a try, catch és finally kulcsszavakat.
 */