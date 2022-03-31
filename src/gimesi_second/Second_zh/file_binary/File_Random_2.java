package gimesi_second.Second_zh.file_binary;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.err;
import static java.lang.System.out;
public class File_Random_2 
{ 
    public static void main(String[] args) 
    { 
        int kód;
        RandomAccessFile file = null;
        try
        {
            file = new RandomAccessFile("Teszt.txt", "rw");
            for(char c = 'A'; c <= 'Z'; c++) file.write(c);
            file.seek(0); //Vissza a fájl elejére 
            while((kód=file.read())!= -1)out.print((char) kód + " ");
            out.println();
            long poz = 2;
            while (poz < file.length())
            { 
                file.seek(poz);
                kód = file.read();
                file.seek(file.getFilePointer()-1);
                file.write(kód + 32);
                poz += 3; 
            } 
            file.seek(0);
            while((kód=file.read())!= -1)out.print((char) kód + " ");
            out.println(); 
            file.close();
        } 
        catch (IOException error)
        { 
            err.println("Fájl hiba - " + error.getMessage()); 
        } 
        finally 
        {
            try 
            { 
                if (file != null) file.close(); 
            }
            catch (IOException error) 
            { 
                err.println(error.getMessage()); 
            } 
        } 
    } 
}