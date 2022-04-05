package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.err;
import static java.lang.System.out;

public class F3_BinFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename="F3.txt";
        RandomAccessFile file = null;
        try
        {
            file = new RandomAccessFile(filename,"rw");
            for(int elem:selfReadNumChar())
            {
                file.writeInt(elem);
                //out.println(elem);
            }
            out.println("A fileba írás megtörtént\n");
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage());
        }
        int szam=0;

        FileInputStream bbe = new FileInputStream(filename);
        DataInputStream be = new DataInputStream(bbe);
        boolean noteof = true;
        int i=1;
        while (noteof)
        {
            try
            {
                szam = be.readInt();
                out.println(i+". sorban a számkerekterek száma: " + szam);
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
    public static ArrayList<Integer> selfReadNumChar()
    {
        ArrayList<Integer> ints = new ArrayList<>();
        int counter;
        try
        {
            BufferedReader be = new BufferedReader(new FileReader("src/gimesi_second/Second_zh/file_binary/F3_BinFile.java"));
            String sor=" ";
            while ((sor=be.readLine())!=null)
            {
                counter=0;
                for (int i = 0; i < sor.length(); i++) {
                    if(sor.charAt(i)>='0'&&sor.charAt(i)<='9')
                    {
                        counter++;
                    }
                }
                ints.add(counter);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return ints;
    }
}
/*
Írjon programot, amely metódus segítségével beolvassa e program forrásállományát (.java fájl) és meghatározza soronként a szám karakterek számát.
A metódus visszaadott értéke a megszámolt karakterek száma legyen, amit a main egy random állományba ír ki.
A fájl tartalmát írja ki a képernyőre.
 */