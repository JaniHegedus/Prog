package gimesi_second.Second_zh.Exception;

import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F5_Exception
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        Scanner be = new Scanner(System.in);
        try
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.println("szám:");
                int szam = be.nextInt();
                for (int j = 0; j < array.length; j++)
                {
                    if (szam == array[j]) throw new ContainsError1();
                    else
                    {
                        array[j] = szam;
                    }
                }
            }
        }
        catch (ContainsError1 error)
        {
            err.println("Tartalmazza a lista az elemet már!");
        }
        finally
        {
            out.println("Ez a finally rész");
        }
    }
}
class ContainsError1 extends Exception
{
    //üres haha
}
/*
Készítsen programot, amely feltölt egy tömböt egész számokkal.
A feltöltés során ellenőrzi, hogy a megadott szám szerepel-e a tömbben, ha igen, akkor adjon hibajelzést.
A hibafigyelést kivételkezeléssel oldja meg.
*/