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
public class F3_tomb {
    public static void main(String args[]) {
        int MAX = 10;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        for(int i=0; i<MAX; i++)
        {
            out.printf("Kérem az %d. osztályzatot: (1-5)", i+1);
            tomb[i] = billentyu.nextInt();
        } 
        float ossz =0 ;
        for(int i=0; i<MAX; i++)
        {
            ossz=tomb[i]+ossz;
        }
        float atlag=(ossz/MAX);
        out.printf("Az osztályzatok átlaga: %.3f \n", atlag);
    }
}
