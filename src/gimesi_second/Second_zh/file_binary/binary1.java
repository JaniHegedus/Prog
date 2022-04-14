package gimesi_second.Second_zh.file_binary;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
public class binary1 
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter ki = new PrintWriter("Generated/adatok.txt");
        beolvas(ki); BufferedReader be = new BufferedReader(new FileReader("Generated/adatok.txt"));
        out.printf("Az átlag= %5.2f\n", kiir(be));
    } private static void beolvas(PrintWriter ki) 
    {
        try (ki) {
            Locale locale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
            NumberFormat nf = NumberFormat.getNumberInstance(locale);
            Scanner bill = new Scanner(System.in,"UTF-8");
            String név, magasság;
            out.print("A diák neve: ");
            név = bill.nextLine();
            while (név.length()!=0)
            { 
                System.out.print("A diák magassága: ");
                magasság=nf.format(Float.valueOf(bill.nextLine()));
                ki.printf("%s;%s\n", név, magasság);
                out.print("A diák neve: ");
                név = bill.nextLine();
            }
        }
    } 
    private static float kiir(BufferedReader be) throws IOException 
    {
        float magas;
        float db;
        float átlag;
        String sor;
        String név;
        try (be) 
        {
            átlag=0;
            db=0;
            StringTokenizer token;
            while((sor = be.readLine()) != null)
            {
                token = new StringTokenizer(sor, ";");
                név = token.nextToken();
                magas = Float.valueOf(token.nextToken());
                átlag += magas; db++;
            }
        }
        return átlag/db; 
    } 
} 