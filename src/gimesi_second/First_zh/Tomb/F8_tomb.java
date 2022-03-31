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
public class F8_tomb {
    public static void main(String args[]) {
        Scanner billentyu = new Scanner (System.in);
        LinkedList<Integer> eletkor = new LinkedList<>();
        out.print("Kérek egy életkort: ");
        int kor = billentyu.nextInt();
        while(kor!=0 || kor>100)
        {
            eletkor.add(kor);
            out.print("Kérek egy életkort: ");
            kor = billentyu.nextInt();
        } 
        for (int i=0;i<eletkor.size();i++)
        {
            out.printf("%d. ember ",i+1);
            if (eletkor.get(i)%10==0) out.println("Gratulálunk");
            else if (eletkor.get(i)<30 && eletkor.get(i)>=1) out.println("Fiatal");
            else if (eletkor.get(i)<60 && eletkor.get(i)>=31) out.println("Középkorú");
            else if (eletkor.get(i)<100 && eletkor.get(i)>=61) out.println("Idős");
            else out.println("Hibás életkor. ");
            
        }
    }
}
