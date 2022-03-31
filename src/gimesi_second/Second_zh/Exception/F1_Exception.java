package gimesi_second.Second_zh.Exception;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F1_Exception
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner be = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            array.add(i);
        }
        try
        {
        System.out.println("ADD AZ INDEXET");
        int index = be.nextInt();
        if(array.get(index)> array.size()) throw new IndexOutOfBoundsException();
        else
        {
            System.out.println(index);
        }
        }
        catch(IndexOutOfBoundsException error){
            err.println("NEMJÓBAZEG");
        }
        finally
        {
            out.println("Ez a finally rész");
        }
    }
}
/*
Készítsen programot, amelyben egy listát (dinamikos tömböt) feltölt tetszőleges számú elemmel.
Kezelje le, ha lekérdezésnél (lista.get(szam)) a szám nagyobb, mint az elemek száma.
Írjon ki a hibának megfelelő hibaüzenetet.
Használja a try, catch és finally kulcsszavakat.
*/