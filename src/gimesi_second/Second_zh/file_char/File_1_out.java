package gimesi_second.Second_zh.file_char;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class File_1_out 
{
    public static void main(String[] args)
    {
        Scanner billentyu = new Scanner (System.in);
        int i; String nev; String sor;
        try
        {
            try (PrintWriter out = new PrintWriter("c:text.txt")) {
                System.out.print("kérek egy azonosítót: ");
                i=billentyu.nextInt(); 
                while (i != 0)
                {
                    System.out.print("kérek egy nevet: ");
                    nev=billentyu.next();
                    out.printf("%d - %s\n",i,nev);
                    System.out.print("kérek egy azonosítót: ");
                    i=billentyu.nextInt(); }
            }
        } 
        catch (IOException error) 
        {
            System.err.println(error.getMessage());
        }
        try 
        {
            try (BufferedReader in = new BufferedReader(new FileReader("c:text.txt"))) {
                while ((sor = in.readLine()) != null)
                {
                    System.out.println(sor); 
                }
            }
        }
        catch (IOException error) 
        {
            System.err.println(error.getMessage()); 
        } 
    } 
} 