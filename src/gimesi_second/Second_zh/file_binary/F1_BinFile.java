package gimesi_second.Second_zh.file_binary;



import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import static java.lang.System.err;
import static java.lang.System.out;

public class F1_BinFile
{
    public static void main(String[] args) throws IOException
    {
        String filename = "F1.bin";
        int counter=0;
        int szam;
        try
        {
            BufferedReader be = new BufferedReader(new FileReader("src/gimesi_second/Second_zh/file_binary/F1_BinFile.java"));
            String sor=" ";
            while ((sor=be.readLine())!=null)
            {
                for (int i = 0; i < sor.length(); i++) {
                    if (sor.charAt(i)>='0'&&sor.charAt(i)<='9')
                    {
                        counter++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try
        {
            FileOutputStream outputStream = new FileOutputStream(filename);
            try (DataOutputStream outputStream1 = new DataOutputStream(outputStream))
            {

                outputStream1.writeInt(counter);
                //out.println(counter);
                out.println("A fileba írás megtörtént");
            }
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage());
        }
        try
        {
            FileInputStream bbe = new FileInputStream(filename);
            try
            {
                bbe = new FileInputStream(filename);
            }
            catch (FileNotFoundException ex)
            {
                Logger.getLogger(File_binary_2.class.getName()).log(Level.SEVERE, null, ex);
            }

            DataInputStream be = new DataInputStream(bbe);
            boolean noteof = true;
            while (noteof)
            {
                try
                {
                    szam = be.readInt();
                    out.println(szam);
                }
                catch (EOFException e)
                {     //Fájl vég
                    noteof = false;
                }
            }
        }
        catch (IOException error)
        {
            err.println("Olvasási hiba - " + error.getMessage());
        }
        try
        {
            FileInputStream bbe = new FileInputStream(filename);
            try
            {
                bbe = new FileInputStream(filename);
            }
            catch (FileNotFoundException ex)
            {
                Logger.getLogger(File_binary_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (IOException error)
        {
            err.println("Olvasási hiba - " + error.getMessage());
        }
    }

}


/*
Írjon programot, amely beolvassa e program forrásállományát (.java fájl),
meghatározza soronként a szám karakterek számát,
amit egy bináris állományban elment.
A fájl tartalmát írja ki a képernyőre.
 */