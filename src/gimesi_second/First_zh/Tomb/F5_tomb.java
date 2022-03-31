/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Tomb;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F5_tomb 
{
    public static void main(String args[]) 
    {
        Scanner billentyu = new Scanner (System.in);
        ArrayList<Integer> honapok = new ArrayList<>();
        out.print("Kérek egy honapszamot: ");
        int ho = billentyu.nextInt();
        while(ho!=0)
        {
            honapok.add(ho);
            out.print("Kérek egy honapszamot: ");
            ho = billentyu.nextInt();
        } 
        out.println(honapok);
        for (int i=0;i<honapok.size();i++)
        {
            out.printf("%d. hónap",i+1);
            switch(honapok.get(i))
            {
                case 12,1,2-> out.print(" téli ");
                case 3,4,5-> out.print(" tavaszi ");
                case 6,7,8-> out.print(" nyári ");
                case 9,10,11-> out.print(" őszi ");
                default -> out.print(" hibás ");
            }
            out.print("hónap\n");
            
        }
    }
}
