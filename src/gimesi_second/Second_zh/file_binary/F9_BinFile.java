package gimesi_second.Second_zh.file_binary;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import static java.lang.System.err;

public class F9_BinFile
{
    public static void main(String[] args)
    {
        try{
            RandomAccessFile file = new RandomAccessFile("Generated/Adatok.txt","rw");
            Scanner beker = new Scanner(System.in);
            System.out.println("Adja meg a szöveget!");
            String sor = beker.nextLine();
            int hossz = 0;
            while(sor.length()!=0){
                for (int i = 0;i<sor.length();i++){
                    hossz++;
                }
                kiir(file,sor,hossz);
                System.out.println("Adja meg a szöveget!");
                sor = beker.nextLine();
                hossz = 0;
            }

            System.out.println("A fájl hossza: " + file.length());
            file.close();
        } catch (IOException e)
        {
            err.println("Hiba!");
        }
    }

    public static void kiir(RandomAccessFile file, String sor, int hossz)
    {
        try{

            file.writeBytes(sor + ": " + hossz + '\n');
        } catch (IOException e){
            err.println("Írási hiba!");
        }
    }
}
/*
Készítsen programot, amely a main metódus segítségével sorokat olvas be a billentyűzetről (tetszőleges  végjelig),
majd  meghatározza  a  sorok  hosszát  (a  sorokban  lévő  karakterek számát),
egy metódus segítségével kiírja a sorokat a sorok hosszával együtt egy random állományba (a metódus paraméterei: fájlobjektum,
a sort tartalmazó szting és a sorhossz).
A fájl tartalmát visszafelé olvassa ki és írja azt a képernyőre.
 */