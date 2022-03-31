package gimesi_second.Second_zh.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F2_Exception
{
    public static void main(String[] args) throws InputMismatchException
    {
        int val1 = 1329898989;
        int val2 = 1932789054;
        System.out.println("Value1: "+val1);
        System.out.println("Value2: "+val2);
        long sum = (long)val1 + (long)val2;
        if (sum > Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Overflow!");
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