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
public class F9_Osztalyok {
    public static void main(String[] args) 
    { 
        //Tegla t = new Tegla();
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a karaktersort: ");
        String a = billentyu.nextLine();
        out.print("Kérem a keresett karaktert: ");
        char b = billentyu.next().charAt(0);
        out.printf("A keresett karakter helye a szövegben %d. \n", kereses(a,b));
    }
    private static int kereses(String a,char b)
    {
        for (int i=0;i<a.length();i++)
        {
            if (a.charAt(i)==b)
            {
                return i+1;
            }
        }
        return 0;
    }        
}
