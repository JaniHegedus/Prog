package gimesi_second.Second_zh.Dolgozat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F1_Dolgozat {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Varosok.txt");
        be(file);
        out.println(max(file));
    }

    //város(str) - lélekszám(int)

    public static void be(File filename) {
        /*
        ArrayList<String> linked = new ArrayList<>();
        Scanner bill= new Scanner(System.in);
        out.println("Kérem a várost: ");
        String varos = bill.nextLine();
        int lelekszam = 0;
        while (varos != "")
        {
            if(varos == "Exit")
            {
                out.println("EXIT------->");
                break;
            }
            else
            {
                out.println("Kérem a lélekszámot: ");
                lelekszam = bill.nextInt();
                linked.add(varos+"-"+ lelekszam+"\n");
                out.println("Kérem a várost: ");
                varos=bill.nextLine();
            }

        }

        try
        {
            try (FileWriter tartalom = new FileWriter(filename)
            {

                for (String elem : linked)
                {
                    out.println(elem+"\n");
                    tartalom.append(elem+"\n");
                }

                String string = "";


                out.println("Successfully wrote to the file.");
            }
        }
        catch (Exception e)
        {
            err.println("An error occurred.");
        }*/

        try
        {
            try (FileWriter myWriter = new FileWriter("Varosok.txt")) {
                Scanner sc = new Scanner(System.in);

                String varosnev="";
                int szam;

                while(!"RÁK".equals(varosnev)){
                    System.out.println("Adjon meg egy várost: ");
                    varosnev = sc.next();
                    if(varosnev.equals("exit"))
                    {
                        out.println("Brekeke - what does the crab sayy"); //means: A kurva anyádat <3
                        out.println("WHADDARÁK"); //means: rákos monte OOooOOoOOoOOOOOOOooooooo
                        break; //mean: ki kér lápi halált?
                    }
                    System.out.println("Adjon meg a lélekszámot: ");
                    szam = sc.nextInt();
                    myWriter.write(varosnev+"-"+szam+"\n");
                }

            }
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }



    public static String max(File file)
    {
        int maxNum = 0;
        String max = "";
        try
        {
            try(Scanner reader = new Scanner(file))
            {
                while(reader.hasNextLine())
                {
                    String data = reader.nextLine();
                    String[] splitttttttting = data.split("-",2);
                    int current = Integer.parseInt(splitttttttting[1]);

                    if(max == null || maxNum < current){
                        maxNum = current;
                        max = splitttttttting[0]+" - "+splitttttttting[1];
                    }
                }
            }
        }
        catch (FileNotFoundException error)
        {
            out.println("File not found error occurred.");
        }
        return max;
    }


}
/*
        Készítsen programot, amely metódus segítségével magyar városneveket,
        valamint a lakosok számát (tetszőleges végjelig) beolvas a billentyűzetről,
        és egy szöveges állományba elmenti azokat.
        (A metódus paramétere a fájlobjektum.)
        Egy másik metódus segítségével egyesével beolvassa az előző állományból a neveket
        és a lélekszámot, azokat kiírja a képernyőre, közben meghatározza a legnagyobb lélekszámú várost.
        A metódus paramétere a fájlobjektum, a visszaadott érték a legnépesebb város neve,
        amit a main ír ki.
*/
