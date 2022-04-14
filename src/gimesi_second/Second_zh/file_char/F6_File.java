package gimesi_second.Second_zh.file_char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;
import static java.lang.System.in;

public class F6_File
{
    //RÁKOS SZAR EZ A KARAKTEROLVASÁS

    public static void main(String[] args) throws FileNotFoundException
    {
        String sor;
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("Generated/adatok.txt"));
            int j=1;
            while ((sor = file.readLine())!= null)
            {
                out.println(j + ". " + counter(sor));
                j++;
            }

        }
        catch (FileNotFoundException e)
        {
            err.println("Anyád");
        }
        catch (IOException e)
        {
            err.println("gec ez üres");
        }
        finally
        {
            out.println("ilyen is van");
        }
    }
    public static int counter(String sor)
    {
        int szumma = 0;

        for (int j = 0; j < sor.length(); j++)
        {
            if (sor.charAt(j)== 32)
            {
                szumma++;
            }
        }
        return szumma;
    }
}
/*
Írjon programot: a main beolvassa egy szöveges fájlt soronként,
egy metódus segítségével megszámolja a sorban lévő szóközök számát.
A metódus paramétere a sort tartalmazó sztring, az értéke a szóközök száma!
 Az eredményt, amely tartalmazza a sorszámot és az adott sorban található szóközök számát, a main írja ki.
 */