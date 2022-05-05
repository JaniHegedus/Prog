package gimesi_second.Second_zh.file_char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class F8_File
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename="Generated/Adatok.txt";
        String sor;
        try
        {
            try(BufferedReader file = new BufferedReader(new FileReader(filename)))
            {
                int i=1;
                while ((sor = file.readLine())!=null)
                {
                    out.println(i+". "+NumberCharNumber(sor));
                    i++;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static int NumberCharNumber(String sor)
    {
        int counter=0;
        for (int i = 0; i < sor.length(); i++)
        {
            if(sor.charAt(i)>='0' && sor.charAt(i)<='9')
            {
                counter++;
            }
        }
        return counter;
    }
}
/*
    Írjon programot: a main beolvassa egy szöveges állományt soronként,
    egy metódus segítségével megszámolja a sorban lévő számkarakterek számát.
    A metódus paramétere a sort tartalmazó sztring, az értéke a karakterek száma! Az eredményt,
    amely tartalmazza a sorszámot és az adott sorban található számkarakterek számát, a main írja ki.
 */