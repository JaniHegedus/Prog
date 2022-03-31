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
public class F5_Inherit {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a Háromszög 3 oldalát enterrel elválasztva: ");
        Haromszog1 szog = new Haromszog1(billentyu);
        out.printf("1. oldal: %d ",szog.geta());
        out.printf("2. oldal: %d ",szog.getb());
        out.printf("3. oldal: %d\n",szog.getc());
        if (szog.szerkesztheto()) {
            out.println("Szerkeszthető háromszög!");
        } else out.println("Nem szerkeszthető háromszög!");
    }
}
class Haromszog0
{
    protected int a,b,c;
    public void beolvas(Scanner billentyu)
    {
        out.print("Kérem a háromszög oldalát: ");
        a = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        b = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        c = billentyu.nextInt();
        
    }
    public boolean szerkesztheto()
    {
        return (a-b)<c&&(a-c)<b&&(b-c)<a;
    }
}
class Haromszog1
{
    protected int a,b,c;
    public Haromszog1(Scanner billentyu)
    {
        this.a = billentyu.nextInt();
        this.b = billentyu.nextInt();
        this.c = billentyu.nextInt();
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

    public boolean szerkesztheto()
    {
        return (a+b)>c&&(a+c)>b&&(b+c)>a;
    }
}