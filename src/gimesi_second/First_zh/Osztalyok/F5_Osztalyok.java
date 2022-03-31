/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Osztalyok;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F5_Osztalyok {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a háromszög oldalát: ");
        int a = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        int b = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        int c = billentyu.nextInt();
        if(szerkesztheto(a,b,c)==true)
        {
            out.println("Szerkeszthető háromszög");
        }
        else 
        {
            out.println("Nem szerkeszthető háromszög");
        }
    }
    private static boolean szerkesztheto(int a,int b,int c)
    {
        return (a+b)>c&&(a+c)>b&&(b+c)>a;
    }
}
