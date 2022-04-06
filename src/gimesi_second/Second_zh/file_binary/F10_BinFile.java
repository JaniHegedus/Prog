package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.Scanner;

public class F10_BinFile
{
    public static void main(String[] args) throws IOException {
        int a,b,c;
        Scanner be = new Scanner(System.in);
        System.out.println("Kérem a-t:");
        a = be.nextInt();
        try{
            RandomAccessFile beolv = new RandomAccessFile("file.txt","rw");
            while (a != 0) {
                System.out.println("Kérem b-t:");
                b = be.nextInt();
                System.out.println("Kérem c-t:");
                c = be.nextInt();


                beolv.writeBytes(Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(Terf(a, b, c)) + "\n");
                System.out.println("Kérem a-t:");
                a = be.nextInt();

            }
        }catch (FileNotFoundException error){
            System.out.println("SZAAAAR");
        }
        int random = 0;
        BufferedReader beolv = new BufferedReader(new FileReader("file.txt"));
        String sor;
        while ((sor = beolv.readLine()) != null){
            random++;
            if((random % 3) == 0) {
                System.out.println(sor);
            }

        }
        beolv.close();

    }
    public static int Terf(int a, int b, int c){
        int terf;
        terf = a * b * c;
        return terf;
    }
}
/*
Készítsen programot, amely a main metódusban, egymás után bekéri több téglatest három méretét (tetszőleges végjelig).
Metódus segítségével számítsa ki a téglatestek térfogatát (a metódus paraméterei a három méret, a visszaadott érték a térfogat).
A téglatestek méreteit és  a  térfogatát  a  main  kiírja  egy  random  állományba.
A  fájlból  minden  harmadik  sort olvasson ki és írja azt a képernyőre.
 */