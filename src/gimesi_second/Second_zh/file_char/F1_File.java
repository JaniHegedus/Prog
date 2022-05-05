package gimesi_second.Second_zh.file_char;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F1_File
{
    public static void main(String[] args)
    {
        //----------FILE WRITEING + CREATING
        try {
            try (FileWriter myWriter = new FileWriter("Generated/filename.txt")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Adjon meg egy stringet: ");
                String str = sc.next();
                myWriter.write(str);
            }

            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }

        File file = new File("Generated/filename.txt");


        int c = read(file);
        System.out.println("A kisbetűk száma: "+c);


    }

    private static int read(File file)
    {
        int charcount = 0;

        //----------FILE READING
        try {
            File myObj = new File("Generated/filename.txt");
            try (Scanner myReader = new Scanner(myObj)) {

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    for (int i = 0; i < data.length(); i++) {
                        if(data.charAt(i)>='a' && data.charAt(i)<='z'){
                            charcount++;
                        }
                    }

                    //System.out.println(data);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("An error occurred.");
        }

        return charcount;
    }

}
/*
Írjon programot, amely metódus segítségével beolvassa egy szöveges állományát és meghatározza a betű karakterek számát.
A fájl megnyitását a main-ben hajtsa végre.
A metódus paramétere a fájlobjektum, a visszaadott érték a karakterek száma legyen!
Az eredményt a main írja ki.
 */