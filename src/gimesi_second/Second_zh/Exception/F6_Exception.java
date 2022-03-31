package gimesi_second.Second_zh.Exception;


import java.util.Scanner;
import static java.lang.System.err;
import static java.lang.System.out;

public class F6_Exception
{
    public static void main(String[] args) 
    {
        String[] strings1 = new String[10];
        Scanner be = new Scanner(System.in);
        try
        {
            for (int i = 0; i < strings1.length; i++)
            {
                System.out.println("Karaktersor:");
                String karaktersor = be.nextLine();
                for (int j = 0; j < strings1.length-1; j++)
                {
                    if(karaktersor==strings1[j]) throw new ContainsError0();
                    else
                    {
                        strings1[i] = karaktersor;
                    }
                }
            }
        }
        catch (ContainsError0 error)
        {
            err.println("Tartalmazza a lista az elemet már!");
        }
        finally
        {
            out.println("Ez a finally rész");
        }
    }
}
class ContainsError0 extends Exception
{
    //Gec ez üres
}
/*
Készítsen programot, amely feltölt egy sztringeket tartalmazó listát szövegekkel.
A feltöltés során ellenőrzi, hogy a megadott szöveg szerepel-e a listában, ha igen, akkor adjon hibajelzést.
A hibafigyelést kivételkezeléssel oldja meg.
*/