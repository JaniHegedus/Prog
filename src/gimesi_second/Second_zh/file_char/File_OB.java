package gimesi_second.Second_zh.file_char; 
import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class File_OB 
{ 
    public static void main(String[] args) throws IOException
    { 
        LinkedList<OB_def> adatok = new LinkedList<>();
        feltölt(adatok); fájlírás(adatok);
        képernyő(adatok); 
    }
    static void fájlírás(LinkedList<OB_def> adatok) throws IOException
    { 
        try (PrintWriter file = new PrintWriter(new FileWriter("Adatok.txt"))) {
            for(int i = 0; i < adatok.size(); i++)
            {
                file.print(adatok.get(i).azon+";");
                file.print(adatok.get(i).nev+";");
                file.println(adatok.get(i).fizetes);
            }
        }
    } 
    static void  feltölt(LinkedList<OB_def> adatok)
    { //Rendezett feltöltés 
        Scanner bill = new Scanner (System.in, "ISO8859_2");
        OB_def OB = new OB_def(); 
        int i;
        out.printf("Kérem az azonosítót: "); 
        OB.azon = bill.nextInt(); 
while(OB.azon!=0)
{
    out.printf("Kérem a nevet: "); 
    OB.nev = bill.next();
    out.printf("Kérem a fizetést: ");
    OB.fizetes = bill.nextFloat();
    for(i=0; i<adatok.size(); i++)
    { 
        if(adatok.get(i).azon > OB.azon)
        { 
            adatok.add(i, OB); break; 
        }
    } 
    if( i == adatok.size())adatok.add(OB);
    OB = new OB_def();
    out.printf("Kérem az azonosítót: ");
    OB.azon = bill.nextInt(); 
} 
    }
    static void képernyő(LinkedList<OB_def> adatok)throws IOException
    {
        try (BufferedReader file = new BufferedReader(new FileReader("Adatok.txt"))) 
        {
            String sor; StringTokenizer token;
            while((sor = file.readLine()) != null)
            { 
                token = new StringTokenizer(sor, ";");
                out.print(token.nextElement() + " - ");
                out.print(token.nextToken() + " - ");
                out.println(token.nextElement());
            }
        } 
    } 
} 
class OB_def
{ 
    public Integer azon; public String nev; public Float fizetes; 
} 