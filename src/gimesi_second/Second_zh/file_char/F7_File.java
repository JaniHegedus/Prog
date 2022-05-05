package gimesi_second.Second_zh.file_char;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class F7_File
{
    public static void main(String[] args) throws IOException {
        PrintWriter file = new PrintWriter("Generated/Téglatest.txt");
        Scanner be = new Scanner(System.in);
        int a=1,b=1,c=1;
        System.out.println("Adja meg az a oldalt!");
        a = be.nextInt();
        while(a!=0){
            System.out.println("Adja meg a b oldalt!");
            b = be.nextInt();
            System.out.println("Adja meg a c oldalt!");
            c = be.nextInt();

            int ter = terfogat(a,b,c);
            kiir(file,a,b,c,ter);

            System.out.println("Adja meg az a oldalt!");
            a = be.nextInt();
        }
        file.close();

    }

    public static int terfogat(int a, int b, int c){
        return a*b*c;
    }

    public static void kiir(PrintWriter file, int a, int b, int c, int ter){
        file.println("Az a oldal hossza: " + a);
        file.println("A b oldal hossza: " + b);
        file.println("A c oldal hossza: " + c);
        file.println("A téglatest térfogata: " + ter);
    }

}



/*
Írjon programot: a main beolvas a billentyűzetről valós számokat (nulla végjelig),
és azokat egy szöveges fájlban tárolja.
Majd egy metódus segítségével visszaolvassa a fájl tartalmát és kiszámítja a tárolt értékek átlagát.
A metódus paramétere a fájlobjektum, értéke az átlag. Az eredményt a main írja ki.
 */
