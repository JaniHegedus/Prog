/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Tomb;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F4_tomb {
    public static void main(String args[]) 
    {
        int MIX =3;
        int j=1;
        int[] v= new int[MIX];
        Scanner billentyu = new Scanner (System.in);
        int[] array = new int [MIX];
        for(int i=0; i<MIX; i++)
        {
            if (j<=3)
            {
                out.printf("Kérem az %d. oldalt:", j);
                array[i] = billentyu.nextInt();
                j++;
            }
            else
            {
                j=1;
                out.printf("Kérem az %d. oldalt:", j);
                array[i] = billentyu.nextInt();
            }
        } 
        for(int i=0; i<MIX; i++)
        {
            for(int f=0;f<MIX;f++)
            {
                v[f]=array[i]*array[i+1]*array[i+2];
                i+=2;
            }
        }
        for (int i=0;i<MIX;i++)
        {
            out.printf("%d. Kocka térfogata:",i);
            out.printf("%d\n",v[i]);
        }
    }
}
