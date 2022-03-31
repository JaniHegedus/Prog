package gimesi_second.Second_zh.file_binary;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.err;
import static java.lang.System.out;
public class File_Random_1 
{ 
    public static void main(String[] args) 
    { 
        int szam;
        try
        {
            try (RandomAccessFile file = new RandomAccessFile("Teszt.txt", "rw")) {
                for(int i = 48; i <= 57; i++) file.write(i);
                file.seek(0); out.println(file.read());
                file.skipBytes(2); out.println(file.read());
                out.println("Aktuális pozició: " + file.getFilePointer());
            } 
        } 
        catch (IOException error)
        {
            err.println("Fájl hiba - " + error.getMessage()); 
        } 
    } 
} 