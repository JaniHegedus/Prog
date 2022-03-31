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
public class F2_Osztalyok 
{
    static Scanner billentyu = new Scanner (System.in);
    public static void main(String[] args) 
    { 
        out.printf("A szám karakterek száma :%d\n",karakterek());
    }
    private static int karakterek()
    {
        int db=0;
        out.println("Kérek egy karaktersort: ");
        String karaktersor = billentyu.next();
        out.println("A beírt karaktersor: " + karaktersor +"\n\n");
        for (int i=0;i<karaktersor.length();i++)
        {
            out.printf("%c ", karaktersor.charAt(i));
            char karakter = karaktersor.charAt(i);
            if (karakter>='0'&&karakter<='9')
            {
                db++;
            }
        }
        return db;
    }
}