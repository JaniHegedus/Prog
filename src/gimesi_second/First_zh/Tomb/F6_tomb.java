/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Tomb;

import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F6_tomb {
    public static void main(String args[]) 
    {
        Scanner billentyu = new Scanner (System.in);
        LinkedList<Integer> napok = new LinkedList<>();
        out.print("Kérek egy napszámot: ");
        int nap = billentyu.nextInt();
        while(nap!=0)
        {
            napok.add(nap);
            out.print("Kérek egy napszámot: ");
            nap = billentyu.nextInt();
        }
        out.println(napok);
        for (int i=0;i<napok.size();i++)
        {
            out.printf("%d. nap",i+1);
            switch(napok.get(i))
            {
                case 1-> out.print(" hétfő ");
                case 2-> out.print(" kedd ");
                case 3-> out.print(" szerda ");
                case 4-> out.print(" csütörtök ");
                case 5-> out.print(" péntek ");
                case 6-> out.print(" szombat ");
                case 7-> out.print(" vasárnap ");
                default -> out.print(" hibás ");
            }
            out.print("nap\n");
            
        }
    }
}
