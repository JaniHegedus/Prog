package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import static java.lang.System.err;
import static java.lang.System.out;

public class F2_BinFile
{
    public static void main(String[] args) throws FileNotFoundException {
        String filename="F2.bin";
        int szam=0;
        try
        {
            FileOutputStream outputStream = new FileOutputStream(filename);
            try (DataOutputStream outputStream1 = new DataOutputStream(outputStream))
            {
                for(int elem:selfReadChar())
                {
                    outputStream1.writeInt(elem);
                    //out.println(elem);
                }
                out.println("A fileba írás megtörtént");
            }
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage());
        }
        FileInputStream bbe = new FileInputStream(filename);
        DataInputStream be = new DataInputStream(bbe);
        boolean noteof = true;
        int i=1;
        while (noteof)
        {
            try
            {
                szam = be.readInt();
                out.println(i+". " + szam);
                i++;
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
    }
    public static ArrayList<Integer> selfReadChar()
    {
        ArrayList<Integer> ints = new ArrayList<>();
        try
        {
            BufferedReader be = new BufferedReader(new FileReader("src/gimesi_second/Second_zh/file_binary/F2_BinFile.java"));
            String sor=" ";
            int counter;
            while ((sor=be.readLine())!=null)
            {
                ints.add(sor.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ints;
    }
}
/*
Írjon programot, amely metódus segítségével beolvassa e program forrásállományát (.java fájl)  meghatározza  soronként  a  karakterek  számát
A  metódus  visszaadott  értéke  a karakterek  száma,  amit  a  main  egy  bináris  állományba  ír.
A  fájl  tartalmát  írja  ki  a képernyőre.
 */