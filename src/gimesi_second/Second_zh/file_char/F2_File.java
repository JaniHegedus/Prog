package gimesi_second.Second_zh.file_char;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class F2_File
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("Generated/filename.txt");
        out.printf("Sorok száma: %d\n",fileLinesSum(file));
    }

    public static int fileLinesSum(File file)
    {
        int db=0;
        try (Scanner file0 = new Scanner(file))
        {
            while(file0.hasNext())
            { // Van még adat?
                out.println(file0.nextLine());
                db+=1;
            }
            file0.close();
        }
        catch (IOException error)
        {
            System.err.println("Hiba: " + error.getMessage());
        }
        return db;
    }
}
/*
Írjon programot, amely metódus segítségével beolvassa egy szöveges állományát és közben
megszámolja a sorokat.
A fájl megnyitását a main-ben végezze el.
A metódus paramétere a fájlobjektum, a visszaadott érték a sorok száma legyen!
Az eredményt, a main írja ki.
 */
