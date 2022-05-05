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
        ujnyilvantartas.kiír();
    }

}
class Nyilvantartas
{
    protected ArrayList<String[]> nyilvantartas= new ArrayList();
    protected String filename="Dolgozat.bin";
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
            out.print("Kérem a nevet: ");
            nyilvantartas.add(belso);
            }
        try
        {
            FileOutputStream outputStream = new FileOutputStream(filename);
            try (DataOutputStream outputStream1 = new DataOutputStream(outputStream))
            {
                for (int i = 0; i < nyilvantartas.size(); i++)
                {
                    for(String elem:nyilvantartas.get(i))
                    {
                        outputStream1.write(elem.getBytes(StandardCharsets.UTF_8));
                        out.println(elem);
                    }
                    outputStream1.write("\n".getBytes(StandardCharsets.UTF_8));
                }
                out.println("A fileba írás megtörtént");
            }
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage());
        }
    }
    public void kiír() throws FileNotFoundException
    {
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