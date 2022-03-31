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
public class F9_tomb {
    public static void main(String args[]) 
    {
        Scanner billentyu = new Scanner (System.in);
        ArrayList<Integer> szulevek = new ArrayList<>();
        out.print("Kérek egy Szültési évet: ");
        int szulev = billentyu.nextInt();
        while(szulev!=0)
        {
            szulevek.add(szulev);
            out.print("Kérek egy Szültési évet: ");
            szulev = billentyu.nextInt();
        } 
        for (int i=0;i<szulevek.size();i++)
        {
            int kor = 2022-szulevek.get(i);
            if (kor>=0){
                out.printf("Az %d. ember kora: ",i+1);
                out.printf("%d\n",kor);
            }
            else {
                out.println("Hibás Születési év.");
            }
                
        }
    }
}
