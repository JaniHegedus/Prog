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
public class F10_tomb {
    public static void main(String args[]) {
        final int MAX=5;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        //  Felt�lt�s
        for(int i=0; i<MAX; i++)
        {
            out.printf("Kérem az %d. sugarat: ", i+1);
            tomb[i] = billentyu.nextInt();
        } 
        for (int i =0; i<MAX; i++)
        {
            //K = 2 ∙ r ∙ π
            float k = (float) (2*tomb[i]*3.14);
            out.printf("%d. kör kerülete: ", i+1);
            out.printf("%.2f\n", k);
            //T = r2 ∙ π
            float T= (float) (tomb[i]*tomb[i]*3.14);
            out.printf("%d. kör területe: ", i+1);
            out.printf("%.2f\n", T);
        }
    }
}
