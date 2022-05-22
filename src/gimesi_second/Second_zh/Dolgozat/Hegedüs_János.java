package gimesi_second.Second_zh.Dolgozat;

import gimesi_second.Second_zh.file_binary.File_binary_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.err;
import static java.lang.System.out;

public class Hegedüs_János
{
    public static void main(String[] args) throws FileNotFoundException {
        Nyilvantartas ujnyilvantartas = new Nyilvantartas();
        ujnyilvantartas.beolvas();
        ujnyilvantartas.K_kiír();
    }

}
class Nyilvantartas
{
    protected String filename="src/Generated/Dolgozat.bin";
    public void beolvas()
    {
        Scanner bill = new Scanner(System.in);
        String sor=" ";
        out.print("Kérem a nevet: ");
        while((sor=bill.nextLine())!="")
        {
            String[] belso=new String[3];
            belso[0]=sor;
            out.print("Kérem a telefonszámot: (06202020202) ");
            belso[1] = bill.nextLine();
            out.print("Kérem az email címet: ");
            belso[2] = bill.nextLine();
            out.println();
            kiír(belso);
            out.print("Kérem a nevet: ");
        }
    }
    public void kiír(String[] data)
    {
        try
        {
            FileOutputStream outputStream = new FileOutputStream(filename);
            try (DataOutputStream outputStream1 = new DataOutputStream(outputStream))
            {
                for(String data0:data)
                    {
                        outputStream1.write(data0.getBytes(StandardCharsets.UTF_8));
                    }
                outputStream1.write("\n".getBytes(StandardCharsets.UTF_8));
                out.println("A fileba írás megtörtént");
            }
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage());
        }
    }
    public void K_kiír() throws FileNotFoundException
    {
        char szam;
        FileInputStream bbe = new FileInputStream(filename);
        DataInputStream be = new DataInputStream(bbe);
        boolean noteof = true;
        int i=1;
        while (noteof)
        {
            try
            {
                szam = be.readChar();
                out.println(i+". " + szam);
                i++;
                szam = be.readChar();
                out.println(i+". " + szam);
                i++;
                szam = be.readChar();
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

}