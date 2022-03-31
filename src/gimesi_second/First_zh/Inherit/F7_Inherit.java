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
public class F7_Inherit {
    public static void main(String[] args)
    {
        Scanner billentyu = new Scanner(System.in);
        HHenger henger = new HHenger();
        henger.beolvas(billentyu);
        henger.felszín();
        henger.terfogat();
    }
}
class Henger
{
    protected int r,m;
    public void beolvas(Scanner billentyu)
    {
        out.print("Kérem a henger sugarát: ");
        r = billentyu.nextInt();
        out.print("Kérem a henger magasságát: ");
        m = billentyu.nextInt();
    }
    public void felszín()
    {
        float felszín=(float) (2*r*r*3.14+2*r*3.14*m);
        out.printf("Felszín: %.02f\n", felszín);
    }
}
class HHenger extends Henger
{
    public void terfogat()
    {
        float terfogat=(float) (r*r*3.14*m);
        out.printf("Térfogat: %.02f \n", terfogat);
    }
}