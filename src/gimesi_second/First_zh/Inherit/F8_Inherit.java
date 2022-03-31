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
public class F8_Inherit {
    public static void main(String[] args)
    {
        Halmazall fok = new Halmazall();
        Scanner billentyu = new Scanner (System.in);
        fok.beolvas(billentyu);
        fok.kiir();
        out.printf("%s halmazállapotú a víz!\n ", fok.halmazallapot());
        
    }
}
class Hom
{
    protected static int a;
    public void beolvas(Scanner billentyu)
    {
        out.print("Kérek egy hőmérsékletet: ");
        a = billentyu.nextInt();
    }
    public void kiir()
    {
        out.printf("%d °C-on ", a);
    }
}
class Halmazall extends Hom
{
    public static String halmazallapot()
    {
        if (a<=0)
        {
            return "jég";
        }
        else if (a>0&&a<100)
        {
            return "folyékony";
        }
        else
        {
            return "gőz";
        }
    }
}