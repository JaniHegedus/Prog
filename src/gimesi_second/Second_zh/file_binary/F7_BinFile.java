package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.err;

public class F7_BinFile
{
    public static void main(String[] args)
    {
        try{
            FileOutputStream file = new FileOutputStream("Generated/Adatok.bin");
            DataOutputStream data = new DataOutputStream(file);
            Scanner beker = new Scanner(System.in);
            System.out.println("Add meg a számot");
            double szam = beker.nextDouble();

            while (szam!=0){
                data.writeDouble(szam);
                System.out.println("Add meg a számot");
                szam = beker.nextDouble();
            }
            System.out.println("A számok átlaga: " + atlag());
        } catch (IOException e){
            err.println("Írási hiba!");

        }
    }

    public static double atlag(){
        double szam = 0;
        double osszeg = 0;
        double index = 0;
        boolean bol = true;
        try{
            FileInputStream file = new FileInputStream("Generated/Adatok.bin");
            DataInputStream data = new DataInputStream(file);

            while (bol){
                szam = data.readDouble();
                osszeg += szam;
                index++;
            }

        } catch (IOException e){
            bol = false;
        }
        return osszeg/index;
    }
}

/*
Írjon  programot,  amelyben  a  main  metódus  beolvas  billentyűzetről  valós  számokat (tetszőleges végjelig),
és azokat egy bináris fájlban tárolja.
Majd egy metódus segítségével visszaolvassa a fájl tartalmát és kiszámítja a tárolt értékek átlagát.
A metódus paramétere a fájlobjektum,
a visszaadott érték az átlag, amit a main ír ki.
 */