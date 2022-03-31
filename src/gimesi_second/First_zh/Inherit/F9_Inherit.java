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
public class F9_Inherit {
    public static void main(String[] args)
    {
        Scanner billentyu = new Scanner (System.in);
        METODUSOK tegla = new METODUSOK(billentyu);
        out.printf("C: %d\n", tegla.geta());
        out.printf("C: %d\n", tegla.getb());
        out.printf("C: %d\n", tegla.getc());
        tegla.felszin();
        tegla.terfogat();
    }
}
class Teglatest1
{
    protected int a,b,c;
    public Teglatest1(Scanner billentyu)
    {
        out.print("Kérem a téglatest a oldalát: "); this.a = billentyu.nextInt();
        out.print("Kérem a téglatest b oldalát: "); this.b = billentyu.nextInt();
        out.print("Kérem a téglatest c oldalát: "); this.c = billentyu.nextInt();
    }
    public int geta()
    {
        return a;
    }
    public int getb()
    {
        return b;
    }
    public int getc()
    {
        return c;
    }
}
class METODUSOK extends Teglatest1
{

    public METODUSOK(Scanner billentyu) {
        super(billentyu);
    }
    public void felszin()
    { 
        out.printf("A felszín: %d \n", (2*a*b+2*a*c+2*b*c));
    }
    public void terfogat()
    {
        out.printf("A térfogat: %d \n", (a*b*c));
    }
} 