/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Láncolt_Lista {
    public static void main(String[] args) 
    {
        Scanner bill = new Scanner (System.in);
        Lista lista = new Lista();
        lista.feltölt(bill);      //Rendezett feltöltés 
        lista.kiír();        //Kiírás 
    
    }  
}
class Lista
{ 
    class OB_def
    {
        public Integer azon;
        public String nev;
        public Float fizetes;
    } 
    LinkedList<OB_def> adatok = new LinkedList<>();
    public void feltölt(Scanner bill)
    { 
        int i; OB_def OB = new OB_def();
        out.printf("Kérem az azonosítót: ");
        OB.azon = bill.nextInt();
        while(OB.azon!=0)
        {
            out.printf("Kérem a nevet: ");
            OB.nev = bill.next();
            out.printf("Kérem a fizetést: ");
            OB.fizetes = bill.nextFloat();
            for(i=0; i<adatok.size(); i++)
            { 
                if(adatok.get(i).azon > OB.azon)
                {
                    adatok.add(i, OB); break; 
                } 
            } 
            if( i == adatok.size())adatok.add(OB);
            OB = new OB_def();
            out.printf("Kérem az azonosítót: ");
            OB.azon = bill.nextInt();
        }
        out.println(OB);
    } 
    public void kiír()
    {
        for(int i = 0; i < adatok.size(); i++) out.printf("%10d %20s %10.2f\n",adatok.get(i).azon, adatok.get(i).nev, adatok.get(i).fizetes); 
    } 
} 
