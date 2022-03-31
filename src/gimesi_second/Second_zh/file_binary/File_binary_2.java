package gimesi_second.Second_zh.file_binary;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_binary_2 
{ 
    public static void main(String[] args) 
    { 
        Scanner bill = new Scanner (System.in);
        int szam; 
        try
        { 
            FileOutputStream bki = new FileOutputStream("Teszt.bin");
            try (DataOutputStream ki = new DataOutputStream(bki)) {
                do
                {
                    out.print("Kérek egy számot: ");
                    try{
                        szam = bill.nextInt();
                        out.println(szam);
                        ki.writeInt(szam);
                    }
                    catch (InputMismatchException error)
                    { 
                        break;
                    }
                } while(true);
            }
        } 
        catch (IOException error)
        { 
            err.println("Írási hiba - " + error.getMessage());
        }
    try
    {
        FileInputStream bbe = new FileInputStream("Teszt.bin"); 
            try 
            {
                bbe = new FileInputStream("Teszt.bin");
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
                out.println(" " + szam); 
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