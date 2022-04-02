package gimesi_second.Second_zh.file_char;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
public class File_Line_IO 
{
    public static void main(String[] args) 
    {
        String nev;
        Scanner billentyu = new Scanner (System.in, "ISO8859_2");
        try
        {
            try (PrintStream file = new PrintStream("Fájl.txt")) 
            {
                out.print("Kérek egy nevet: ");
                nev = billentyu.nextLine();
                while(nev.length()!=0)
                {
                    file.println(nev);
                    out.print("Kérek egy nevet: ");
                    nev = billentyu.nextLine(); 
                }
            }
        } 
        catch (IOException error) 
        {
            System.err.println("Hiba: " + error.getMessage());
        }
        try (Scanner file = new Scanner(new File("Fájl.txt"))) 
        { 
            while(file.hasNext()) 
            { // Van még adat? 
                out.println(file.nextLine()); 
            } file.close(); 
        } 
        catch (IOException error) 
        {
        System.err.println("Hiba: " + error.getMessage()); 
        } 
    }
}