package gimesi_second.Second_zh.file_binary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

import static java.lang.System.err;

public class F8_BinFile
{
    public static void main(String[] args)
    {
        String sor;
        int index = 1;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/gimesi_second/Second_zh/file_binary/F8_BinFile.java"));
            RandomAccessFile file = new RandomAccessFile("Generated/Adatok.txt","rw");
            while ((sor = reader.readLine())!=null){
                file.writeBytes(index +". sor: " + Integer.toString(karakterek(sor))+ '\n');
            }

        }catch (IOException e){
        }

        try{
            String sor2;
            BufferedReader read = new BufferedReader(new FileReader("Generated/Adatok.txt"));
            while((sor2=read.readLine())!=null){
                System.out.println(sor2);
            }
        }catch (IOException er) {
            err.println("Olvasási Hiba!");
        }
    }

    public static int karakterek(String sor){
        int character_num = 0;
        for (int i = 0; i<sor.length();i++){
            if(sor.charAt(i)>=32 && sor.charAt(i)<=127){
                character_num++;
            }
        }
        return character_num;
    }
}
/*
Írjon  programot,  amelyben  a  main  metódus  beolvassa  e  program  forrásállományát soronként,
egy metódus segítségével megszámolja a sorban lévő számkarakterek számát.
A metódus paramétere a sort tartalmazó sztring, a visszaadott érték a karakterek száma,
amit  sorszámmal  együtt  a  main  egy  random  állományba  ír.
A  fájl  tartalmát  írja  ki  a képernyőre.
 */