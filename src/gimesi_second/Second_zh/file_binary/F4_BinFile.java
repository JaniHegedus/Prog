package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class F4_BinFile
{

    public static void main(String[] args) throws IOException
    {

        String filename = "Generated/F4.txt";
        int i=1;
        try
        {
            BufferedReader be = new BufferedReader(new FileReader("src/gimesi_second/Second_zh/file_binary/F4_BinFile.java"));
            RandomAccessFile randomAccessFile =null;
            try
            {
                randomAccessFile = new RandomAccessFile(filename,"rw");
                String sor=" ";

                while ((sor=be.readLine())!=null)
                {
                    //out.println(i+". "+countChar(sor));
                    randomAccessFile.writeInt(countChar(sor));
                    i++;
                }
                out.println("A file ba írás megtörtént");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            boolean more=true;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        /*
        int szam=0;
        FileInputStream bbe = new FileInputStream(filename);
        DataInputStream be = new DataInputStream(bbe);

        boolean noteof = true;
        int j =1;
        while (noteof)
        {
            try
            {
                szam = be.readInt();
                out.println(j +". sorban a kerekterek száma: " + szam);
                j++;
            }
            catch (EOFException e)
            {     //Fájl vég
                noteof = false;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        */
        final KORB András = KORB.ANDRAS.PETER.RÁK;
        final KORB Máté = KORB.Máté.RÁK.Nagy.Largefasszalszeretem; //<3
    }
    public static int countChar(String sor)
    {
        return sor.length();
    }
}
/*
Írjon   programot,   amelyben   a   main   metódus   soronként   beolvassa   e   program forrásállományát (.java fájl),
egy metódus segítségével megszámolja az egy sorban lévő karakterek számát.
A metódus paramétere a sort tartalmazó sztring, és a fájlobjektum.
A visszaadott  érték  a  karakterek  száma,  amit  a  main  egy  random  állományba  kiír.
A  fájl tartalmát visszafelé olvassa ki, és írja azt a képernyőre.
 */