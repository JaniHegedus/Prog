package gimesi_second.Second_zh.file_binary;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
public class File_binary_1 
{
    public static void main(String[] args) 
    {
        try
        {
            try (FileOutputStream out = new FileOutputStream("Generated/Teszt.bin")) {
                for(int i = 48; i <= 57; i++) out.write(i);
            }
        }
        catch (IOException error)
        {
            err.println("Írási hiba - " + error.getMessage()); 
        } 
        try 
        {
            try (FileReader in = new FileReader("Generated/Teszt.bin")) {
                int c;
                while ((c = in.read()) != -1)
                {
                    out.print((char)c + " ");
                }
                out.println();
            }
        }
        catch (IOException error)
        {
            err.println("Olvasási hiba - " + error.getMessage()); 
        } 
    } 
} 
