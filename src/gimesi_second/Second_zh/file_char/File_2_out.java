package gimesi_second.Second_zh.file_char;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;
import java.io.PrintWriter;
public class File_2_out 
{ 
    public static void main(String[] args)throws IOException 
    { 
        Scanner billentyu = new Scanner (System.in, "ISO8859_2");
        PrintWriter out = new PrintWriter("c:\\a\\text.txt"); 
        file.kiír(billentyu, out);
        BufferedReader in = new BufferedReader(new FileReader("c:\\a\\text.txt"));
        file.olvas(in); 
    } 
} 
class file
{
    private static String nev;
    private static String sor;
    public static void kiír(Scanner bill, PrintWriter out)throws IOException
    {
        try (out)
        {
            int i;
            System.out.print("kérek egy azonosítót: ");
            i=bill.nextInt(); 
            while (i != 0)
            {
                System.out.print("kérek egy nevet: ");
                nev=bill.next(); out.printf("%d - %s\n",i,nev);
                System.out.print("kérek egy azonosítót: ");
                i=bill.nextInt(); }
        }
    }
    public static void olvas(BufferedReader in)throws IOException
    {
        try (in) {
            while ((sor = in.readLine()) != null) 
                System.out.println(sor);
        }
    } 
} 