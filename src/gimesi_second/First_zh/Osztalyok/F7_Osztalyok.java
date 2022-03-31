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
public class F7_Osztalyok {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérek egy hőmérsékletet: ");
        int a = billentyu.nextInt();
        out.printf("A %s. halmazállapotú a víz ",halmazallapot(a));
        out.printf("%d °C-on", a);
    }
    private static String halmazallapot(int a)
    {
        if (a<=0)
        {
            return "Jég";
        }
        else if (a>0&&a<100)
        {
            return "Folyékony";
        }
        else
        {
            return "Gőz";
        }
    }
}
