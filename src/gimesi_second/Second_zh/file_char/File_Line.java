package gimesi_second.Second_zh.file_char;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File_Line 
{ 
    public static void main(String[] args) 
    {
        try (Scanner out = new Scanner(new File("Generated/Fájl.txt")))
        {
            while(out.hasNext()) 
            { // Van még adat?
                System.out.println(out.nextLine());
            } 
            out.close(); 
        } 
        catch (IOException error) 
        { 
            System.err.println("Hiba: " + error.getMessage()); 
        }
    }
} 