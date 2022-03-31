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
public class F3_Osztalyok 
{
    static Scanner billentyu = new Scanner (System.in);
    public static void main(String[] args) 
    { 
        out.printf("A szavak száma :%d\n",szavak());
    }
    private static int szavak()
    {
        int db=0;
        out.println("Kérek egy szövegsort: ");
        String szovegsor = billentyu.nextLine();
        out.println("A beírt szövegsort: " + szovegsor +"\n\n");
        return szovegsor.split("\\s+").length;
    }
}