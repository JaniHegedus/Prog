package gimesi_second.Second_zh.file_binary;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.Scanner;
public class File_binary_object 
{ 
    public static void main(String[] args) throws ClassNotFoundException 
    { 
        Scanner bill = new Scanner (System.in);
        OB_def OB = new OB_def(); 
        try
        { 
            FileOutputStream fileOut = new FileOutputStream(new File("Teszt.bin"));
            ObjectOutputStream file = new ObjectOutputStream(fileOut);
            out.printf("Kérem az azonosítót: ");
            OB.azon = bill.nextInt();
            while(OB.azon!=0)
            { 
                out.printf("Kérem a nevet: ");
                OB.nev = bill.next();
                out.printf("Kérem a fizetést: ");
                OB.fizetes = bill.nextFloat();
                file.writeObject(OB); 
                OB = new OB_def();
                out.printf("Kérem az azonosítót: ");
                OB.azon = bill.nextInt(); 
            }
        } 
        catch (IOException error)
        { 
            err.println("Írási hiba - " + error.getMessage());
        }
        catch (Exception error) 
        { 
            err.println("Egyéb hiba - " + error.getMessage());
        } 
        try
        {
            FileInputStream fileIn = new FileInputStream("Teszt.bin");
            ObjectInputStream file = new ObjectInputStream(fileIn);
            boolean noteof = true;
            while (noteof)
            { 
                try
                {
                    OB_def O = (OB_def) file.readObject();
                    out.printf("%10d%20s%10.2f\n",O.azon, O.nev, O.fizetes);
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
    }
}
class OB_def implements Serializable
{ 
    public Integer azon;
    public String nev;
    public Float fizetes; 
}