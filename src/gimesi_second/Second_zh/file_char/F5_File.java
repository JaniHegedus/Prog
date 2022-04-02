package gimesi_second.Second_zh.file_char;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class F5_File
{
    public static void main(String[] args)
    {
        //meleg vagyok ok ooOOOOOOooooooOOOOooooOOOoOpooopOoo
        //szeretem a fitymát, rák
        //rákos FIDESZ legyek, fent a rákos hegyen
        Scanner be = new Scanner(System.in);
        try
        {
            PrintWriter ki = new PrintWriter("Dikaz.txt");
            boolean csoro = true;
            out.println("Sor szöveg:");
            String dik = be.nextLine();
            while(csoro)
            {
                if(!dik.equals(""))
                {
                    ki.println(dik);
                    out.println("Sor szöveg:");
                    dik = be.nextLine();
                }
                else
                {
                    csoro = false;
                }

            }
        }
        catch (FileNotFoundException e)
        {
            err.println("Anyád");
        }
    }
}
/*
Készítsen programot, amely egy metódus segítségével sorokat olvas be a billentyűzetről
(a metódus paramétere a sort tartalmazó sztring),
majd egy másik metódus segítségével kiírja a sorokat egy szöveges állományba
(paraméterek: fájlobjektum és a sort tartalmazó sztring).
Az adatmegadás végét szabadon választhatja meg.
 */