package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.Scanner;

public class F6_BinFile
{
    public static void main(String[] args)
    {
        elsomethod();
        try {
            FileInputStream bee = new FileInputStream("Adatok.bin");
            DataInputStream be = new DataInputStream(bee);
            boolean noteof = true;
            while (noteof){
                try{
                    int fasz = be.read();
                    if (fasz == -1){
                        noteof = false;
                        break;
                    }
                    System.out.print((char) fasz);

                }
                catch (EOFException e){ //Fájl vég
                    noteof = false;
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException error){
            System.out.println("ANYÁÁÁD");
        }
    }
    public static void elsomethod(){

        try {
            FileOutputStream kii = new FileOutputStream("Adatok.bin");
            DataOutputStream ki = new DataOutputStream(kii);
            String sor;
            Scanner be = new Scanner(System.in);
            sor = be.nextLine();
            while (sor.length() != 0) {
                kiir(ki,sor);
                sor = be.nextLine();

            }

        }catch (FileNotFoundException error) {
            System.out.println("Hiba: ANYÁD");
        }

    }
    public static void kiir(DataOutputStream ki, String sor){
        try{
            ki.writeBytes(sor + "\n");
        }catch (IOException error){
            System.out.println("KURVAAAAA");
        }

    }
}
/*
Készítsen programot, amely egy metódus  segítségével – üres sztring végjelig – sorokat olvas be a billentyűzetről
(a metódus paramétere a sort tartalmazó sztring),
majd egy másik metódus  segítségével  kiírja  azokat  egy  bináris  állományba
(a  függvény  paraméterei: fájlobjektum és a sort tartalmazó sztring).
A fájl tartalmát írja ki a képernyőre.
 */