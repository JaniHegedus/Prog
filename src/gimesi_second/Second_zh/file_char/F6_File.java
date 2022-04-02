package gimesi_second.Second_zh.file_char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.*;
import static java.lang.System.in;

public class F6_File
{
    //RÁKOS SZAR EZ A KARAKTEROLVASÁS

    public static void main(String[] args) {
        String sor;
        //char c;
        //int sum;
        int szumma = 0;
        //ArrayList<String> idk = new ArrayList<>();
        try
        {
            BufferedReader in = new BufferedReader(new FileReader("adatok.txt"));
            while ((sor = in.readLine()) != null)
            {
                int i = 0;
                while(i < sor.length())
                {
                    if(sor.charAt(i) == ' ')
                    {
                        szumma++;
                    }
                }
            }
            out.println(szumma);
            in.close();
        }
        catch (FileNotFoundException e)
        {
            err.println("Anyád");
        }
        catch (IOException r)
        {
            err.println("gec ez üres");
        }
        finally{
            out.println("ilyen is van");
        }
    }

}
/*
Írjon programot: a main beolvassa egy szöveges fájlt soronként,
egy metódus segítségével megszámolja a sorban lévő szóközök számát.
A metódus paramétere a sort tartalmazó sztring, az értéke a szóközök száma! Az eredményt,
amely tartalmazza a sorszámot és az adott sorban található szóközök számát, a main írja ki.
 */