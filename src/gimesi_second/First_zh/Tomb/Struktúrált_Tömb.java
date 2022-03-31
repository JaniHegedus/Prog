package gimesi_second.first_zh.Tomb;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class Struktúrált_Tömb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int i;
        Scanner bill = new Scanner (System.in);
        LinkedList<OB_def> adatok = new LinkedList<>();
        OB_def OB = new OB_def();
        //Rendezett felt�lt�s
        out.printf("K�rem az azonos�t�t: ");
        OB.azon = bill.nextInt();
        while(OB.azon!=0)
        {
            out.printf("K�rem a nevet: ");
            OB.nev = bill.next();
            out.printf("K�rem a fizet�st: ");
            OB.fizetes = bill.nextFloat();
            for(i=0; i<adatok.size(); i++)
            {
                if(adatok.get(i).azon > OB.azon)
                {
                    adatok.add(i, OB);break;
                }    
            } 
            if( i == adatok.size())adatok.add(OB);
            OB = new OB_def();
            out.printf("K�rem az azonos�t�t: ");
            OB.azon = bill.nextInt();
        } //Ki�r�s
        for(  i = 0; i < adatok.size(); i++) out.printf("%10d %20s %10.2f\n",adatok.get(i).azon, adatok.get(i).nev, adatok.get(i).fizetes);
        } 
    public static class OB_def
    {
        public Integer azon;
        public String nev;
        public Float fizetes;
    } 
}

