/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.Second_zh.Exception;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Kivét_1 {
    public static void main(String[] args)
    { 
        final int MAX=5;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        int i =0;
        try
        {
            out.printf("Kérem az %d. számot: ", i+1);
            tomb[i] = billentyu.nextInt();
            while(tomb[i] != 0)
            { 
                i++;
                out.printf("Kérem az %d. számot: ", i+1);
                tomb[i] = billentyu.nextInt();
            }
        } 
        catch(Exception e) 
        {
            out.println("Hiba --- " + e);
        } 
    }
}
