package gimesi_second.Second_zh.file_char;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class F9_File
{
    public static void main(String[] args) throws IOException {
        Scanner bill= new Scanner(System.in);
        String sor;

        String filename="Generated/sorok.txt";
        PrintWriter newfile= new PrintWriter(new FileWriter(filename));

        out.println("Adja meg a sort: ");
        while((sor=bill.nextLine())!="")
        {
            int len=sor.length();
            out(newfile,sor,len);
            out.println("Adja meg a sort: ");
        }
        newfile.close();
    }
    public static void out(PrintWriter file,String  sor, int len)
    {
        out.println(sor+" hossz: "+len);
        file.println(sor+" hossz: "+len);
    }
}
/*
Készítsen programot, amely a main segítségével sorokat olvas be a billentyűzetről,
majd meghatározza a sorok hosszát (a sorokban lévő karakterek számát).
Metódus segítségével kiírja a sorokat a hosszukkal együtt egy szöveges állományba
(a metódus paraméterei: fájlobjektum, a sort tartalmazó sztring és a sorhossz).
Az adatmegadás végét szabadon választhatja meg.
 */
