/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gimesi_second.first_zh.Dolgozat;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Hegedüs_János {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner billentyu = new Scanner(System.in);
        Osztalyzatok elem = new Osztalyzatok();
        elem.beolvasas(billentyu);
        elem.kiír();
        out.printf("Az átlag: %.02f\n",elem.atlag());
        konstruktor0 elem0 = new konstruktor0(billentyu);
        out.printf("Az átlag: %.02f\n",elem0.atlag());
    }
}
class Osztalyzatok{
    private static final int M=100;
    private int len;
    protected static final int tomb[]=new int[M];
    public void beolvasas(Scanner billentyu) 
    {
        int i=0;
        boolean igaz=true;
        while(igaz)
        {
            out.printf("Kérem az %d. osztályzatot: ",i+1);
            tomb[i]=billentyu.nextInt();
            if (tomb[i]==0) igaz=false;
            i++;
        }
        len=i-1;
    }
    public void kiír() 
    {
        for (int i = 0; i < len; i++) 
        {
            out.printf("%d. elem: %d\n",i+1, tomb[i]);
        }
    }
    public float atlag() {
        int osszeg=0;
        int db=0;
        for (int i = 0; i < tomb.length; i++) 
        {
            if(tomb[i]==0) break;
            osszeg+=tomb[i];
            db++;
        }
        float atlag = (float)osszeg/(float)db;
        return atlag;
    }
}
class konstruktor0 extends Osztalyzatok{
    public konstruktor0(Scanner billentyu)
    {
        int i=0;
        boolean igaz=true;
        while(igaz)
        {
            out.printf("Kérem a %d. osztalyzatot: ",i+1);
            tomb[i]=billentyu.nextInt();
            if (tomb[i]==0) igaz=false;
            i++;
        }
    }  
}
