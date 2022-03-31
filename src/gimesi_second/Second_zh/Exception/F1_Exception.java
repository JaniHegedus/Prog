package gimesi_second.Second_zh.Exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.System.out;
import static java.lang.System.err;
import java.lang.ClassNotFoundException;

public class F1_Exception
{
    public static void main(String[] args)
    {
        ArrayList<Double> arrayList = new ArrayList<>();
        Scanner be = new Scanner(System.in);
        int tetszoleges;
        out.println("Hány elemet akarsz?");
        tetszoleges = be.nextInt();
        for(int i = 0; i < tetszoleges; i++)
        {
            arrayList.set(i, Math.random());
        }
        try
        {
            int szam;
            out.println("hányadik számot keresed (index)");
            szam = be.nextInt();
            out.println(arrayList.get(szam));
        }
        catch(ClassNotFoundException e)
        {
            out.println("A keresett elem nincs benne a listában.");
        }
        finally
        {
            out.println(arrayList);
        }
    }
}
/*
Készítsen programot, amelyben egy listát (dinamikos tömböt) feltölt tetszőleges számú elemmel.
Kezelje le, ha lekérdezésnél (lista.get(szam)) a szám nagyobb, mint az elemek száma.
Írjon ki a hibának megfelelő hibaüzenetet.
Használja a try, catch és finally kulcsszavakat.
*/