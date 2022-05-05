package gimesi_second.Second_zh.file_binary;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F5_BinFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner beker = new Scanner(System.in);
        int index = 1;
        String sor ="";
        try{
            FileOutputStream file = new FileOutputStream("Generated/Adatok.bin");
            ObjectOutputStream data = new ObjectOutputStream(file);
            System.out.println("Adja meg a sort");
            sor = beker.nextLine();
            while (sor.length()!=0){
                kiir(data,sor,index);
                index++;
                System.out.println("Adja meg a sort");
                sor = beker.nextLine();
            }
            data.close();
        }catch (IOException e){
            err.println("Hiba");
        }
        try{
            FileInputStream file = new FileInputStream("Generated/Adatok.bin");
            ObjectInputStream data = new ObjectInputStream(file);
            boolean bol = true;
            while (bol){
                try{
                    Ob o = (Ob)data.readObject() ;
                    System.out.println(o.index + ": " + o.sor);
                }
                catch (EOFException e)
                {
                    bol = false;
                }
                catch (ClassNotFoundException e)
                {
                    e.printStackTrace();
                }
            }
        }catch (IOException e){
            err.println("Hiba!");
        }
    }
    public static void kiir(ObjectOutputStream file,String sor, int index){
        Ob object = new Ob();
        object.sor = sor;
        object.index = index;
        try {
            file.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Ob implements Serializable {
    public Integer index;
    public String sor;
}

/*
Készítsen programot, amelyben a main metódus – üres sztring végjelig – sorokat olvas be a  billentyűzetről,
 majd  egy  metódus  segítségével  kiírja  azokat  sorszámmal  ellátva  egy bináris  állományba
 (a  metódus  paraméterei:  fájlobjektum,  sorszám  és  a  sort  tartalmazó string).
 A fájl tartalmát olvassa vissza és írja ki a képernyőre.
 */