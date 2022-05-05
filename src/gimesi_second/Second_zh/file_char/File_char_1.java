package gimesi_second.Second_zh.file_char;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
public class File_char_1 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            try (FileReader be = new FileReader("Generated/fájl.txt"))
            { 
                int c; 
                out.println(be.getEncoding());
                //Kiírjuk a fájl kódolását. 
                while ((c = be.read()) != -1) 
                { 
                    out.print((char)c); 
                }
            be.close(); 
            }
        } 
        catch (IOException error)
        { 
            err.println(error.getMessage()); 
        } 
    }
}