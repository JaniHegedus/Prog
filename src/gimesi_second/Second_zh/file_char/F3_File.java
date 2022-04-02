package gimesi_second.Second_zh.file_char;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F3_File
{
    public static void main(String[] args) {

        create();
        File file = new File("filename.txt");

        //----------FILE READING
        try {
            //file = new File("file.txt");
            try (Scanner myReader = new Scanner(file)) {

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data+" - "+count(data)+"db");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("An error occurred.");
        }

    }

    public static void create()
    {
        try {
            try (FileWriter myWriter = new FileWriter("filename.txt")) {
                Scanner sc = new Scanner(System.in);

                String str = "";
                while(!"exit".equals(str)){
                    System.out.println("Adjon meg egy stringet: ");
                    str = sc.next();
                    if(str.equals("exit")){
                        System.out.println("BREKE");
                        break;}
                    myWriter.write(str+"\n");
                }

            }

            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static int count(String str)
    {
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            c++;
        }

        return c;
    }




}


/*
Írjon programot: a main beolvassa e program forrásállományát soronként,
egy metódus segítségével megszámolja az egy sorban lévő karakterek számát.
A metódus paramétere a sort tartalmazó sztring, az értéke a karakterek száma!
Az eredményeket, a main írja ki
 */
