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
public class F8_Osztalyok 
{
    public static final int MAX=5;
    public static void main(String args[]) 
    {
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        //  Felt�lt�s
        for(int i=0; i<MAX; i++)
        {
            out.printf("Kérem az %d. sz�mot: ", i+1);
            tomb[i] = billentyu.nextInt();
        } 
        out.printf("Az átlag: %d\n",atlag(tomb));
    }
    private static int atlag(int[] a)
    {
        int osszeg=0;
        for (int i=0;i<MAX;i++)
        {
            osszeg+=a[i];
        }
        return osszeg/MAX;
    }
}
