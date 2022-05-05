package gimesi_second.Second_zh.file_binary;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;
public class binary0 
{
    public static void main(String[] args) throws IOException
    {
        PrintStream ki = new PrintStream("Generated/Adatok.txt");
        kiir(ki); Scanner be = new Scanner(new File("Generated/Adatok.txt"));
        out.println("A legnépesebb város: " + nagy(be)); 
    }
    private static void kiir(PrintStream f) 
    {
        Scanner sc = new Scanner (System.in, "ISO8859_2");
        String város; int lakó;
        out.print("Kérem a város nevét: ");
        város = sc.nextLine(); while(város.length() != 0)
        {
            out.printf("Kérem %s lakosainak számát: ", város);
            lakó = sc.nextInt(); f.println(város + " - " + lakó);
            sc.nextLine(); out.print("Kérem a város nevét: ");
            város = sc.nextLine(); } f.close(); 
    } 
    private static String nagy(Scanner f) 
    { 
        int szám, legnagyobb=-1;
        String város, sor;
        String Lváros = "";
        StringTokenizer token;
        while(f.hasNext())
        {
            sor = f.nextLine(); token = new StringTokenizer(sor, " - ");
            város = token.nextToken(); szám = Integer.valueOf(token.nextToken());
            if(szám > legnagyobb)
            {
                legnagyobb = szám; Lváros = város; 
            } 
        } 
        f.close();
        return Lváros; 

    }
} 