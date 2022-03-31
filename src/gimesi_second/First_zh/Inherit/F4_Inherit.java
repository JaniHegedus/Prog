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
public class F4_Inherit {
    public static void main(String[] args)
    {
        Scanner billentyu = new Scanner (System.in);
        Terfogat tegla = new Terfogat();
        tegla.beolvas(billentyu);
        out.printf("Felszíne: %d\t", tegla.felszin());
        out.printf("Térfogata: %d\n", tegla.terfogat());
    }
}
class Teglatest0
{
    protected int a,b,c;
    public void beolvas(Scanner billentyu)
    {
        out.print("Kérem a téglatest hosszúságát: ");
        a = billentyu.nextInt();
        out.print("Kérem a téglatest szélességét: ");
        b = billentyu.nextInt();
        out.print("Kérem a téglatest magasságát: ");
        c = billentyu.nextInt();
    }
    public int felszin()
    {
        return 2*(a*b+a*c+b*c);
    }
    
}
class Terfogat extends Teglatest0
{
    public int terfogat()
    {
        return a*b*c;
    }
}
