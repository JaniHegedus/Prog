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
public class F6_Osztalyok {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérek egy számot: ");
        int a = billentyu.nextInt();
        out.print("Kérek egy számot: ");
        int b = billentyu.nextInt();
        out.print("Kérek egy számot: ");
        int c = billentyu.nextInt();
        out.printf("A %d. szám a nagyobb\n ",nagyobb(a,b,c));
    }
    private static int nagyobb(int a, int b, int c)
    {
        if (a>b&&a>c)
        {
            return 1;
        }
        else if (b>a&&b>c)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }
}
