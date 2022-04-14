package gimesi_second.Second_zh.file_char;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class F4_File
{
    public static void main(String[] args)
    {
        File file = new File("Generated/tartalom.txt");

        Scanner bill = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        out.println("--------A beolvasás üres karekterig történik-------\n");
        out.println("Adjon meg egy stringet");
        String a = bill.nextLine();

        while (a != "")
        {
            if(a == ""){
                out.println("EXIT------->");
            }
            else
            {
                out.println("Adjon meg egy stringet: ");
                strings.add(a);
                a = bill.nextLine();
            }
        }
        out.println("EXIT------->\n");
        kiír(strings,file);
    }



    public static void kiír(ArrayList<String> stringek,File filename)
    {
        try
        {
            try (FileWriter tartalom = new FileWriter(filename))
            {
                int db = 1;
                for (String elem : stringek)
                {
                    out.println(db + ". " + elem);
                    tartalom.append(db + ". " + elem+"\n");
                    db++;
                }

                out.println("Successfully wrote to the file.");
            }
        } catch (Exception e) {
            out.println("An error occurred.");
        }
    }
}
/*
Készítsen programot, amely a main segítségével sorokat olvas be a billentyűzetről,
majd egy metódus segítségével kiírja azokat a sorszámokkal együtt egy szöveges állományba
(a metódus paraméterei: fájlobjektum, sorszám és a sort tartalmazó sztring).
Az adatmegadás végét szabadon választhatja meg
 */