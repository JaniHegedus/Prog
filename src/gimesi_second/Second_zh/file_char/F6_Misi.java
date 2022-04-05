package gimesi_second.Second_zh.file_char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F6_Misi
{
    public static void main(String[] args) throws FileNotFoundException {
        String sor;
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("adatok.txt"));
            while((sor=file.readLine()) != null)
            {
                System.out.println("Szoköz " + szokoz(sor));
            }
            file.close();
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static int szokoz(String sor){
        int space = 0;

        for (int i = 0;i<sor.length();i++){
            if (sor.charAt(i) == 32){
                space++;
            }
        }

        return space;
    }
}
/*
Írjon programot: a main beolvassa egy szöveges fájlt soronként,
egy metódus segítségével megszámolja a sorban lévő szóközök számát.
A metódus paramétere a sort tartalmazó sztring, az értéke a szóközök száma!
 Az eredményt, amely tartalmazza a sorszámot és az adott sorban található szóközök számát, a main írja ki.
 */