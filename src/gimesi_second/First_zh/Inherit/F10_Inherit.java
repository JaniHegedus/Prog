/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F10_Inherit {
    public static void main(String[] args)
    {
        Scanner billentyu = new Scanner(System.in);
        magassag ember = new magassag();
        ember.bekeres(billentyu);
        out.printf("Az ember magassága: %s\n", ember.atlag_felett());
        atlag_magassag ember0 = new atlag_magassag(billentyu);
        ember0.setM(billentyu);
        out.printf("Az átlag: %d\n",ember0.getAtlag());
        out.printf("Az ember magassága: %s\n", ember0.atlag_felett());
        
    }
}
class magassag 
{
    protected static int m,atlag;
    public void bekeres(Scanner billentyu)
    {
        out.println("Kérem az ember magasságát: ");
        m = billentyu.nextInt();
        out.println("Kérem az emberek átlagmagasságát: ");
        atlag=billentyu.nextInt();
    }
    public String atlag_felett()
    {
        if(atlag>m)
        {
            return "Átlag alatti";
        }
        else if (m>atlag)
        {
            return "Átlag feletti";
        }
        else return "Átlagos";
    }
}
class atlag_magassag extends magassag
{
    public atlag_magassag(Scanner billentyu)
    {
        out.println("Kérem az átlagmagasságot: ");
        atlag=billentyu.nextInt();
    }

    public int getAtlag() {
        return atlag;
    }

    public void setM(Scanner bill) {
        out.println("Kérem az ember magasságát: ");
        magassag.m = bill.nextInt();
    }
    
}