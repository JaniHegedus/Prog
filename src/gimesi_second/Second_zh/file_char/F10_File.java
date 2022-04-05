package gimesi_second.Second_zh.file_char;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.out;

public class F10_File
{
    public static void main(String[] args) throws IOException {

        PrintWriter file = new PrintWriter("Téglatest.txt");

        double a = 1, b = 1, c = 1;
        Scanner in = new Scanner(System.in);
        boolean fasz = true;
        while (fasz)
        {
            out.println("Kérem az a oldalt: ");
            a = in.nextDouble();
            if(a != 0)
            {
                out.println("Kérem a b oldalt: ");
                b = in.nextDouble();
                out.println("Kérem a c oldalt: ");
                c = in.nextDouble();
                double ter = terf(a, b, c);
                kiír(file, a, b, c, ter);
            }
            else
            {
                fasz = false;
            }
            file.close();
        }
    }

    public static double terf(double a, double b, double c){
        double nagyakisfaszom = a*b*c;
        return nagyakisfaszom;
    }
    public static void kiír(PrintWriter file, double a, double b, double c, double terfogat)
    {
        file.println("Az a oldal hossza: "+a);
        file.println("A b oldal hossza: "+b);
        file.println("A c oldal hossza: "+c);
        file.println("A téglatest térfogata: "+terfogat);
    }
}

/*
Készítsen programot, amely a main-ben, ciklus segítségével bekéri téglatestek három méretét.
Metódus segítségével számítsa ki a téglatestek térfogatát
(a metódus paraméterei a három méret, értéke a térfogat).
A téglatestek méreteit és a térfogatát egy metódus segítségével írja ki egy szöveges állományba
(a metódus paraméterei: a fájlobjektum, a téglatest méretei és a térfogata).
Az adatmegadás végét szabadon választhatja meg.
 */